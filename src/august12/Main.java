package august12;

public class Main {
    public static void main(String[] args) {
        Car ob = new Car() {
            @Override
            public void show() {
                System.out.println("hello");
            }
        };
    }
}
