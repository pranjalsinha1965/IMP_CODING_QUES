public class SumOfArray {
    public static int sumArray(int[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            return array[index] + sumArray(array, index + 1);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sumArray(array, 0));
    }
}
