package july29_class;

public class Laptop
{
    private String brand_name;
    private String operating_system;
    private double price;

     Laptop()
    {
        System.out.println("I am in a 0 argument constructor");
    }
    Laptop(String brand_name, String operating_system, double price)
    {
        this.brand_name = brand_name;
        this.operating_system = operating_system;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand_name='" + brand_name + '\'' +
                ", operating_system='" + operating_system + '\'' +
                ", price=" + price +
                '}';
    }
}
