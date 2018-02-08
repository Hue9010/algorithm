package baekjoon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.junit.Test;

public class Num10809 {
//	@Test
//	public void test() {
//		String example = "baekjoon";
//		String answer = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1";
//		assertEquals(answer, solution(example));
//	}

	private static String solution(String example) {
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
