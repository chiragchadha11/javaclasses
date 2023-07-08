package july8_controlstatements;

import java.util.Scanner;

public class AddressFinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("welcome to location finder....\nplease enter the name of the place for which you want to know the address (pragra, cn tower, aquarium): ");
        String place_name = sc.nextLine();
        switch (place_name)
        {
            case "pragra":
                System.out.println("address for pragra : 110 Matheson Blvd W #160, Mississauga, ON L5R 4G7");
                break;
            case "cn tower":
                System.out.println("address for cn tower : 290 Bremner Blvd, Toronto, ON M5V 3L9 ");
                break;
            case "aquarium":
                System.out.println("address for aquarium : 288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;
            default:
                System.out.println("plese enter a valid name of the place");
        }

    }
}
