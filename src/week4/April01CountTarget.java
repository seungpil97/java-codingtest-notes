package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 값의 개수 세기
 * 클래스명: April01CountTarget
 * 정렬된 정수 배열에서 특정 값 target이 몇 번 등장하는지 출력하라.
 * <p>
 * 시간복잡도 O(log N)으로 풀어야 한다. 단순 순회 금지.
 * 힌트: lower_bound와 upper_bound의 차이를 이용한다.
 * <p>
 * 입력:
 * 7
 * 1 2 2 2 3 4 5
 * 2
 * 출력:
 * 3
 * 추가 예시:
 * 입력: 배열 = [1, 2, 2, 2, 3, 4, 5], target = 6
 * 출력: 0
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000,000
 * N이 크다 → O(n) 순회는 시간 초과 가능
 * 배열은 오름차순 정렬된 상태로 주어진다
 */
public class April01CountTarget {

  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int target = Integer.parseInt(br.readLine());

    int lowerIndex = findLowerBound(0, n, target);
    int upperIndex = findUpperBound(0, n, target);

    System.out.println(upperIndex - lowerIndex);
  }

  private static int findLowerBound(int left, int right, int target) {
    while (left < right) {

      int mid = (left + right) / 2;

      if (arr[mid] < target) left = mid + 1;
      else right = mid;
    }

    return left;
  }

  private static int findUpperBound(int left, int right, int target) {
    while (left < right) {

      int mid = (left + right) / 2;

      if (arr[mid] <= target) left = mid + 1;
      else right = mid;
    }

    return left;
  }
}
