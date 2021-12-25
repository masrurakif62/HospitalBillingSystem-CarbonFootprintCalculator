public class Bill
{
    // data fields
    private int patientID;
    private int medicineFees;
    private int doctorFees;
    private int roomFees;

    // constructor
    public Bill(int patientID, int medicineFees, int doctorFees, int roomFees)
    {
        this.patientID = patientID;
        this.medicineFees = medicineFees;
        this.doctorFees = doctorFees;
        this.roomFees = roomFees;
    }

    // get() methods
    public int getPatientID()
    {
        return patientID;
    }
    public int getMedicineFees()
    {
        return medicineFees;
    }
    public int getDoctorFees()
    {
        return doctorFees;
    }
    public int getRoomFees()
    {
        return roomFees;
    }

    // set() methods
    public void setPatientID(int patientID)
    {
        this.patientID = patientID;
    }
    public void setMedicineFees(int medicineFees)
    {
        this.medicineFees = medicineFees;
    }
    public void setDoctorFees(int doctorFees)
    {
        this.doctorFees = doctorFees;
    }
    public void setRoomFees(int roomFees)
    {
        this.roomFees = roomFees;
    }
}