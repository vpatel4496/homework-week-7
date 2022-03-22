public class Ans20 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n){
            return true;
        }
    }
        return false;
}
    public static void main(String[] args) {
        int[] my_array1 = {
                45, 15, 36, 34, 67,
                22, 78, 33, 34, 56,
                14, 65, 14, 56, 75};
        System.out.println(contains(my_array1,33));
        System.out.println(contains(my_array1,40));
    }
}
