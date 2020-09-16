package intro;

public class Variable {

    public static void main(String[] args) {
        double remain = 5.5 % 2.5;
        System.out.println("remain = " + remain);

        double inf1 = Double.POSITIVE_INFINITY;
        double inf2 = 1.0/0.0;
        double nan = inf1 - inf2;
//        double inf3 = 1/0; // ERROR
        System.out.println("inf1 = " + inf1);
        System.out.println("inf2 = " + inf2);
        System.out.println("nan = " + nan);

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);

        int a = 5, b = 10;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = a;
    }
}
