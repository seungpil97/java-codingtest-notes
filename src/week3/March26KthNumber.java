package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 3. K번째 수
 * N개의 수가 주어졌을 때 오름차순으로 정렬한 뒤 K번째 수를 출력하라.
 * <p>
 * 백준 11004번과 동일한 문제입니다.
 * <p>
 * 입력:
 * 5 2
 * 4 1 2 3 5
 * 출력:
 * 2
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 5,000,000
 * 1 ≤ K ≤ N
 * 각 수는 -10⁹ 이상 10⁹ 이하
 * 시간 제한: 2초
 */
public class March26KthNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st1 = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st1.nextToken());
    int k = Integer.parseInt(st1.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st2.nextToken());
    }

    Arrays.sort(nums);

    System.out.println(nums[k - 1]);
  }
}
