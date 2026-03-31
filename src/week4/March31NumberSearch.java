package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 3. 수 찾기
 * 클래스명: March31NumberSearch
 * 백준 1920번
 * N개의 정수 배열 A가 주어진다.
 * M개의 정수가 순서대로 주어질 때, 각각이 배열 A에 있으면 1, 없으면 0을 출력하라.
 * 입력:
 * 5
 * 4 1 5 2 3
 * 5
 * 1 3 7 9 5
 * 출력:
 * 1
 * 1
 * 0
 * 0
 * 1
 * 제약 조건:
 * <p>
 * 1 ≤ N, M ≤ 100,000
 * 원소의 절댓값 ≤ 2,147,483,647 (int 범위)
 * 시간복잡도 O((N+M) log N) — N이 100,000이므로 O(N²)은 시간 초과
 * HashSet 금지 — 이분 탐색으로 구현할 것
 */
public class March31NumberSearch {

  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int arrSize = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[arrSize];
    for (int i = 0; i < arrSize; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);  //

    int queryCount = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < queryCount; i++) {
      int target = Integer.parseInt(st.nextToken());
      sb.append(binarySearch(0, arrSize - 1, target)).append('\n');
    }

    System.out.println(sb);

  }

  private static int binarySearch(int left, int right, int target) {
    if (left > right) return 0;          // 없음

    int mid = (left + right) / 2;

    if (arr[mid] == target) return 1;    // 있음
    if (arr[mid] < target) return binarySearch(mid + 1, right, target);
    return binarySearch(left, mid - 1, target);
  }
}
