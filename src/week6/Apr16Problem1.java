package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 1. Apr16Problem1
 * 문자열이 주어졌을 때, 각 문자가 몇 번 등장하는지 세어서 가장 많이 등장한 문자를 반환하라.
 * 등장 횟수가 같은 문자가 여러 개라면 알파벳 순서가 빠른 것을 반환한다.
 * 입력:
 * "banana"
 * 출력:
 * a
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 소문자 알파벳만 포함
 */
public class Apr16Problem1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int[] alphabetCount = new int[26];

    for (int i = 0; i < input.length(); i++) {

      char c = input.charAt(i);

      int index = c - 'a';
      alphabetCount[index]++;

    }

    int maxIndex = 0;
    for (int i = 1; i < alphabetCount.length; i++) {

      if (alphabetCount[i] > alphabetCount[maxIndex]) {
        maxIndex = i;
      }
    }

    char result = (char) (maxIndex + 'a');

    System.out.println(result);
  }

}
