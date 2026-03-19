package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제 3. 큐로 프린터 순서 시뮬레이션
 * N개의 문서가 순서대로 큐에 들어있고, 각 문서는 우선순위(1~9, 높을수록 우선)를 가진다.
 * 프린터는 아래 규칙으로 동작한다.
 * <p>
 * 큐에서 문서를 꺼낸다
 * 큐에 남은 문서 중 더 높은 우선순위가 있으면 → 꺼낸 문서를 큐 맨 뒤에 다시 넣는다
 * 없으면 → 해당 문서를 출력한다
 * <p>
 * M번째로 넣은 문서(0-index)가 몇 번째로 출력되는지 구하시오.
 * 입력:
 * 4 2
 * 1 2 3 4
 * (문서 수 N, 확인할 문서 위치 M / 우선순위 목록)
 * 출력: 2
 * 제약 조건:
 * - java.util.LinkedList 를 Queue로 사용할 것
 * - 1 ≤ N ≤ 100
 */
public class March17PrinterQueue {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] firstLine = br.readLine().split(" ");
    int n = Integer.parseInt(firstLine[0]);  // 문서 수
    int m = Integer.parseInt(firstLine[1]);  // 추적할 문서 index

    String[] secondLine = br.readLine().split(" ");

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      queue.add(new int[]{Integer.parseInt(secondLine[i]), i});  // {우선순위, 원래인덱스}
    }

    int count = 0;

    while (!queue.isEmpty()) {

      int[] current = queue.poll();  // 맨 앞에서 꺼내기

      // 큐에 현재보다 높은 우선순위가 있는지 확인
      boolean hasHigher = false;
      for (int[] doc : queue) {
        if (doc[0] > current[0]) {
          hasHigher = true;
          break;
        }
      }

      if (hasHigher) {
        queue.add(current);  // 맨 뒤로 다시 넣기
      } else {
        count++;
        if (current[1] == m) {  // 추적하던 문서면 종료
          System.out.println(count);
          return;
        }
      }
    }
  }
}
