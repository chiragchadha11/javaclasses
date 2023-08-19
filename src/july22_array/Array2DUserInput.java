package july22_array;

import java.util.Scanner;

public class Array2DUserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns you want: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print("Enter element at " + i + j+ " position: ");
                arr[i][j] =sc.nextInt();
            }
        }
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
