public class SumOfIntegers {
    public static int Sum(int m)
    {
        if(m == 1)
        {
            return 1;
        }
        else
        {
            return m + Sum(m-1);
        }
    }
    public static void main(String[] args)
    {
        int myNumber = 10;
        System.out.println("Sum of integers is: " + Sum(myNumber));
    }
}
