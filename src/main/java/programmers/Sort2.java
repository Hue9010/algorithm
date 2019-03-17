package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public String solution(int[] numbers) {
        List<String> numberList = arrayToList(numbers);

        Collections.sort(numberList, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        if ("0".equals(numberList.get(0))) {
            return "0";
        }

        String answer = attachNumbers(numberList);
        return answer;
    }

    private List<String> arrayToList(int[] numbers) {
        List<String> numberList = new ArrayList();
        for (int number : numbers) {
            numberList.add(Integer.toString(number));
        }
        return numberList;
    }

    private String attachNumbers(List<String> numbers) {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            sb.append(number);
        }

        return sb.toString();
    }
}
