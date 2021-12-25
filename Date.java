public class Date
{
    // data fields
    private int year;
    private int month;
    private int day;

    // constructors
    public Date() { }
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // get() methods
    public int getYear()
    {
        return year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }

    // set() methods
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    // print date
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
}