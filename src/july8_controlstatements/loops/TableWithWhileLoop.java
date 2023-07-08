package july8_controlstatements.loops;

public class TableWithWhileLoop
{
    public static void main(String[] args)
    {
        int table = 2;
        int counter = 1;
        while (counter!=11)
        {
            System.out.println(table + " * " + counter + " = " + (table*counter));
            counter++;
        }
    }

}
