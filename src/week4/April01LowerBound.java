package week4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * )
 * <p>
 * 🟢 문제 1. lower_bound 구현
 * 클래스명: April01LowerBound
 * 정렬된 정수 배열과 목표값 target이 주어진다.
 * target 이상인 값이 처음 등장하는 인덱스를 반환하라.
 * target보다 큰 값이 없으면 배열의 길이를 반환한다.
 * <p>
 * 이분 탐색을 직접 구현해야 한다. Arrays.binarySearch() 사용 금지.
 * <p>
 * 입력:
 * 6
 * 1 3 3 5 7 9
 * 4
 * (배열 크기 N, 배열 원소, target)
 * 출력:
 * 3
 * (인덱스 3에 값 5가 있음 → 4 이상인 값이 처음 등장하는 위치)
 * 추가 예시:
 * 입력: 배열 = [1, 3, 3, 5, 7, 9], target = 3
 * 출력: 1   (인덱스 1에 처음 3이 등장)
 * <p>
 * 입력: 배열 = [1, 3, 3, 5, 7, 9], target = 10
 * 출력: 6   (없으면 배열 길이 반환)
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 배열은 오름차순 정렬된 상태로 주어진다
 * 중복 원소가 있을 수 있다
 */
public class April01LowerBound {
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

    System.out.println(findLowerBound(0, n - 1, target));

  }

  private static int findLowerBound(int left, int right, int target) {
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
