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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class CustomerController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        CustomerController expResult = null;
        CustomerController result = CustomerController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewCustomer method, of class CustomerController.
     */
    @Test
    public void testViewCustomer() throws Exception {
        System.out.println("viewCustomer");
        String unique_id = "";
        CustomerController instance = new CustomerController();
        instance.viewCustomer(unique_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class CustomerController.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String firstName = "";
        String lastName = "";
        String email_address = "";
        String Gender = "";
        String phone_number = "";
        String dateOfBirth = "";
        String addressLine = "";
        String City = "";
        String Postcode = "";
        String membership_type = "";
        CustomerController instance = new CustomerController();
        instance.addCustomer(firstName, lastName, email_address, Gender, phone_number, dateOfBirth, addressLine, City, Postcode, membership_type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerController.
     */
    @Test
    public void testUpdateCustomer() {
        System.out.println("updateCustomer");
        String firstName = "";
        String lastName = "";
        String email_address = "";
        String Gender = "";
        String phone_number = "";
        String dateOfBirth = "";
        String addressLine = "";
        String City = "";
        String Postcode = "";
        String membership_type = "";
        String unique_id = "";
        CustomerController instance = new CustomerController();
        instance.updateCustomer(firstName, lastName, email_address, Gender, phone_number, dateOfBirth, addressLine, City, Postcode, membership_type, unique_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerController.
     */
    @Test
    public void testDeleteCustomer() throws Exception {
        System.out.println("deleteCustomer");
        String unique_id = "";
        CustomerController instance = new CustomerController();
        instance.deleteCustomer(unique_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
