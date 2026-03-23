package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 3. 스택 수열
 * 1부터 N까지의 수를 순서대로 스택에 push하고, 임의의 시점에 pop해서 수열을 만들 수 있는지 판별하시오.
 * 만들 수 있으면 push는 +, pop은 -로 출력하고, 만들 수 없으면 NO를 출력하시오.
 * 입력:
 * 8
 * 4 3 6 8 7 2 9 1 5
 * ※ 백준 1874번 과 동일한 문제
 * 제약 조건:
 * - 1 ≤ N ≤ 100,000
 */
public class March21StackSequence {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] sequence = br.readLine().split(" ");

    Deque<Integer> stack = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    int next = 1;  // 다음에 push할 숫자
    boolean possible = true;


    for (int i = 0; i < n; i++) {

      int target = Integer.parseInt(sequence[i]);  // 이번에 pop해야 할 숫자

      // target이 나올 때까지 push
      while (next <= target && next <= n) {
        stack.push(next++);
        sb.append("+\n");
      }

      // top이 target이면 pop
      if (stack.peek() == target) {
        stack.pop();
        sb.append("-\n");
      } else {
        // top이 target보다 작으면 불가능
        possible = false;
        break;
      }

    }
    System.out.println(possible ? sb.toString() : "NO");
  }

}
