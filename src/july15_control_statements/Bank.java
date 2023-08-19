package july15_control_statements;

public class Bank
{
    String account_number ="1234";
    String name = "Derek";
    float balance = 34566.00f;

    public double getBalance()
    {
        return balance;
    }
    public void getDetails()
    {
        System.out.println("Name of the Account holder: " +name);
        System.out.println("Account Number: " + account_number);
    }

    public float withdraw(float amount)
    {
        return balance-amount;
    }
    public void deposit(float amount)
    {
        System.out.println("Your updated balance is: " + (balance+amount));
    }

}
