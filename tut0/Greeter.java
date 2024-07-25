import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        greeter();
    }

    public static void greeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome!");
        scanner.close();
    }
}

