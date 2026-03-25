package week3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제 2. 수 정렬하기
 * N개의 수가 주어졌을 때, 오름차순으로 정렬해서 출력하시오.
 * 입력:
 * 5
 * 5 4 3 2 1
 * 출력:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 제약 조건:
 * - 1 ≤ N ≤ 1,000,000
 * - 시간 제한: 2초
 * ※ 백준 2751번 과 동일한 문제
 */
public class March24NumberSort {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nums);


    StringBuilder sb = new StringBuilder();
    for (int num : nums) {
      sb.append(num).append("\n");
    }
    System.out.print(sb);

  }
}
