package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 문제 1. 가장 많이 등장한 문자
 * 문자열이 하나 주어졌을 때, 가장 많이 등장한 문자를 출력하시오. 단, 대소문자는 구분하지 않으며, 가장 많이 등장한 문자가 여러 개라면 먼저 등장한 문자를 출력하시오.
 * 입력: aabBBccC
 * 출력: b
 */
public class March13MostFrequentCharacter {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine().toLowerCase();

    Map<Character, Integer> countMap = new LinkedHashMap<>();

    char maxKey = input.charAt(0);
    int maxValue = countMap.get(input.charAt(0));

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      countMap.put(c, countMap.getOrDefault(c, 0) + 1);

      if (countMap.get(c) > maxValue) {

        maxKey = c;
        maxValue = countMap.get(c);
      }
    }

    System.out.println(maxKey);

  }
}
