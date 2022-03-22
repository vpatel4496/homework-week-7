import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any caracter: ");
        char ch = scanner.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is a alphabet. ");
        }   else if (Character.isDigit(ch)){
            System.out.println(ch + " is a digit.");
        }else{
            System.out.println(ch + " is a special character.");
        }
    }

}
