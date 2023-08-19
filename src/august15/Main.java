package august15;

public class Main
{
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner o2 = o1.new Inner();
        o2.display();
    }
}
