package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 1. 괄호 유효성 검사
 * 문자열이 하나 주어졌을 때, 괄호가 올바르게 열리고 닫혔는지 판별하시오.
 * 올바르면 YES, 아니면 NO를 출력하시오.
 * 제약 조건:
 * - 괄호는 ( ) 만 사용
 * - 빈 문자열은 YES
 * 입력 예시 1: (()())
 * 출력 예시 1: YES
 * 입력 예시 2: (()
 * 출력 예시 2: NO
 * 입력 예시 3: )()
 * 출력 예시 3: NO
 */
public class March17ValidParentheses {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    int i = 0;
    int count = 0;
    while (i < input.length()) {

      char c = input.charAt(i);

      if (c == ')' && count == 0) {

        System.out.println("NO");
        return;
      }

      if (c == '(') {
        count++;
      } else {
        count--;
      }

      i++;
    }

    System.out.println(count == 0 ? "YES" : "NO");


  }
}
