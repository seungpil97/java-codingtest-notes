package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 문제 1
 * 문자열이 하나 주어졌을 때, 각 문자가 몇 번씩 등장했는지 출력하시오.
 * 단, 출력 형식은 문자:횟수 형태로 하며, 처음 등장한 문자 순서대로 출력하시오.
 */
public class March12CountCharacters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            sb.append(entry.getKey())
              .append(":")
              .append(entry.getValue())
              .append("\n");
        }

        System.out.print(sb);
    }
}