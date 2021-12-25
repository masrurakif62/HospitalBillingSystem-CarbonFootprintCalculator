public class Building implements CarbonFootprint
{
    private int squareFootage;

    public Building(int squareFootage)
    {
        this.squareFootage = squareFootage;
    }

    public int getSquareFootage()
    {
        return squareFootage;
    }

    public int getCarbonFootprint()
    {
        int pounds_of_c02 = (50*squareFootage) + (20*squareFootage) + (47*squareFootage) + (17*squareFootage);
        return pounds_of_c02;
    }
}