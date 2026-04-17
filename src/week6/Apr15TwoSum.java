package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 두 수의 합 (인덱스 찾기)
 * 클래스명: Apr15TwoSum
 * 정수 배열과 목표값 target이 주어진다. 배열에서 두 수를 더해 target이 되는 모든 쌍의 인덱스를 출력하라. (같은 인덱스 두 번 사용 불가)
 * 입력:
 * 5 7
 * 2 4 3 1 5
 * (첫 줄: 배열 크기 N, target / 둘째 줄: 배열)
 * 출력:
 * 0 4
 * 1 2
 * (인덱스 오름차순 출력)
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 정답 쌍이 없으면 -1 출력
 */
public class Apr15TwoSum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");

    int n = Integer.parseInt(input[0]);
    int target = Integer.parseInt(input[1]);

    int[] nums = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }


    boolean isTwoSum = false;
    for (int i = 0; i < n; i++) {

      int currentNum = nums[i];

      int nextIndex = i + 1;
      while (nextIndex < n) {

        int sum = currentNum + nums[nextIndex];

        if (target - sum == 0) {
          System.out.println(i + " " + nextIndex);
          isTwoSum = true;
        }

        nextIndex++;
      }
    }

    if (!isTwoSum) {
      System.out.println(-1);
    }
  }
}
