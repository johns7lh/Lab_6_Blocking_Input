import java.util.Scanner;

public class MetricConverter
{
    public static void main (String[]args)

        {
            double meters = 0;
            double miles = 0;
            double feet = 0;
            double inches = 0;
            String trash = " ";
            Scanner in = new Scanner(System.in);
            boolean done = false;

            System.out.println("Input a your measuerment in meters:");

                if (in.hasNextInt()) {
                    do {
                    meters = (in.nextInt());
                    done = true;
                    miles = meters * 0.00062137;
                    feet = meters * 3.28;
                    inches = meters * 39.3701;
                        System.out.println(meters + " meters in miles is " + miles);
                        System.out.println(meters + " meters in feet is " + feet);
                        System.out.println(meters + " meters in inches is " + inches);
                }while (!done) ;

                } else {
                    done = false;
                    trash = in.nextLine();
                    System.out.println("You told me " + trash);
                    System.out.println("Run the program again and do the input correctly");
                }


        }

}
