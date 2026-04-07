package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟡 문제 1. 애너그램 그룹
 * 클래스명: April07AnagramGroup
 * 문자열 배열이 주어진다. 서로 애너그램인 문자열끼리 묶어서 출력하라.
 * 각 그룹은 원래 입력 순서 기준으로 처음 등장한 순서대로 출력하고,
 * 그룹 내 문자열도 입력 순서를 유지한다.
 * 입력:
 * 6
 * eat tea tan ate nat bat
 * 출력:
 * eat tea ate
 * tan nat
 * bat
 * 제약 조건:
 * <p>
 * 1 ≤ 문자열 수 N ≤ 100,000
 * 각 문자열 길이 ≤ 20
 * 소문자 알파벳만 포함
 */
public class April07AnagramGroup {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    String[] input = br.readLine().split(" ");

    Map<String, List<String>> map = new LinkedHashMap<>();

    for (String s : input) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);

      List<String> group = map.getOrDefault(key, new ArrayList<>());
      group.add(s);
      map.put(key, group);
    }

    for (List<String> group : map.values()) {
      System.out.println(String.join(" ", group));
    }

  }

}
