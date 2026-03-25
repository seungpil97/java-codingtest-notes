package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * <p>
 * 문제 3. 카드 정렬하기
 * 숫자가 적힌 카드 묶음이 여러 개 있다.
 * 두 묶음을 합칠 때 비용은 두 묶음의 카드 수의 합이다.
 * 모든 묶음을 하나로 합칠 때 최소 비용을 출력하시오.
 * 입력:
 * 3
 * 1 2 3
 * <p>
 * 계산:
 * 1 + 2 = 3  (비용 3)   → 남은 묶음: 3 3
 * 3 + 3 = 6  (비용 6)   → 남은 묶음: 6
 * <p>
 * 총 비용: 3 + 6 = 9
 * <p>
 * 출력: 9
 * <p>
 * 힌트: 항상 가장 작은 두 묶음을 합치면 최소 비용이 돼요. 어떤 자료구조가 적합할까요?
 * <p>
 * 제약 조건:
 * - 1 ≤ N ≤ 100,000
 */
public class March24CardSort {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // 전부 넣기
    for (int num : nums) {
      pq.add(num);
    }

    int totalCost = 0;

    while (pq.size() > 1) {
      int first = pq.poll();   // 가장 작은 것
      int second = pq.poll();  // 두 번째로 작은 것
      int merged = first + second;
      totalCost += merged;     // 비용 누적
      pq.add(merged);          // 합친 묶음 다시 넣기
    }

    System.out.println(totalCost);


  }
}
