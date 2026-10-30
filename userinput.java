import java.util.Scanner;

class Person {
    String name;
    int age;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class Main {
    public static void main(String[] args) {
        Person p = new Person();

        p.getInput();
        p.display();
    }
}
