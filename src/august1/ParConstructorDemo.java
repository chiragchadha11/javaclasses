package august1;

public class ParConstructorDemo
{
    public static void main(String[] args)
    {
        Test1 t = new Test1();
//        Test1 tt = new Test1(11);
//        Test1 ttt = new Test1(11,111);
//        Test1 tttt = new Test1(11,111,333);
//            t.show();
//            tt.show();
//            ttt.show();
//            tttt.show();

    }
}
class Test1
{
    private int no1,no2,no3;
    Test1()
    {
        this(11);
        System.out.println("i am in 0 argument constructor");
    }
    Test1(int no1)
    {
        this(11,111);
        this.no1 = no1;
        System.out.println("I am in 1 argument constructor");
    }
    Test1(int no1, int no2)
    {
        this(11,111,222);
        this.no1 = no1;
        this.no2 = no2;
        System.out.println("I am in 2 argument constructor");
    }
    Test1(int no1, int no2, int no3)
    {
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
        System.out.println("I am in 3 argument constructor");
    }
    void show()
    {
        System.out.println(no1 + " " + no2 + " " + no3);

    }
}