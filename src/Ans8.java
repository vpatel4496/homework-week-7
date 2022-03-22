import java.util.Scanner;

public class Ans8 {
    public static void main(String[] args) {
        String a []={"Acton", "Bexley", "Chelsea", "Dartford", "Eling", "Forestgate"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first letter of city between A to F");
        String city = scan.next();
        if(city.startsWith ("A") ) {
            System.out.println(a[0]);
        }else if(city.startsWith("B")) {
            System.out.println(a[1]);
        }else if(city.startsWith("C")) {
            System.out.println(a[2]);
        }else if(city.startsWith("D")) {
            System.out.println(a[3]);
        }else if(city.startsWith("E")) {
            System.out.println(a[4]);
        }else if(city.startsWith("F")) {
            System.out.println(a[5]);
        }else{
            System.out.println("Invalid entry");
        }
    }
}
