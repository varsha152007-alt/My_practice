import java.util.Scanner;

class Calculator {
    int a, b;

    // Constructor
    Calculator(int num1, int num2) {
        a = num1;
        b = num2;
    }

    // Addition method
    void add() {
        System.out.println("Addition = " + (a + b));
    }

    // Subtraction method
    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    // Multiplication method
    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    // Division method
    void divide() {
        if (b != 0) {
            System.out.println("Division = " + (a / (double)b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

 class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Creating object and passing values to constructor
        Calculator c = new Calculator(num1, num2);

        // Calling methods
        c.add();
        c.subtract();
        c.multiply();
        c.divide();

        sc.close();
    }
}
