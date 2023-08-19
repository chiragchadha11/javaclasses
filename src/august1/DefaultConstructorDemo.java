package august1;

public class DefaultConstructorDemo
{
    public static void main(String[] args)
    {
        Test t = new Test();

    }
}
class Test
{
    Test()
    {
        System.out.println("i am in 0 argument constructor");
    }
}