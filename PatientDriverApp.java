/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class uses methods from Patient and Procedure Classes
 * to display full patient information as well as the associated charges
 * Due: 10/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Binyam Wodajo
*/
public class PatientDriverApp {
    public static void main(String[] args) {
        Patient patient = new Patient("a", "b", "c",
                "d", "e", "f", "g",
                "h", "i", "j");

        Procedure testProc1 = new Procedure("procedure 1", "date1", "dr juan", 0);  // Corrected parameter
        Procedure testProc2 = new Procedure("procedure 2", "date2", "dr too", 50000);  // Corrected parameter
        Procedure testProc3 = new Procedure("procedure 3", "date3", "dr tree", 1.50);  // Corrected parameter

        displayPatient(patient);

        displayProcedure(testProc1);
        displayProcedure(testProc2);
        displayProcedure(testProc3);

        double totalCharge = getTotalCharge(testProc1, testProc2, testProc3);
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharge));
    }

    private static void displayPatient(Patient patient) {
        System.out.println("Patient info:");
        System.out.println("Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("EmergencyContact: " + patient.buildEmergencyContact());
        System.out.println();
    }

    private static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure: " + procedure.getName());
        System.out.println("ProcedureDate=" + procedure.getDate());
        System.out.println("Practicioner=" + procedure.getPracName());
        System.out.println("Charge=" + String.format("%.2f", procedure.getCharges()));
    }

    private static double getTotalCharge(Procedure testProc1, Procedure testProc2, Procedure testProc3) {
        return testProc1.getCharges() + testProc2.getCharges() + testProc3.getCharges();
    }
}
