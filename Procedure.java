/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class represents information about the procedure
 * Due: 10/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Binyam Wodajo
*/
public class Procedure {
	private String name;
	private String date;
	private String pracName;
	private double charges;
	/**
	 * No arg constructor
	 */
	public Procedure() {
	}
	/**
	 * Initialize patient name and date
	 * @param Name Name of procedure
	 * @param Date Date of procedure
	 */
	public Procedure(String Name, String Date) {
		name = Name;
		date = Date;
	}
	/**
	 * Initialize full procedure information
	 * @param Name Name of procedure
	 * @param Date Date of procedure
	 * @param PracName Name of practitioner
	 * @param Charges Charge for the procedure
	 */
	public Procedure(String Name, String Date, String PracName,
			double Charges) {
		name = Name;
		date = Date;
		pracName = PracName;
		charges = Charges;
	}
	//Accessor methods
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getPracName() {
		return pracName;
	}
	public double getCharges() {
		return charges;
	}
	/**
	 * Builds full procedure information
	 */
	public String toString() {
		return "Procedure: " + getName() +"\n" +
				"ProcedureDate=" + getDate() + "\n" + 
				"Practicioner=" + getPracName() + "\n" +
				"Charge=" + getCharges();
	}

}
