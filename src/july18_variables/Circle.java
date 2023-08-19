package july18_variables;

public class Circle
{
    static double pi = 3.14;
    double radius;

     static void calculateArea(double radius)
    {
        double area = pi * (radius*radius);
        System.out.println(area + " meter square");
    }

    public static void main(String[] args)
    {

        calculateArea(2);
        calculateArea(5);
    }
}
