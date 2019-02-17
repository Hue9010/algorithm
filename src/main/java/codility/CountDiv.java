package codility;

public class CountDiv {

	public int solution(int A, int B, int K) {
		int answer = B / K + 1;
		if (A != 0) {
			answer -= ((A - 1) / K + 1);
		}
		return answer;
	}

}
