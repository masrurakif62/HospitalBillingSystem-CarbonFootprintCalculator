import java.util.ArrayList;

public class Q2
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Objects Carbon Footprint: ");
        System.out.println();

        // create new list of objects
        ArrayList<CarbonFootprint> list1 = new ArrayList<>();

        // declare each object
        Car car1 = new Car(10);
        Car car2 = new Car(20);
        Bicycle b1 = new Bicycle(100, "Road");
        Bicycle b2 = new Bicycle(100, "Mountain");
        Building bld1 = new Building(250);
        Building bld2 = new Building(150);

        // add objects into list
        list1.add(0, car1);
        list1.add(1, car2);
        list1.add(2, b1);
        list1.add(3, b2);
        list1.add(4, bld1);
        list1.add(5, bld2);

        // print out results
        printCarbonFootprint(list1);
    }

    public static void printCarbonFootprint(ArrayList<CarbonFootprint> list)
    {
        // print each object
        int total = 0;
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Pounds of CO2 for object "+ (i+1) + ": " + list.get(i).getCarbonFootprint());
            total = total + list.get(i).getCarbonFootprint();
        }

        // print total
        System.out.println();
        System.out.println("Total Carbon footprint for this session: " + total + " pounds of CO2");
        System.out.println();
    }
}
