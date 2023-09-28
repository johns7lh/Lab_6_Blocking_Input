import java.util.Scanner;

public class CtoFConvertor
{
    public static void main(String[] args)
    {

        double fahrenheit = 0;
        double celsius = 0;
        boolean done = false;
        String trash = " ";
        Scanner in = new Scanner(System.in);


            System.out.print("Enter Temperature in celsius: ");
            do {
            if (in.hasNextInt()) {
                celsius = (in.nextInt());
                done = true;
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " In fahrenheit is: " + fahrenheit);

            } else {

                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Run the program again and do the input correctly");
            }
        }while (!done);

    }


}
