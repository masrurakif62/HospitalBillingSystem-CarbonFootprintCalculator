public class Car implements CarbonFootprint
{
    private int gallons; // amount of gallons used

    public Car(int gallons)
    {
        this.gallons = gallons;
    }

    public int getGallons()
    {
        return gallons;
    }

    public int getCarbonFootprint()
    {
        int pounds_of_c02 = 20 * gallons;
        return pounds_of_c02;
    }
}