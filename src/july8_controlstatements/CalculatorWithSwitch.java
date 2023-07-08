package july8_controlstatements;

import java.util.Scanner;

public class CalculatorWithSwitch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (sc.hasNextInt())
        {
            int first_number = sc.nextInt();
            System.out.print("Enter Second number: ");
            if (sc.hasNextInt())
            {
                int second_number = sc.nextInt();
                System.out.print("Enter the operator (+, -, *, /, %) for operation to be performed : ");

                String operator = sc.next();
                switch (operator)
                {
                    case "+" :System.out.println("result is : " + (first_number + second_number));
                        break;
                    case "-" :
                        System.out.println("result is : " + (first_number - second_number));
                        break;
                    case "*":
                        System.out.println("result is : " + (first_number * second_number));
                        break;
                    case "/":
                        System.out.println("result is : " + (first_number/second_number));
                        break;
                    case "%":
                        System.out.println("result is : " + (first_number%second_number));
                        break;
                    default:
                        System.out.println("Please enter a valid operator");
                }


            }
            else
            {
                System.out.println("Please enter a valid number");
            }
        }
        else
        {
            System.out.println("Please enter a valid number");
        }
    }
}
