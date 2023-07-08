package july8_controlstatements.loops;

public class SumOfNaturalNo
{
    public static void main(String[] args)
    {
        int number = 1;
        int sum=0;
        while (number!=11)
        {
           sum+=number;
           number++;
        }
        System.out.println("sum of first 10 natural numbers are : " + sum );

    }
}
