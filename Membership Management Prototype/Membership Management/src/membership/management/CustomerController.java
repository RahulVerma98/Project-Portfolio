/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership.management;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.UUID;
import javax.swing.JOptionPane;



/**
 *
 * @author Rahul Verma
 */
public class CustomerController {
    
    private static CustomerController customerController = new CustomerController();
    
    
    
    public static synchronized CustomerController getInstance(){
        return customerController;
    }
    
    
    
    String connectionURL = "jdbc:derby://localhost:1527/customer_table";
    String uName = "rahul";
    String uPass = "rahul";
    Connection conn;
    

    
    public CustomerController(){
           
        try {
            conn = DriverManager.getConnection(connectionURL, uName, uPass);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void viewCustomer(String unique_id) throws SQLException {
        // code for sql insertation.
        // sql code.
        Connection c1;
        c1 = this.conn;
        if (c1 != null) {
                Statement st = c1.createStatement();
                ResultSet rs = null;
                //retrieve the sample records from the Person table
                System.out.println("retrieve the sample records");
                System.out.println("---------------------------------");
                String sql = "SELECT * FROM CUSTOMERTABLE WHERE UNIQUEID  = ? ";
                PreparedStatement p1 = conn.prepareStatement(sql);
                p1.setString(1, unique_id);
                //p1.setInt(2, unique_id);
                rs = p1.executeQuery();
                
                
                
        }

    }

    public void addCustomer(String firstName, String lastName, String email_address, String Gender, String phone_number, String dateOfBirth, String addressLine, String City, String Postcode, String membership_type)  {
        // code for sql insertation.
        // sql code.

        UUID uuid = UUID.randomUUID();
        String randomId = uuid.toString();
        String uniqueID = randomId.substring(0, 7);
        
        
        
        Connection c1;
        c1 = this.conn;
        if (c1 != null) {
                ResultSet rs = null;
                String sql = "INSERT INTO CUSTOMERTABLE VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p1;
            try {
                p1 = c1.prepareStatement(sql);
                //p1.setString(1,num);
                p1.setString(1,uniqueID);
                p1.setString(2, firstName);
                p1.setString(3, lastName);
                p1.setString(4, email_address);
                p1.setString(5, Gender);
                p1.setString(6, phone_number);
                p1.setString(7, dateOfBirth);
                p1.setString(8, addressLine);
                p1.setString(9, City);
                p1.setString(10, Postcode);
                p1.setString(11, membership_type); 
                p1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer Added \n Id Number:" +uniqueID );
                
                
                
     
                
                System.out.println("Created the record");
                // pass 
            } catch (SQLException ex) {
                // exe - failed.
                System.out.println(ex.getMessage());
            }
            
        }
        
    }


 
    public void updateCustomer(String firstName, String lastName, String email_address, String Gender, String phone_number, String dateOfBirth, String addressLine, String City, String Postcode, String membership_type,String unique_id)  {
        // code for sql insertation.
        // sql code.
        Connection c1;
        c1 = this.conn;
        if (c1 != null) {
                ResultSet rs = null;
                String sql = "UPDATE CUSTOMERTABLE SET FIRSTNAME = ?"
                        + ",LASTNAME = ? "
                        + ",EMAIL = ? "
                        + ",GENDER = ? "
                        + ",PHONENUMBER = ? "
                        + ",DATEOFBIRTH = ? "
                        + ",ADDRESSLINE = ? "
                        + ",CITY = ? "
                        + ",POSTCODE = ? "
                        + ",MEMBERSHIP = ? "
                        + " WHERE UNIQUEID =?";
                PreparedStatement p1;
            try {
                p1 = c1.prepareStatement(sql);
                //p1.setString(1,num);
                
                p1.setString(1, firstName);
                p1.setString(2, lastName);
                p1.setString(3, email_address);
                p1.setString(4, Gender);
                p1.setString(5, phone_number);
                p1.setString(6, dateOfBirth);
                p1.setString(7, addressLine);
                p1.setString(8, City);
                p1.setString(9, Postcode);
                p1.setString(10, membership_type); 
                p1.setString(11,unique_id);
                p1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer Details Updated" );
                System.out.println("Updated the record");
                // pass 
            } catch (SQLException ex) {
                // exe - failed.
                System.out.println(ex.getMessage());
            }
        }
    }
    

    public void deleteCustomer(String unique_id) throws SQLException {
       Connection c1;
        c1 = this.conn;
        if (c1 != null) {
                ResultSet rs = null;
                String sql = "DELETE FROM CUSTOMERTABLE WHERE UNIQUEID = ?";
                PreparedStatement p1;
            try {
                p1 = c1.prepareStatement(sql);
                p1.setString(1,unique_id);
                p1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer Details Deleted" );
                System.out.println("Record is Deleted");
                // pass 
            } catch (SQLException ex) {
                // exe - failed.
                System.out.println(ex.getMessage());
            }
        }
}

    
 
    



}




    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    

