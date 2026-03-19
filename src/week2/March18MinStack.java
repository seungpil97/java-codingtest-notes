package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * 문제 2. 최솟값을 O(1)에 반환하는 스택
 * 다음 기능을 구현하시오.
 * <p>
 * push(int val) — 값을 스택에 추가
 * pop() — 스택에서 값을 제거
 * getMin() — 현재 스택에서 최솟값을 반환
 * <p>
 * 단, getMin()은 O(1) 이어야 한다.
 * 입력:
 * push 5
 * push 3
 * getMin
 * pop
 * getMin
 * 출력:
 * 3
 * 5
 * 제약 조건:
 * - Stack을 직접 구현할 것 (클래스 내부에 Deque 사용 가능)
 * - getMin()은 O(1) 보장
 */
public class March18MinStack {

  private static final Deque<Integer> mainStack = new ArrayDeque<>();
  private static final Deque<Integer> minStack = new ArrayDeque<>();  // 최솟값 전용

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = br.readLine()) != null && !line.isEmpty()) {
      String[] tokens = line.split(" ");
      String command = tokens[0];  // "push" or "pop" or "getMin"

      if (command.equals("push")) {
        push(Integer.parseInt(tokens[1]));  // tokens[1] = "5"
      } else if (command.equals("pop")) {
        pop();
      } else if (command.equals("getMin")) {
        getMin();
      }
    }
  }


  private static void push(int value) {
    mainStack.push(value);

    // minStack이 비어있거나 새 값이 현재 최솟값보다 작거나 같으면 minStack에도 push
    if (minStack.isEmpty() || value <= minStack.peek()) {
      minStack.push(value);
    }
  }

  private static void pop() {
    int removed = mainStack.pop();
    // 제거된 값이 현재 최솟값이면 minStack에서도 제거
    if (Objects.equals(removed, minStack.peek())) {

      minStack.pop();
    }
  }

  private static void getMin() {
    System.out.println(minStack.peek());
  }

}
