package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 3. 하노이 탑
 * 클래스명: March30HanoiTower
 * 하노이 탑 문제다. 원판 n개를 1번 기둥에서 3번 기둥으로 이동시켜라.
 * 규칙:
 * <p>
 * 한 번에 원판 하나만 이동 가능
 * 큰 원판이 작은 원판 위에 올라갈 수 없음
 * 보조 기둥(2번)을 사용할 수 있음
 * <p>
 * n이 주어졌을 때, 원판을 이동하는 총 횟수와 이동 순서를 출력하라.
 * 입력:
 * 3
 * 출력:
 * 7
 * 1 3
 * 1 2
 * 3 2
 * 1 3
 * 2 1
 * 2 3
 * 1 3
 * (출력 형식: from to — from 기둥에서 to 기둥으로 이동)
 * 제약 조건:
 * <p>
 * 1 ≤ n ≤ 20
 * 이동 횟수는 2^n - 1 임을 참고
 * <p>
 * 백준: 11729번
 */
public class March30HanoiTower {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    // 총 이동 횟수
    int count = (1 << n) - 1;
    sb.append(count).append("\n");

    hanoi(n, 1, 3, 2, sb);

    System.out.print(sb);
  }

  private static void hanoi(int n, int from, int to, int via, StringBuilder sb) {



    // 종료 조건: 원판이 1개면 바로 이동
    if (n == 1) {
      // 출력: from → to
      sb.append(from).append(" ").append(to).append("\n");
      return;
    }

    // 1단계: (n-1)개를 from → via로  (보조 기둥 경유)
    hanoi(n - 1, from, via, to, sb);

    // 2단계: 가장 큰 원판 from → to  (출력)
    sb.append(from).append(" ").append(to).append("\n");

    // 3단계: (n-1)개를 via → to로
    hanoi(n - 1, via, to, from, sb);
  }
}
