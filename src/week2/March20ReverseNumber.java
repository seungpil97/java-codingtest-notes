package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 1. 스택으로 숫자 뒤집기
 * 정수 하나가 주어졌을 때, 스택을 사용해서 숫자를 뒤집어 출력하시오.
 * 단, 앞에 오는 0은 제거한다.
 * 입력 예시 1: 12345
 * 출력 예시 1: 54321
 * 입력 예시 2: 1200
 * 출력 예시 2: 21
 * 제약 조건:
 * - Deque 를 Stack으로 사용할 것
 * - 음수는 입력되지 않음
 */
public class March20ReverseNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i) - '0');  // 각 자릿수를 숫자로 변환
    }

    boolean leadingZero = true;

    StringBuilder sb = new StringBuilder();

    while (!stack.isEmpty()) {

      int digit = stack.pop();
      if (leadingZero && digit == 0) continue;
      leadingZero = false;
      sb.append(digit);
    }

    System.out.println(sb);
  }
}
