/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership.management;

/**
 *
 * @author Rahul Verma
 */
public class Customer {
	int u_id = 0;
	String first_name = "";
	String last_name = "";
	String email = "";
	String gender = "";
	int phone = 0;
	String dob = "";
	String address_line = "";
	String city = "";
	String postcode = "";
	String membership = "";

	public Customer() {
		throw new UnsupportedOperationException();
	}

    Customer(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

        public int getU_ID() {
		return u_id;
	}

	public void setU_ID(int unique_id) {
		u_id = unique_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		last_name = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email_address) {
		email = email_address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String Gender) {
		gender = Gender;
	}

	public int getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(int phone_number) {
		phone = phone_number;
	}

	public String getDOB() {
		return dob;
	}

	public void setDOB(String dateOfBirth) {
		dob = dateOfBirth;
	}

	public String getAdressLine() {
		return address_line;
	}

	public void setAddressLine(String addressLine) {
		address_line = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String City) {
		city = City;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String Postcode) {
		postcode = Postcode;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership_type) {
		membership =  membership_type;
	}
}