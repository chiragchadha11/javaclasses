package august19;

public class Main {
    public static void main(String[] args) {
        int age = EnterAge.userAge();
        try {
            Voting v1 = new Voting(age);
        } catch (AgeLimitException e) {
            e.printStackTrace();
            System.err.println("Thank You ");
        }
    }
}
