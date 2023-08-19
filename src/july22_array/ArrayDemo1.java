package july22_array;

import java.util.Scanner;

public class ArrayDemo1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number of planets in solor system (hint:8): ");
        int size = sc.nextInt();
        String[] planets = new String[size];
        for (int i=0; i<planets.length; i++)
        {
            System.out.print("Enter " + (i+1) +" planet: " );
            planets[i]=sc.next();
        }
        for (int i=0; i<planets.length; i++)
        {
            System.out.println("planet " + (i+1) + " is " + planets[i]);
        }
    }
}
