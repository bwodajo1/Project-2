/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class represents information about the patient
 * Due: 10/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Binyam Wodajo
*/
public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone;
	//no arg constructor
	public Patient() {
		
	}
	/**
	 * Constructor to initialize patients name
	 * @param FirstName
	 * @param MiddleName
	 * @param LastName
	 */
	public void Pateint(String FirstName, String MiddleName, String LastName) {
		firstName = FirstName;
		middleName = MiddleName;
		lastName = LastName;
	}
	/**
	 * Constructor to initialize full patient info.
	 * @param FirstName
	 * @param MiddleName
	 * @param LastName
	 * @param StreetAddress
	 * @param City
	 * @param State
	 * @param ZipCode
	 * @param PhoneNumber
	 * @param EmergencyContactName
	 * @param EmergencyContactPhone
	 */
	public Patient(String FirstName, String MiddleName, String LastName,
			String StreetAddress, String City, String State, String ZipCode,
			String PhoneNumber, String EmergencyContactName, String EmergencyContactPhone) {
		firstName = FirstName;
		middleName = MiddleName;
		lastName = LastName;
		streetAddress = StreetAddress;
		city = City;
		state = State;
		zipCode = ZipCode;
		phoneNumber = PhoneNumber;
		emergencyContactName = EmergencyContactName;
		emergencyContactPhone= EmergencyContactPhone;	
	}
	//Accessor methods
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getstreetAddress() {
		return streetAddress;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	/**
	 * Build full name of the patient 
	 * @return Full Name
	 */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
    /**
     * Build full address
     * @return Full address
     */
    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }
    /**
     * Build full emergency contact info
     * @return Emergency contact info
     */
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }
    /**
     * Builds full patient information
     */
    public String toString() {
        return "Patient Information:\n" +
               "Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
	

}
