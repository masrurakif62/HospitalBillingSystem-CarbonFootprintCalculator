import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Q1
{
    public static void main(String[] args)
    {
        // take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter doctor's first name: ");
        String doctorFN = input.nextLine();
        System.out.print("Enter doctor's last name: ");
        String doctorLN = input.nextLine();
        System.out.print("Enter doctor's specialty: ");
        String doctorSpecialty = input.nextLine();
        System.out.print("Enter patient's first name: ");
        String patientFN = input.nextLine();
        System.out.print("Enter patient's last name: ");
        String patientLN = input.nextLine();
        System.out.print("Enter patient's ID: ");
        int patientID = input.nextInt();
        System.out.println();

        // create names for doctor and patient
        Person person1_patient = new Person(patientFN, patientLN);
        Doctor doctor1 = new Doctor(doctorSpecialty, doctorFN, doctorLN);

        // declare date objects for the patient
        Date dateOfBirth = new Date(2000, 2, 27);
        Date admitDate = new Date(2021, 11, 29);
        Date dischargeDate = new Date(2021, 11, 30);

        // declare patient
        Patient patient1 = new Patient(patientID, doctor1.getFirstName(), doctor1.getLastName());
        patient1.setDOB(dateOfBirth);
        patient1.setAdmitDate(admitDate);
        patient1.setDischargeDate(dischargeDate);

        // declare bills
        Bill bill1 = new Bill(patient1.getPatientID(), 500, 250, 125);

        // print results
        System.out.println("Patient's first name: " + person1_patient.getFirstName());
        System.out.println("Patient's last name: " + person1_patient.getLastName());
        System.out.println("Attending Physician: " + patient1.getFirstName() + " " + patient1.getLastName()
                + " " + doctor1.getSpecialty());
        System.out.println("Admit Date: " + admitDate.toString());
        System.out.println("Discharge Date: " + dischargeDate.toString());

        System.out.println();

        System.out.println("Medicine charges: $" + bill1.getMedicineFees());
        System.out.println("Room charges: $" + bill1.getRoomFees());
        System.out.println("Doctor's fees: $" + bill1.getDoctorFees());
        System.out.println("Total charges: $" + (bill1.getMedicineFees() + bill1.getRoomFees() + bill1.getDoctorFees()));

        // create and write to text file
        String pathname = person1_patient.getFirstName() + person1_patient.getLastName() + ".txt";
        try
        {
            FileWriter writer1 = new FileWriter(pathname);
            writer1.write("Patient's first name: " + person1_patient.getFirstName());
            writer1.write("\n");
            writer1.write("Patient's last name: " + person1_patient.getLastName());
            writer1.write("\n");
            writer1.write("Attending Physician: " + patient1.getFirstName() + " " + patient1.getLastName()
                    + " " + doctor1.getSpecialty());
            writer1.write("\n");
            writer1.write("Admit Date: " + admitDate.toString());
            writer1.write("\n");
            writer1.write("Discharge Date: " + dischargeDate.toString());
            writer1.write("\n");
            writer1.write("\n");
            writer1.write("Medicine charges: $" + bill1.getMedicineFees());
            writer1.write("\n");
            writer1.write("Room charges: $" + bill1.getRoomFees());
            writer1.write("\n");
            writer1.write("Doctor's fees: $" + bill1.getDoctorFees());
            writer1.write("\n");
            writer1.write("Total charges: $" + (bill1.getMedicineFees() + bill1.getRoomFees() + bill1.getDoctorFees()));
            writer1.close();
        }
        catch (IOException ex)
        {
            System.out.println("An error occurred.");
        }
    }
}