package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 2. 두 문자열의 공통 문자 개수
 * 클래스명: Apr14CommonCharCount
 * 문자열 a와 b가 주어진다.
 * 두 문자열에 공통으로 등장하는 문자의 종류 수를 반환하라.
 * 단, 같은 문자가 여러 번 등장해도 1번만 센다.
 * 입력:
 * abcde
 * cdefg
 * 출력:
 * 3
 * 제약 조건:
 * <p>
 * 1 ≤ a, b의 길이 ≤ 1,000
 * a, b는 영소문자로만 구성
 */
public class Apr14CommonCharCount {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();
    StringBuilder sb = new StringBuilder();


    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);

      if (sb.toString().contains(String.valueOf(c))) {
        continue;
      }

      if (b.contains(String.valueOf(c))) {
        sb.append(c);
        count++;
      }


    }

    System.out.println(count);

  }
}
