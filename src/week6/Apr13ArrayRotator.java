package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟢 문제 2. 배열 회전 출력
 * 클래스명: Apr13ArrayRotator
 * 크기 N인 정수 배열이 주어진다.
 * 배열을 오른쪽으로 K칸 회전한 결과를 출력하라.
 * 입력:
 * 5 2
 * 1 2 3 4 5
 * 출력:
 * 4 5 1 2 3
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 1 ≤ K ≤ 1,000 (K는 N보다 클 수 있다)
 * 출력은 공백으로 구분
 */
public class Apr13ArrayRotator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    int[] nums = new int[n];
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    int spin = k % n;
    for (int i = 0; i < n; i++) {

      int newIndex = i + spin;

      if (newIndex >= n) {
        arr[newIndex - n] = nums[i];
      } else {
        arr[newIndex] = nums[i];
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(" ");
      sb.append(arr[i]);

    }

    System.out.println(sb);
  }
}
