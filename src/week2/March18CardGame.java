package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 3. 카드 뽑기 시뮬레이션
 * 클래스명: March18CardGame
 * 1번부터 N번까지 카드가 순서대로 큐에 들어있다.
 * 아래 규칙으로 카드를 뽑을 때, 마지막에 남는 카드 번호를 출력하시오.
 * <p>
 * 맨 앞 카드를 버린다
 * 그 다음 맨 앞 카드를 맨 뒤로 보낸다
 * 카드가 1장 남을 때까지 반복한다
 * <p>
 * 입력: 6
 * 출력: 4
 * 제약 조건:
 * - java.util.LinkedList 를 Queue로 사용할 것
 * - 1 ≤ N ≤ 1000
 */
public class March18CardGame {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Queue<Integer> queue = new LinkedList<>();

    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i++) {

      queue.add(i);
    }

    while (queue.size() > 1) {

      // 첫번째 카드 버리기
      queue.poll();

      // 두번째 카드 다시 뒤에 입력
      queue.add(queue.poll());
    }

    System.out.println(queue.peek());
  }
}
