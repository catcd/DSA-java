package intro;

import java.util.List;

public class ArrayListLoop {

    public static void main(String[] args) {
        List<String> animals = List.of("cat", "dog", "crocodile", "worm");

        // SV nam nhat
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println();

        // SV nam hai
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        // Idol gioi tre
        animals.forEach(animal -> System.out.println(animal));
        System.out.println();

        // Idol gioi tre hoc lop thay Cat
        animals.forEach(System.out::println);
    }
}
