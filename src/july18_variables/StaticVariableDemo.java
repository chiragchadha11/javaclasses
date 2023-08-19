package july18_variables;

public class StaticVariableDemo
{
    int id;
    String first_name;
    String course;
    public StaticVariableDemo(int id, String first_name, String course)
    {
        this.id = id;
        this.first_name = first_name;
        this.course = course;
    }
    public void setValue()
    {
        System.out.println(id+ " " + first_name + " " + course);


    }

    public static void main(String[] args) {
        StaticVariableDemo s = new StaticVariableDemo(101, "tony", "java");
        s.setValue();
        StaticVariableDemo s1 = new StaticVariableDemo(102, "derek", "java");
        s1.setValue();
    }
}
