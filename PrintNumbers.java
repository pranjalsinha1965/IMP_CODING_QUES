public class PrintNumbers {
    public static void printRange(int start, int end)
    {
        if (start > end)
        {
            return;
        }
        else
        {
            System.out.println(start + " ");
        }
    }
    public static void main(String[] args)
    {
        int start = 1;
        int end = 10;
        printRange(start, end);
    }
}