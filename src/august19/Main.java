package august19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        try {
            Voting v1 = new Voting(age);
        } catch (AgeLimitException e) {
            e.printStackTrace();
            System.err.println("Thank You ");
        }
    }
}
