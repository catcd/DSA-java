package sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithm {
    public static void selectionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, min, i);
        }
    }

    public static void insertionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static class Student implements Comparable<Student> {
        private String name;
        private Double gpa;

        public Student() {
        }

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        @Override
        public int compareTo(Student other) {
            if (gpa.compareTo(other.gpa) == 0) {
                return name.compareTo(other.name);
            } else {
                return gpa.compareTo(other.gpa);
            }
        }

        @Override
        public String toString() {
            return String.format("%-20s%.2f", name, gpa);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Integer[] randArray = new Random().ints(0, 100).limit(n).boxed().toArray(Integer[]::new);
        System.out.println("randArray = " + Arrays.toString(randArray));
        selectionSort(randArray);
        System.out.println("sortedArray = " + Arrays.toString(randArray));
        System.out.println();

        randArray = new Random().ints(0, 100).limit(n).boxed().toArray(Integer[]::new);
        System.out.println("randArray = " + Arrays.toString(randArray));
        insertionSort(randArray);
        System.out.println("sortedArray = " + Arrays.toString(randArray));
        System.out.println();

        Student[] studentArray = new Student[] {
                new Student("Can Duy Cat", 1.99),
                new Student("Lo Anh Duc", 4.0),
                new Student("Duong Ngan Ha", 4.0),
                new Student("Hoang Huu Tung", 3.96),
                new Student("Dang Trung Cuong", 3.69)
        };
        selectionSort(studentArray);
        System.out.println("Sorted student list");
        for (Student student: studentArray) {
            System.out.println(student);
        }
    }
}
