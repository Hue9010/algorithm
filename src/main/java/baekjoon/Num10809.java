package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Num10809 {

	public static String solution(String example) {
		List<String> list = Arrays.asList(example.split(""));
		List<String> alphabet = createAlphabetList();
		return alphabet.stream().map(a -> Integer.toString(list.indexOf(a))).collect(Collectors.joining(" "));
	}

	private static List<String> createAlphabetList() {
		List<String> alphabet = new ArrayList<>();
		for (int i = 97; i <= 122; i++) {
			alphabet.add(Character.toString((char) i));
		}
		return alphabet;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solution(input));
		sc.close();
	}
}
