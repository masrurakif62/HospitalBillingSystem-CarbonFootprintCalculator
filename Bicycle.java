import java.util.Objects;

public class Bicycle implements CarbonFootprint
{
    private int distance; // in miles
    private String roadType; // road or mountain

    public Bicycle(int distance, String roadType)
    {
        this.distance = distance;
        this.roadType = roadType;
    }

    public int getDistance()
    {
        return distance;
    }
    public String getRoadType()
    {
        return roadType;
    }

    public int getCarbonFootprint()
    {
        int pounds_of_c02 = 0;

        if (Objects.equals(roadType, "Road"))
        {
            pounds_of_c02 = 34 * distance;
            return pounds_of_c02;
        }
        else if (Objects.equals(roadType, "Mountain"))
        {
            pounds_of_c02 = 55 * distance;
            return pounds_of_c02;
        }
        return pounds_of_c02;
    }
}