import java.util.Scanner;

public class FuelCost {

    public static void main (String[] args)
    {
     //The number of gallons of gas in the tank
        // The fuel efficiency in miles per gallon
        // The price of gas per gallon

        double gallon = 0;
        double fuelEfficiency = 0;
        double gallonPrice = 0;
        String trash = " ";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double costPer100 = 0;
        double milesFar = 0;

        System.out.println("Enter the number of gallons: ");

                if (in.hasNextInt()) {
                    do {
                        gallon = (in.nextInt());
                        System.out.println("Enter your fuel efficiency: ");
                        done = true;
                         } while (!done);
                }if (in.hasNextInt()) {
                 do {
                         fuelEfficiency = (in.nextInt());
                        System.out.println("Enter the gallon price: ");
                         done = true;
                    } while (!done);
                }if (in.hasNextInt()) {
                 do {
                        gallonPrice = (in.nextInt());
                         done = true;
                    } while (!done);

                            System.out.println("The price for " + gallon + "gallons is " + (gallonPrice * gallon));
                            System.out.println("The fuel efficiency for " + gallon + " gallons is " + (fuelEfficiency * gallon));
                    }else {
                            done = false;
                            trash = in.nextLine();
                            System.out.println("You told me " + trash);
                            System.out.println("Run the program again and do the input correctly");

                        }
                costPer100 = (gallonPrice / fuelEfficiency)* 100 ;
                    System.out.println("It would cost " +costPer100 + "if you traveled 100 miles");

                milesFar = fuelEfficiency * gallon;
        System.out.println("Your car can travel " + milesFar + " miles");



    }
}