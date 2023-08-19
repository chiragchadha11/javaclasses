package august19;

import java.util.Scanner;

public class ExceptionDemo
{
    static int [] arr;
    static int array_size;

    static void arrayInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of an array: ");
        array_size = sc.nextInt();
        arr = new int[array_size];
        for (int i=0; i>array_size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args)
    {
        arrayInput();
        try
        {
            System.out.println(arr[1]);
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("hello1");
            e.printStackTrace();
            System.out.println("hello2");
        }
        finally
        {
            System.out.println("code after catching exception");

        }

    }
}
