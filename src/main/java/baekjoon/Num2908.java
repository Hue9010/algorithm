package baekjoon;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Num2908 {

//	@Test
//	public void test() {
//		String example = "734 893";
//		assertEquals(437, solution(example));
//	}

	private static int solution(String input) {
		String[] strNums = input.split(" ");
		int first = reverse(strNums[0]);
		int second = reverse(strNums[1]);
		return first > second ? first : second;
	}

	private static int reverse(String strNums) {
		String[] splits = strNums.split(""); 
		int num = Integer.parseInt(splits[0]) + Integer.parseInt(splits[1]) * 10 + Integer.parseInt(splits[2]) * 100;  
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solution(input));
		sc.close();
	}
}
