package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 1. 올바른 괄호 문자열 만들기
 * ( 와 ) 로만 이루어진 문자열이 주어졌을 때, 올바른 괄호 문자열로 만들기 위해 최소 몇 번 괄호를 추가해야 하는지 출력하시오.
 * 입력: (()
 * 출력: 1
 * 입력: ()))(
 * 출력: 3
 * 제약 조건:
 * - 빈 문자열은 0 출력
 * - 추가만 가능 (삭제 불가)
 */
public class March19ValidParenthesesII {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String tokens = br.readLine();

    int count = 0;  // 추가해야 할 괄호 수
    int open = 0;   // 현재 열려있는 ( 개수
    for (int i = 0; i < tokens.length(); i++) {

      char token = tokens.charAt(i);

      if (token == '(') {
        open++;
      } else {
        if (open > 0) {
          open--;
        } else {
          count++;
        }
      }
    }

    count += open;
    System.out.println(count);
  }
}
