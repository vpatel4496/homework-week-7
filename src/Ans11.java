public class Ans11 {

    public static void main(String[] args) {
        System.out.print("\nDivided by 3: ");
        for (int i=1; i<100; i++){
            if (i%3==0)
                System.out.print(i +",");
        }
        System.out.print("\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0)
                System.out.print(i +",");
            System.out.print("\n");
        }

    }

}
