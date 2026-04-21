package phase0.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟢 문제 1. 모음 제거 후 뒤집기
 * 클래스명: Apr14RemoveVowelAndReverse
 * 문자열 s가 주어진다.
 * s에서 모음(a, e, i, o, u)을 모두 제거한 뒤, 남은 문자열을 뒤집어서 반환하라.
 * 입력:
 * hello world
 * 출력:
 * dlrw llh
 * 제약 조건:
 * <p>
 * 1 ≤ s의 길이 ≤ 1,000
 * s는 영소문자와 공백으로만 구성
 */
public class Apr14RemoveVowelAndReverse {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();


    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        continue;
      }

      sb.append(c);
    }

    System.out.println(sb.reverse());


  }
}
