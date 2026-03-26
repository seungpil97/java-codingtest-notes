package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 좌표 압축
 * 수직선 위에 N개의 좌표가 주어진다.
 * 각 좌표를 0부터 시작하는 순위(rank) 로 변환하여 출력하라.
 * 중복된 좌표는 같은 순위를 갖는다.
 * <p>
 * 백준 18870번과 동일한 문제입니다.
 * <p>
 * 입력:
 * 5
 * 2 4 -10 4 -9
 * 출력:
 * 2 3 0 3 1
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000,000
 * -10⁹ ≤ 각 좌표 ≤ 10⁹
 * 출력은 공백으로 구분
 */
public class March26CoordinateCompression {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());

    }

    int[] sorted = Arrays.copyOf(nums, n);
    Arrays.sort(sorted);
    sorted = Arrays.stream(sorted).distinct().toArray();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(Arrays.binarySearch(sorted, nums[i]));
      if (i < n - 1) sb.append(" ");

    }

    System.out.println(sb);
  }
}
