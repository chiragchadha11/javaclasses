package july8_controlstatements;

import java.util.Scanner;

public class CustomeCare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to abc telecom helpline \n please select one of the following options");
        System.out.print("\n press 1 for mobile service, \n pree 2 for broadband service \n press 3 for for satellite tv and \n press 4 to talk to customer care executive : ");
        if (sc.hasNextInt())
        {
            int options = sc.nextInt();
            switch (options)
            {
                case 1:
                    System.out.println("Welcome to mobile services");
                    break;
                case 2:
                    System.out.println("Welcome to broadband services");
                    break;
                case 3: System.out.println("Welcome to satellite tv services");
                    break;
                case 4: System.out.println("will connect to next available customer support representative");
                    break;
                default:
                    System.out.println("Please enter a valid input");
            }
        }

    }
}
