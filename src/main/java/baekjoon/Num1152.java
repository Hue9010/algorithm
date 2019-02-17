package baekjoon;

import java.util.Scanner;

public class Num1152 {

    public static int solution(String word) {
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
