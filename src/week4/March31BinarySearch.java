package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 이분 탐색으로 위치 찾기
 * 클래스명: March31BinarySearch
 * 오름차순으로 정렬된 정수 배열에서 특정 값 target을 이분 탐색으로 찾아 인덱스를 출력하라.
 * 값이 없으면 -1을 출력한다.
 * 입력:
 * 6
 * 1 3 5 7 9 11
 * 7
 * (순서대로: 배열 크기 / 배열 원소 / 찾을 값)
 * 출력:
 * 3
 * 입력 2:
 * 6
 * 1 3 5 7 9 11
 * 4
 * 출력 2:
 * -1
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 배열은 오름차순 정렬 보장
 * Arrays.binarySearch() 등 라이브러리 사용 금지 — 직접 구현할 것
 * 시간복잡도 O(log N)
 */
public class March31BinarySearch {

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

    System.out.println(binarySearch(0, n - 1, target));

  }

  private static int binarySearch(int left, int right, int target) {

    if (left > right) return -1;          // 탐색 범위 소진 → 없음

    int mid = (left + right) / 2;

    if (arr[mid] == target) return mid;

    if (arr[mid] < target) {
      return binarySearch(mid + 1, right, target);  // 오른쪽 탐색
    } else {
      return binarySearch(left, mid - 1, target);  // 왼쪽 탐색
    }


  }
}
