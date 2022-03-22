import java.util.Arrays;

public class Ans17 {
    public static void main(String[] args){

        int[] my_array1 = {
                45, 15, 36, 34, 67,
                22, 78, 33, 34, 56,
                14, 65, 14, 56, 75};

        String[] my_array2 = {
                "United Kingdom",

                "France",
                "Spain",
                "Italy",
                "Germany",
                "Poland"
        };
        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}








