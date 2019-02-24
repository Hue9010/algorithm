package programmers;

import java.util.HashMap;

public class Hash3 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> items = checkItems(clothes);
        int answer = getAnswer(items);

        return answer;
    }

    private HashMap checkItems(String[][] clothes) {
        HashMap<String, Integer> items = new HashMap();
        for (String[] item : clothes) {
            items.put(item[1], items.getOrDefault(item[1], 0) + 1);
        }

        return items;
    }

    private int getAnswer(HashMap<String, Integer> hash) {
        int answer = 1;

        for (String key : hash.keySet()) {
            answer *= (hash.get(key) + 1);
        }

        return answer - 1;
    }

}
