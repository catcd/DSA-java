package intro;

public class Variable {

    public static void main(String[] args) {
        double remain = 5.5 % 2.5;
        System.out.println("remain = " + remain);

        double inf1 = Double.POSITIVE_INFINITY;
        double inf2 = 1.0/0.0;
        double nan1 = Double.NaN;
        double nan2 = inf1 - inf2;
//        double inf3 = 1/0; // ERROR
        System.out.println("inf1 = " + inf1);
        System.out.println("inf2 = " + inf2);
        System.out.println("nan1 = " + nan1);
        System.out.println("nan2 = " + nan2);

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);

        int a = 5, b = 10;
        swap(a, b); // KHONG THUC HIEN DUOC
        swap(a, b); // KHONG THUC HIEN DUOC
        System.out.println(a);
        System.out.println(b);

        int iThuong = 10;
        Integer iHoa = new Integer(0);

        iHoa = iThuong; // auto boxing
        iThuong = iHoa; // auto unboxing

        iHoa = null;
    }

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = a;
    }
}
