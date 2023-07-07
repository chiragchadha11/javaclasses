package july4selectionstatement;

import java.util.Scanner;

public class Test4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int user_input1 = sc.nextInt();
        System.out.println("Enter Second number");
        int user_input2 = sc.nextInt();
        System.out.println("Enter Third number");
        int user_input3 = sc.nextInt();


        if (user_input1>user_input2 && user_input1>user_input3)
        {
            System.out.println(user_input1 + " is greater than " + user_input2 + " and " + user_input3);
        }
        else if (user_input2>user_input1 && user_input2>user_input3)
        {
            System.out.println(user_input2 + " is greater than " + user_input1 + " and " + user_input3);

        }
        else if (user_input3>user_input1 && user_input3>user_input2)
        {
            System.out.println(user_input3 + " is greater than " + user_input1 + " and " + user_input2);

        }
        else
        {
            System.out.println("Invalid Entry or numbers are equal");
        }

    }
}
