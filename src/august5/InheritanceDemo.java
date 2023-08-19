package august5;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        JavaLang ob = new JavaLang("OOPs",1995);
        //ob.language_type="OOPs";
        //ob.year_introduce = 1995;
        ob.typeOfLang();
        ob.begin();
        ob.operations();
    }
}
class ProgrammingLanguage
{
    String language_type = "oops";
    int year_introduce;

    public ProgrammingLanguage(String language_type, int year_introduce) {
        this.language_type = language_type;
        this.year_introduce = year_introduce;
    }

    void typeOfLang()
    {
        System.out.println("this language is based on: " + language_type);
    }

    void begin()
    {
        System.out.println("this language was introduce in: " + year_introduce);
    }


}
class JavaLang extends ProgrammingLanguage
{
    public JavaLang(String language_type, int year_introduce) {
        super(language_type, year_introduce);
        this.language_type = language_type;
    }

    String language_type = "functional";
    void operations()
    {
        System.out.println("i am in Java class");
        System.out.println(super.language_type);
    }
}

