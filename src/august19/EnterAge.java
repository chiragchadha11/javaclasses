package august19;

import java.util.Scanner;

public class EnterAge
{
    static int userAge()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        return age;
    }
}
