package july29_class;

public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.setBrand_name("Tesla");
        c1.setColour("Black");
        c1.setEngine_type("Electric");

        System.out.println(c1.getBrand_name());
        System.out.println(c1.getColour());
        System.out.println(c1.getEngine_type());
        System.out.println("=================================");
        Car c2 = new  Car();
        c2.setBrand_name("Mahindra");
        c2.setColour("Black");
        c2.setEngine_type("Diesel");
        System.out.println(c2.getColour());
        System.out.println(c2.getBrand_name());
        System.out.println(c2.getEngine_type());

        System.out.println("------------------------------------");
        Laptop lp1 = new Laptop();
        //Laptop lp2 = new Laptop("Apple", "Mac OS",1400);
        //System.out.println(lp2);
        Laptop laptop = new Laptop();


    }
}
