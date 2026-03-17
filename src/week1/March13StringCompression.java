package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 2. 문자열 압축
 * 문자열이 하나 주어졌을 때, 연속으로 같은 문자가 몇 번 나오는지 압축해서 출력하시오. 단, 문자가 1번만 나오면 숫자는 생략한다.
 * 입력: aaabbccccd
 * 출력: a3b2c4d
 */
public class March13StringCompression {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    StringBuilder sb = new StringBuilder();
    int i = 0;

    while (i < input.length()) {

      char c = input.charAt(i);
      int count = 0;

      while (i < input.length() && input.charAt(i) == c) {
        count++;
        i++;
      }

      sb.append(c);
      if (count > 1) sb.append(count);
    }

    System.out.println(sb);

  }
}
