import java.util.Scanner;

public class RectangleInfo
{
    public static void main (String[] args) {
        double width = 0;
        double height = 0;
        String trash = " ";
        Scanner in = new Scanner(System.in);
        boolean done = false;


        System.out.println("Enter the width of the rectangle: ");
        if (in.hasNextInt()) {
            do {
                width = (in.nextInt());
                done =true;
            } while (!done);
        }

        System.out.println("Enter the height of the rectangle: ");
        if (in.hasNextInt()) {
            do {
                height = (in.nextInt());
                done = true;
            } while (!done);
            System.out.println("The area of the rectangle is " + width * height);
            System.out.println("The diagonal of the rectangle is " + Math.sqrt(width * width + height * height));
        }else{
            done = false;
            trash = in.nextLine();
            System.out.println("You told me " + trash);
            System.out.println("Run the program again and do the input correctly");

        }



    }
}
