package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 1. 스택으로 수식 계산
 * 공백으로 구분된 후위 표기식(Postfix)이 주어졌을 때, 계산 결과를 출력하시오.
 * 후위 표기식이란?
 * 일반식: 3 + 4       → 후위식: 3 4 +
 * 일반식: (3 + 4) * 2 → 후위식: 3 4 + 2 *
 * 입력: 3 4 + 2 *
 * 출력: 14
 * 제약 조건:
 * - 연산자는 +, -, *, / 만 사용
 * - 피연산자는 정수
 * - 수식은 항상 유효하다고 가정
 */
public class March18Calculator {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] tokens = br.readLine().split(" ");

    Deque<Integer> stack = new ArrayDeque<>();

    for (String token : tokens) {
      if (Character.isDigit(token.charAt(0))) {
        stack.push(Integer.parseInt(token));
      } else {
        int rightOperand = stack.pop();  // 오른쪽 피연산자
        int leftOperand = stack.pop();   // 왼쪽 피연산자
        int result = calculate(token, leftOperand, rightOperand);
        stack.push(result);
      }
    }

    System.out.println(stack.pop());
  }

  private static int calculate(String operator, int leftOperand, int rightOperand) {

    return switch (operator) {
      case "+" -> leftOperand + rightOperand;
      case "-" -> leftOperand - rightOperand;
      case "*" -> leftOperand * rightOperand;
      case "/" -> leftOperand / rightOperand;
      default ->
        throw new IllegalArgumentException("Unknown operator: " + operator);
    };
  }
}
