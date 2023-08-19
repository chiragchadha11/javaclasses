package july25_strings;

import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = sc.nextInt();
        System.out.println("Enter the name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("number is: " + num);
        System.out.println("name is: " + name);

    }
}
