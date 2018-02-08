package baekjoon;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Num1152 {

//	@Test
//	public void test() {
//		String example = "The Curious Case of Benjamin Button";
//		assertEquals(6, solution(example));
//	}
	
	private static int solution(String word) {
		if (word.isEmpty()) {
			return 0;
		}
		return word.split(" ").length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(solution(word));
		sc.close();
	}
}
