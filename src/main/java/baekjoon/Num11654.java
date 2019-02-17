package baekjoon;

import java.util.Scanner;

public class Num11654 {

    public static int solution(char c) {
        return Integer.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(solution(c));
        sc.close();
    }

}
