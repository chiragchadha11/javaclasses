package july15_control_statements;

import java.util.Scanner;

public class Calculator
{
    public static void cal()
    {
        String user_input = "null";
        do
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number 2: ");
            int num2 = sc.nextInt();

            System.out.print("Enter the operation you want to perform (+,-,*,/,%) :");
            String operator = sc.next();
            switch (operator)
            {
                case "+": Calculator.sum(num1,num2);
                    break;
                case "-": Calculator.sub(num1, num2);
                    break;
                case "*": Calculator.multiplication(num1, num2);
                    break;
                case "/": Calculator.div(num1, num2);
                    break;
                case "%": Calculator.mod(num1, num2);
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;

            }
            System.out.println("Do you want to continue? if yes type 'y' or 'Y' or any other key to exit");
            user_input=sc.next();


        }
        while (user_input.equals("y")||user_input.equals("Y"));
    }
    public static void sum(int no1, int no2)
    {
        System.out.println(no1+no2);
    }


    public static void sub(int no1, int no2)
    {
        System.out.println(no1-no2);
    }
    public static void multiplication(int no1, int no2)
    {
        System.out.println(no1*no2);
    }
    public static void multiplication(int no1, int no2, int no3)
    {
        System.out.println(no1*no2*no3);
    }
    public static void div(int no1, int no2)
    {
        System.out.println(no1/no2);
    }
    public static void mod(int no1, int no2)
    {
        System.out.println(no1%no2);
    }

}
