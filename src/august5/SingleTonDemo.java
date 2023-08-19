package august5;

public class SingleTonDemo
{
    public static void main(String[] args)
    {
        //Test ob = new Test();
        //System.out.println(ob); //august5.Test@1134affc
        System.out.println(Test.singleTon());
        System.out.println(Test.singleTon());

    }

}
class Test
{
    private Test()
    {

    }

    static Test singleTon()
    {
        return new Test();
    }
    
}