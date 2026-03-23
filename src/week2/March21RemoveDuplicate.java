package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 1. 같은 숫자는 싫어
 * 수열이 주어졌을 때, 연속으로 같은 숫자가 나오면 하나만 남기고 제거한 결과를 출력하시오.
 * 입력:
 * 6
 * 1 1 2 2 3 3
 * 출력: 1 2 3
 * 제약 조건:
 * - 1 ≤ N ≤ 1000
 */
public class March21RemoveDuplicate {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    br.readLine();

    String[] input = br.readLine().split(" ");

    Deque<Integer> stack = new ArrayDeque<>();

    StringBuilder sb = new StringBuilder();

    stack.push(Integer.valueOf(input[0]));
    sb.append(stack.peek());

    for (int i = 1; i < input.length; i++) {

      int currentTop = Integer.parseInt(input[i]);

      if (!stack.isEmpty()) {
        int topValue = stack.peek();
        if (topValue != currentTop) {
          stack.push(currentTop);
          sb.append(" ").append(currentTop);
        }
      }
    }
    System.out.println(sb);

  }
}
