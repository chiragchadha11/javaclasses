package july8_controlstatements;

import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        if (sc.hasNextInt()) {
            int first_number = sc.nextInt();
            System.out.print("enter second number: ");
            if (sc.hasNextInt()) {
                int second_number = sc.nextInt();
                System.out.print("enter 1 for +, 2 for -, 3 for *, 4 for / and 5 for%");
                if (sc.hasNextInt()) {
                    int operator = sc.nextInt();
                    if (operator == 1) {
                        System.out.println("result is : " + (first_number+second_number));}
                    else if (operator== 2) {
                        System.out.println("result is :  " + (first_number-second_number));}
                    else if (operator==3) {
                        System.out.println("result is :  " + (first_number*second_number));
                    } else if (operator==4) {
                        System.out.println("result is :  " + (first_number/second_number));
                    } else {
                        System.out.println("result is :  " + (first_number%second_number));
                    }
                } else {
                    System.out.println("enter a valid number");
                }
            }
            else
            {
                System.out.println("enter a valid number");

            }
        }
        else
        {
            System.out.println("enter a valid number");
        }
    }
}
