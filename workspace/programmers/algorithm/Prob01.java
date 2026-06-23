package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Prob01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for(String cName : completion) {
            if(map.containsKey(cName) && map.get(cName) > 0) {
                map.put(cName, map.get(cName) - 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 0) {
                answer = entry.getKey();
            }
        }

        return answer;
    }

    void main() {
        String[] participant = {"hello", "world", "hello", "java"};
        String[] completion = {"hello", "world", "java"};

        String result =  solution(participant, completion);
        if(result.equals("hello")) {
            System.out.println("통과");
        }else{
            System.out.println(result);
        }
    }
}
