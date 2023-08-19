package july15_control_statements;

import java.util.Scanner;

public class MethodOverloadingProblem
{
    public static void getUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        getUserValue(age);
        System.out.print("Enter your salary: ");
        float salary = sc.nextFloat();
        getUserValue(salary);

        System.out.print("Enter your name: ");
            sc.skip("\\R?");
            String name = sc.nextLine();
            getUserValue(name);

    }
    public static void getUserValue(int age)
    {
        System.out.println("Your age is :" + age);
    }
    public static void getUserValue(String name)
    {
        System.out.println("Your name is :" + name);
    }
    public static void getUserValue(float salary)
    {
        System.out.println("Your salary is :" + salary);
    }
}
