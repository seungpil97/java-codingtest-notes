package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 2. 괄호 제거 후 숫자 합산
 * 숫자와 +, -, (, ) 로 이루어진 수식 문자열이 주어진다.
 * 괄호 앞에 - 가 있으면 괄호 안의 부호가 반전된다.
 * 수식을 계산한 결과를 출력하시오.
 * 입력: 1+(2-3)+(-1+2)
 * 출력: 1
 * 제약 조건:
 * - 숫자는 한 자리 정수
 * - 괄호는 중첩되지 않음
 */
public class March20BracketSum {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String tokens = br.readLine();
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);       // 초기 부호 방향
    int sign = 1;        // 현재 부호
    int result = 0;

    for (int i = 0; i < tokens.length(); i++) {

      char c = tokens.charAt(i);

      if (Character.isDigit(c)) {
        result += stack.peek() * sign * (c - '0');
      } else if (c == '+') {
        sign = 1;
      } else if (c == '-') {
        sign = -1;
      } else if (c == '(') {
        stack.push(stack.peek() * sign);  // 현재 방향 저장
      } else if (c == ')') {
        stack.pop();
      }
    }

    System.out.println(result);
  }
}
