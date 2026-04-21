package phase0.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 2 (시뮬레이션). Apr16Simulation1
 * N명의 학생이 번호표(1번~N번)를 들고 있다.
 * 아래 규칙으로 번호표를 교환한다.
 * <p>
 * 홀수 번호 학생은 자신의 번호에 1을 더한 번호 학생과 교환한다
 * 단, N이 홀수이면 마지막 학생은 교환하지 않는다
 * 교환을 M번 반복한 후 최종 번호 배열을 출력하라
 * <p>
 * 입력:
 * 5 3
 * (N=5명, M=3회)
 * 출력:
 * 2 1 4 3 5
 * 진행 예시:
 * 초기:    1 2 3 4 5
 * 1회전:   2 1 4 3 5
 * 2회전:   1 2 3 4 5
 * 3회전:   2 1 4 3 5
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100
 * 1 ≤ M ≤ 1,000
 */

public class Apr16Simulation1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = i + 1;
    }

    boolean isChange = m % 2 == 1;

    if (isChange) {

      for (int i = 0; i < n; i++) {

        int current = i + 1;
        if (current == n && current % 2 == 1) {
          break;
        }

        if (current % 2 == 1) {
          int temp = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = temp;
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) {
        sb.append(" ");
      }
      sb.append(nums[i]);
    }

    System.out.println(sb);


  }
}
