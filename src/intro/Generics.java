package intro;

public class Generics {
    // Generic method
    public static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // generic with boundary
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x;

        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    // multiple upper boundaries <T extends Number & Comparable>

    // Generic class
    static class Test<T> {
        // An object of type T is declared
        T obj;

        Test(T obj) {
            this.obj = obj;
        }

        public T getObject()  {
            return this.obj;
        }

        @Override
        public String toString() {
            return "Test{" + "obj=" + obj + '}';
        }
    }

    public static void main(String[] args) {
        // genericDisplay Integer
        genericDisplay(11);
        // genericDisplay String
        genericDisplay("Data Structure and Algorithm");
        // genericDisplay double
        genericDisplay(1.0);

        // genericDisplay instance of class Test
        genericDisplay(new Test<String>("Can Duy Cat"));

        // type parameter cannot be a primitive type
        // Reason: primitive types don't extend Object, we can't use them as type parameters
        // genericDisplay(new Test<int>(2020));
         genericDisplay(new Test<Integer>(2020));
         
        // Test generic max of threes
        System.out.printf("\n\nMax of %d, %d and %d is %d\n", 3, 4, 5, max( 3, 4, 5 ));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n", 6.6, 8.8, 7.7, max( 6.6, 8.8, 7.7 ));
        System.out.printf("Max of %s, %s and %s is %s\n","pear", "apple", "orange", max("pear", "apple", "orange"));
    }

}
