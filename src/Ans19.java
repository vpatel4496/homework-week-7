public class Ans19 {
    public static void main(String[] args) {
        double[] arr = {3, 4, 5, 7, 9}; // Total = 28
        double total  = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.3f",average);
    }
}








