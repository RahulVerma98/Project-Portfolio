/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership.management;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rahul Verma
 */
public class CustomerControllerIT {
    CustomerController test;
    public CustomerControllerIT() {
        
    }
    
    @Before
    public void setUp() {
        test = new CustomerController();
    }
    
    @After
    public void tearDown() {
        test = null;
        
    }

    @Test
    public void testAddCustomer() {
        String firstName = "Rahul" ;
        String lastName = "V";
        String email_address = "r@gmail.com";
        String Gender = "Male";
        String phone_number = "54353" ;
        String dateOfBirth = "01Sept1998";
        String addressLine = "17 T Drive" ;
        String City = "London";
        String  Postcode = "UB0";
        String membership_type = "Silver";
        
        test.addCustomer(firstName, lastName, email_address, Gender, phone_number, dateOfBirth, addressLine, City, Postcode, membership_type);
    } 
}
