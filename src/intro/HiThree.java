package intro;

public class HiThree {

    public static void main(String[] args) {
        // Example 1
        System.out.print("Hi ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");

        // Example 2
        System.out.println("Hi " + args[2] + ", " + args[1] + ", and " + args[0] + ".");

        // Example 3
        System.out.printf("Hi %s, %s, and %s.%n", args[2], args[1], args[0]);

    }
}
