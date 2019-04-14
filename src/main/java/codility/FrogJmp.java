package codility;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }

        int distance = Y - X;

        if (distance % D == 0) {
            return distance / D;
        }

        return distance / D + 1;
    }
}
