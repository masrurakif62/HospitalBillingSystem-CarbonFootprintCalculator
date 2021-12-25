public class Patient extends Person
{
    // data fields
    private int patientID;
    private Object DOB;
    private Object admitDate;
    private Object dischargeDate;

    // constructors
    public Patient() { }
    public Patient(int patientID, String firstName, String lastName)
    {
        super(firstName, lastName);
        this.patientID = patientID;
    }

    // get() methods
    public int getPatientID()
    {
        return patientID;
    }

    // set() methods
    public void setPatientID(int patientID)
    {
        this.patientID = patientID;
    }
    public void setDOB(Object DOB)
    {
        this.DOB = DOB;
    }
    public void setAdmitDate(Object admitDate)
    {
        this.admitDate = admitDate;
    }
    public void setDischargeDate(Object dischargeDate)
    {
        this.dischargeDate = dischargeDate;
    }

}