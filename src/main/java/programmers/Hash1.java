package programmers;

import java.util.HashMap;

public class Hash1 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> players = players(participant);

        updateResult(players, completion);

        String answer = notCompletePlayer(players);
        return answer;
    }

    private HashMap<String, Integer> players(String[] participant){
        HashMap<String, Integer> players = new HashMap<>();

        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }
        return players;
    }

    private void updateResult(HashMap<String, Integer> players, String[] completion){
        for (String player : completion) {
            players.put(player, players.get(player) - 1);
        }
    }

    private String notCompletePlayer(HashMap<String, Integer> players){
        for (String player : players.keySet()) {
            if (players.get(player) != 0) {
                return player;
            }
        }
        return "";
    }
}
