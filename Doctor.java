public class Doctor extends Person
{
    // data field
    private String specialty;

    // constructors
    public Doctor() { }
    public Doctor(String specialty, String firstName, String lastName)
    {
        super(firstName, lastName);
        this.specialty = specialty;
    }

    // get() method
    public String getSpecialty()
    {
        return specialty;
    }

    // set() method
    public void setSpecialty(String specialty)
    {
        this.specialty = this.specialty;
    }
}