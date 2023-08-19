package july15_control_statements;

public class Main
{
    public static void main(String[] args)
    {
        Bank acc1 = new Bank();
        System.out.println("Account Balance is: " + acc1.getBalance());
        System.out.println("========================");
        acc1.getDetails();
        System.out.println("=========================");
        acc1.deposit(563);
        System.out.println("==========================");
        System.out.println("Updated balance is: " + acc1.withdraw(563));





        //        Calculator.cal();
//        CalculatorOverloading.multiplication(3, 4, 1);
//        MethodOverloadingProblem.getUserInput();
    }
}
