package july8_controlstatements;

import java.util.Scanner;

public class CharSwitchCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
        System.out.print("enter first number : ");
        int number1 = sc.nextInt();
        System.out.print("enter second number : ");
        int number2 = sc.nextInt();
        System.out.print("enter the operator '+', '-', '*', '/', '%' :");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("result is : " + (number1+number2));
                break;
            case '-':
                System.out.println("result is : " + (number1-number2));
                break;
            case '*':
                System.out.println("result is : " + (number1*number2));
                break;
            case'/':
                System.out.println("result is : " + (number1/number2));
                break;
            case '%':
                System.out.println("result is : " + (number1%number2));
                break;
            default:
                System.out.println("please enter a valid operator");




        }
    }
}
