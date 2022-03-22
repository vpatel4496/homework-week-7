import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Enter name of student: ");
        String n = in.nextLine();
        Scanner c = new Scanner(System.in);
        System.out.print ("Enter roll no of student: ");
        int r = in.nextInt();
        System.out.println("Enter mark in 1st subject English : ");
        int m1 = in.nextInt();
        System.out.print ("Enter mark in 2nd subject Maths :  ");
        int v1 = in.nextInt();
        System.out.print ("Enter mark in 3rd subject Science : ");
        int v2 = in.nextInt();
        int b = m1 + v1 + v2;
        double p = b / 300.0 * 100.0;
        String s = "";
        String a = "";

        if (p>=90)
            s = "A+";
        else if (p >= 80)
            s = "A";
        else if (p >= 70)
            s = "B+";
        else if (p >= 60)
            s = "B";
        else if (p >= 50)
            s = "c";
        else if (p >= 40)
            s = "D";
        else
            s = "E";
        if(p>=35)
            a = "Pass";
        else
            a = "Fail";
        System.out.println("___________________________");
        System.out.println("|                         |");
        System.out.println("|       Mark Sheet        |");
        System.out.println("|_________________________|");
        System.out.println("|  Name      :      " + n +" |");
        System.out.println("|  Roll No:  "+ r+"           |");
        System.out.println("|_________________________|");
        System.out.println("|  Subject   : Marks      |");
        System.out.println("|_________________________|");
        System.out.println("|  Maths     : " + v1 +"         |");
        System.out.println("|  Science   : " + v2 +"         |");
        System.out.println("|  English   : " + m1 +"         |");
        System.out.println("|_________________________|");
        System.out.println("|  Total     : " + b+"        |");
        System.out.println("|_________________________|");
        System.out.println("|  Percentage: " + p+"       |");
        System.out.println("|  Result    : " + a+"       |");
        System.out.println("|  Grade     : " + s+"          |");
        System.out.println("|_________________________|");


    }

    }










