package july15_control_statements;

public class CalculatorOverloading
{
    public static void sum(int no1, int no2, int no3)
    {
        System.out.println(no1+no2+no3);
    }
    public static void sum(int no1, int no2)
    {
        System.out.println(no1+no2);
    }
    public static void multiplication(int no1, int no2)
    {
        System.out.println(no1*no2);
    }
    public static void multiplication(int no1, int no2, int no3)
    {
        System.out.println(no1*no2*no3);
    }
}
