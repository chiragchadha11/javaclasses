package july22_array;

import java.util.Scanner;

public class ForEachDemo
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
        for (String planet_names:planets)
        {

            System.out.println(planet_names);

        }
    }
}
