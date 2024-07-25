public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0) {
            greeter(args[0]);
        } else {
            System.out.println("No name provided! Please provide a name as a command-line argument.");
        }
    }

    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! Welcome to our wonderful community. We're thrilled to have you here. " +
                           "Feel free to explore and let us know if you need any assistance. Have a fantastic day!");
    }
}
