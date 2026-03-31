package week4;

/**
 * 🟢 문제 1. 재귀로 배열 최솟값 찾기
 * 클래스명: March31RecursiveMin
 * 정수 배열과 탐색할 범위의 끝 인덱스 n이 주어진다.
 * 재귀를 사용하여 arr[0] ~ arr[n-1] 중 최솟값을 구하라.
 * <p>
 * 입력 예시[하드코딩]
 * arr = {5, 3, 8, 1, 9, 2, 7}
 * n = 7
 * 출력:
 * 최솟값: 1
 * 제약 조건:
 * <p>
 * 1 ≤ n ≤ 1,000
 * -10,000 ≤ arr[i] ≤ 10,000
 * 반드시 재귀로 구현할 것 (Arrays.stream, for문 사용 금지)
 */
public class March31RecursiveMin {

  static int[] arr = {5, 3, 8, 1, 9, 2, 7};

  public static void main(String[] args) {
    System.out.println("최솟값: " + findMin(arr.length));
  }

  private static int findMin(int n) {
    if (n == 1) return arr[0];                      // 기저 조건: 원소 1개면 그게 최솟값
    return Math.min(arr[n - 1], findMin(n - 1));
  }

}
