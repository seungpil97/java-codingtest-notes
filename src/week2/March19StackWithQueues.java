package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 3. 큐 두 개로 스택 구현하기
 * 큐 두 개만 사용해서 스택을 구현하시오.
 * 스택의 push와 pop을 지원해야 한다.
 * 입력:
 * push 1
 * push 2
 * push 3
 * pop
 * pop
 * 출력:
 * 3
 * 2
 * 제약 조건:
 * - java.util.LinkedList 를 Queue로만 사용할 것
 * - 배열, Deque 사용 금지
 */
public class March19StackWithQueues {

  private static Queue<Integer> queue1 = new LinkedList<>();
  private static Queue<Integer> queue2 = new LinkedList<>();
  ;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = br.readLine()) != null && !line.isEmpty()) {
      String[] tokens = line.split(" ");
      String command = tokens[0];  // "push" or "pop"

      if (command.equals("push")) {
        push(Integer.parseInt(tokens[1]));
      } else if (command.equals("pop")) {
        System.out.println(pop());
      }
    }
  }

  private static void push(int value) {
    queue1.add(value);
  }

  private static int pop() {
    // queue1 마지막 하나 빼고 나머지 queue2로 이동
    while (queue1.size() > 1) {
      queue2.add(queue1.poll());
    }
    int result = queue1.poll();  // 마지막 값 = 스택 top

    // queue2 내용 다시 queue1으로
    while (!queue2.isEmpty()) {
      queue1.add(queue2.poll());
    }
    return result;
  }

}

