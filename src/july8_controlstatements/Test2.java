package july8_controlstatements;

import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom to Simple Calculator");
        System.out.print("\n enter first number : ");
        if (sc.hasNextInt())
        {
            int first_number = sc.nextInt();
            System.out.print("enter second number : ");
            if (sc.hasNextInt())
            {
                int second_number = sc.nextInt();
                System.out.println("Enter operator +, -, *, /, %");
                if (sc.hasNext())
                {
                    char operator = sc.next().charAt(0);
                    if (operator=='+')
                    {
                        System.out.println("result is " + (first_number+second_number));
                    }
                    else if (operator=='-')
                    {
                        System.out.println("result is " + (first_number-second_number));
                    } else if (operator=='*')
                    {
                        System.out.println("result is " + (first_number*second_number));
                    } else if (operator=='/')
                    {
                        System.out.println("result is " + (first_number/second_number));
                    }else if (operator=='%')
                    {
                        System.out.println("result is " + (first_number%second_number));
                    }else
                    {
                        System.out.println("please enter valid operator");
                    }
                }
            }else {
                System.out.println("please enter valid number");
            }
        }else {
            System.out.println("please enter valid number");
        }


    }
}
