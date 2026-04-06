package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 🟡 문제 3. 최장 연속 문자 (슬라이딩 윈도우)
 * 클래스명: April06LongestSubstring
 * 소문자 영문자로 이루어진 문자열이 주어진다.
 * 같은 문자가 최대 k번까지만 등장하도록 제한할 때,
 * 조건을 만족하는 가장 긴 연속 부분 문자열의 길이를 구하라.
 * 입력:
 * aabacbebebe 2
 * (문자열 k)
 * 출력:
 * 6
 * (abacbe — 각 문자가 2번 이하, 길이 7)
 * 제약 조건:
 * <p>
 * 1 ≤ 문자열 길이 ≤ 100,000
 * 1 ≤ k ≤ 100,000
 * 소문자 영문자만 입력
 */
public class April06LongestSubstring {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    String token = input[0];
    int k = Integer.parseInt(input[1]);

    Map<Character, Integer> map = new HashMap<>();

    int left = 0;
    int right = 0;
    int maxLength = 0;

    while (right < token.length()) {
      char c = token.charAt(right);
      right++;
      map.put(c, map.getOrDefault(c, 0) + 1);

      while (map.get(c) > k) {
        char leftChar = token.charAt(left);
        map.put(leftChar, map.get(leftChar) - 1);
        left++;
      }

      maxLength = Math.max(maxLength, right - left);
    }

    System.out.println(maxLength);


  }
}
