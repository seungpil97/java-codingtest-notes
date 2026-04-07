package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 길이 K인 윈도우의 최댓값
 * 클래스명: April07WindowMax
 * 정수 배열과 윈도우 크기 K가 주어진다.
 * 크기 K인 윈도우를 왼쪽에서 오른쪽으로 한 칸씩 이동할 때,
 * 각 윈도우에서의 최댓값을 순서대로 출력하라.
 * 입력:
 * 8 3
 * 1 3 -1 -3 5 3 6 7
 * 출력:
 * 3 3 5 5 6 7
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 1 ≤ K ≤ N
 */
public class April07WindowMax {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    StringTokenizer st = new StringTokenizer(br.readLine());

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {

      // 현재 원소 추가
      pq.offer(new int[]{Integer.parseInt(st.nextToken()), i});

      // 윈도우 완성 시점 (i >= K-1)
      if (i >= k - 1) {
        if (i > k - 1) sb.append(" ");

        while (pq.peek()[1] < i - k + 1) {
          pq.poll();
        }
        sb.append(pq.peek()[0]);
      }
    }

    System.out.println(sb);
  }
}
