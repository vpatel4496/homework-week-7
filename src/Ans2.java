import java.util.Scanner;

public class Ans2 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = in.nextInt();
        boolean x = (year % 4) == 0; // == Verifies both operands are equal
        boolean y = (year % 100) != 0; // != verifies if both operands are not equal
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        /* && Returns true if both operands are true or returns false if one
        operands or both are false */
        if (x && (y || z))
         /* && Returns true if one operands or both operands are true or
         returns false if both operands are false */
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");

        }
    }

}
