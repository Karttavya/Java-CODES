class Calculator {

    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum of 2 ints: " + obj.add(10, 20));

        System.out.println("Sum of 3 ints: " + obj.add(10, 20, 30));

        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 4.5));
    }
}
