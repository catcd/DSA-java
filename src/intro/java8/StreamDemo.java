package intro.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		IntStream.range(0, 10).filter(i -> i % 2 == 0).map(i -> i * i).forEach(System.out::println);

		String[] names = { "apple", "banana" };
		List<Integer> lenList = Stream.of(names).map(String::length).collect(Collectors.toList());
		System.out.println(lenList);

		Map<String, Integer> lenMap = Stream.of(names).collect(Collectors.toMap(name -> name, String::length));
		System.out.println(lenMap);

		if (args.length > 1) {
			Path path = Paths.get(args[1]);

			try (Stream<String> lines = Files.lines(path)) {
				lines.skip(1).limit(3).forEach(StreamDemo::printLine);

			} catch (IOException e) {
				System.out.println("File " + args[1] + " not found!");
			}
		}
	}

	public static void printLine(String line) {
		System.out.println(line);
	}
}
