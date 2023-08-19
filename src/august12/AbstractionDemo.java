package august12;

abstract class Bank
{
    abstract void deposit();
    abstract void withdrawal();
    abstract void accountMaintenanceFee();
}
class ScoitiaBank extends Bank
{

    @Override
    void deposit()
    {
        System.out.println("Fee for money deposit transaction is $3");

    }

    @Override
    void withdrawal()
    {

        System.out.println("Fee for money withdrawal transaction is $3");

    }

    @Override
    void accountMaintenanceFee()
    {
        System.out.println("Fee for account maintenance is $3.75 per month");


    }
}
class StateBankOfIndia extends Bank
{

    @Override
    void deposit()
    {
        System.out.println("Fee for money withdrawal transaction is $0");

    }

    @Override
    void withdrawal()
    {
        System.out.println("Fee for money withdrawal transaction is $0");

    }

    @Override
    void accountMaintenanceFee()
    {
        System.out.println("Fee for account maintenance is $0 per month");

    }
}
public class AbstractionDemo
{
    public static void main(String[] args)
    {
        ScoitiaBank sb = new ScoitiaBank();
        sb.accountMaintenanceFee();
        sb.deposit();
        sb.withdrawal();
        StateBankOfIndia sbi = new StateBankOfIndia();
        sbi.accountMaintenanceFee();
        sbi.deposit();
        sbi.withdrawal();
    }
}
