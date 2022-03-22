import java.util.Scanner;

public class Ans1
        {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in); // Object Creation
            System.out.println("Please enter a number : ");
            int number = sc.nextInt();
            // Convert stringBuffer to string
            String strOutput = (number % 2 == 0) ? "even": "odd";
            System.out.println(number + " is " + strOutput);
            sc.close();
        }
    }


