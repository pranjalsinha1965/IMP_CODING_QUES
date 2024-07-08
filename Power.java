public class Power {
    public static int power(int base, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }
        else 
        {
            return base * power(base, exp - 1);
        }
    }
    public static void main(String[] args)
    {
        int base = 2;
        int exp = 3;
        System.out.println(base + " raised to the power of " +exp + " is " + power(base, exp));
    }
}