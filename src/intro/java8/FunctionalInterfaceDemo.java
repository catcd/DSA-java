package intro.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceDemo {

	@FunctionalInterface
	private static interface Condition {
		boolean apply(String test);
	}

	private static List<String> getAll(List<String> list, Condition filter) {
		List<String> result = new ArrayList<>();

		for (String item : list) {
			if (filter.apply(item)) {
				result.add(item);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("cat", "dog", "crocodile", "worm");

		List<String> longAnimals = getAll(animals, new Condition() {

			@Override
			public boolean apply(String test) {
				return test.length() > 3;
			}
		});
		for (String animal : longAnimals) {
			System.out.print(animal);
		}

		System.out.println();

		List<String> longAnimals2 = getAll(animals, test -> test.length() > 3);
		for (String animal : longAnimals2) {
			System.out.print(animal);
		}

		System.out.println();

		animals.stream().filter(test -> test.length() > 3).forEach(item -> System.out.println(item));
	}
}
