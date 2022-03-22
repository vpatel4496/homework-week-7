import java.util.Scanner;

public class Ans9 {

public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter first letter of city between A to F");
    String letter = scan.next();

    switch (letter.toUpperCase()){

        case "A":
            System.out.println("Acton");
            break;
        case "B":
            System.out.println("Bexley");
            break;
        case "C":
            System.out.println("Chelsea");
            break;
        case "D":
            System.out.println("Dartford");
            break;
        case "E":
            System.out.println("Ealing");
            break;
        case "F":
            System.out.println("Forestgate");
            break;
        default:
            System.out.println("Invalid Entry");
    }

}












}
