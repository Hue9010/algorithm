package baekjoon;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Num11654 {
//	@Test
//	public void test() {
//		assertEquals(65, solution('A'));
//		assertEquals(48, solution('0'));
//	}

	private static int solution(char c) {
		return Integer.valueOf(c);
	}

	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 char c = sc.next().charAt(0);
	 System.out.println(solution(c));
	 sc.close();
	 }

}
