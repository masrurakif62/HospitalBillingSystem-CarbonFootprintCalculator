public class Person
{
    // data fields
    protected String firstName;
    protected String lastName;

    // constructors
    public Person() { }
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // get() methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    // set() methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // print name
    public String toString()
    {
        return firstName + " " + lastName;
    }
}