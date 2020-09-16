package intro.java8;

import java.util.Optional;

public class OptionalDemo {

	static class NormalStudent {
		private String name;
		private String pet;
		private String phone;

		public NormalStudent(String name, String pet, String phone) {
			this.name = name != null ? name : "a normal student";
			this.pet = pet;
			this.phone = phone;
		}

		public void saySomething() {
			System.out.println("I'm " + name);
			if (pet != null)
				System.out.println("I have a " + pet);

			if (phone != null && (phone.startsWith("+") || phone.startsWith("0")))
				System.out.println("Call me on " + phone);
		}
	}

	static class IdolStudent {
		private String name;
		private Optional<String> pet;
		private Optional<String> phone;

		public IdolStudent(String name, String pet, String phone) {
			this.name = Optional.ofNullable(name).orElse("an idol student");
			this.pet = Optional.ofNullable(pet);
			this.phone = Optional.ofNullable(phone);
		}

		public void saySomething() {
			System.out.println("I'm " + name);
			pet.ifPresent(p -> System.out.println("I have a " + p));
			phone.filter(p -> p.startsWith("+") || p.startsWith("0"))
					.map(p -> "Call me on " + p)
					.ifPresent(System.out::println);
		}
	}

	public static void main(String[] args) {
		new NormalStudent(null, null, null).saySomething();
		System.out.println();
		new NormalStudent("CatCD", "cat", "0919 950 914").saySomething();

		System.out.println("\n\n");

		new IdolStudent(null, null, null).saySomething();
		System.out.println();
		new IdolStudent("CanhND", "ny", "+84 19 95 1115").saySomething();
	}
}
