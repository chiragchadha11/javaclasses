package august19;

public class Voting
{
    int age;
    Voting()
    {

    }
    Voting(int age) throws AgeLimitException
    {
        this.age = age;
        toVote();
    }

    void toVote() throws AgeLimitException
    {
        if (age<18)
        {
            int your_age = 18-age;
            //throw new AgeLimitException();
            throw new AgeLimitException("Minimum voting age is 18 come again after: " + your_age + " years");
        }
        else
        {
            System.out.println("You can vote");
        }
    }
}
