public class PrintArrayReverse {
    public static void printArrayReverse(int[] array, int index)
    {
        if (index < 0)
        {
            return;
        } else {
            System.out.print(array[index] + " ");
            printArrayReverse(array, index - 1);
        }
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        printArrayReverse(array, array.length - 1);

    }
}
