package phase0.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 Apr17Verify
 * 알파벳 소문자로 이루어진 문자열 S가 주어진다.
 * 문자열에서 팰린드롬인 부분 문자열의 개수를 구하라.
 * (같은 문자열이라도 시작/끝 위치가 다르면 다른 것으로 센다)
 * 입력:
 * abc
 * 출력:
 * 3
 * 입력:
 * aaa
 * 출력:
 * 6
 * 제약 조건:
 * <p>
 * 1 ≤ S 길이 ≤ 1,000
 * 소문자 알파벳만 포함
 */
public class Apr17Verify {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    int count = 0;
    for (int i = 0; i < input.length(); i++) {

      for (int j = i; j < input.length(); j++) {
        String sub = input.substring(i, j + 1);
        String reversed = new StringBuilder(sub).reverse().toString();
        boolean isPalindrome = sub.equals(reversed);

        if (isPalindrome) count++;
      }

    }

    System.out.println(count);


  }
}
