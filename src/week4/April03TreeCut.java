package week4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 나무 자르기
 * 클래스명: April01TreeCut
 * 상근이는 집에서 M미터의 나무가 필요하다.
 * 나무 N그루의 높이가 주어지고, 절단기의 높이 H를 설정하면
 * H보다 높은 나무는 (나무 높이 - H)만큼 잘려 나온다.
 * 상근이가 최소 M미터를 가져갈 수 있는 절단기 높이의 최댓값을 구하라.
 * <p>
 * "절단기 높이 H를 올릴수록 얻는 나무가 줄어든다" → 단조성 존재 → 이분 탐색 적용
 * <p>
 * 입력:
 * 4 7
 * 20 15 10 17
 * (N M, 나무 높이들)
 * 출력:
 * 15
 * 풀이 흐름 예시:
 * H=15로 자르면: (20-15) + (15-15) + 0 + (17-15) = 5+0+0+2 = 7
 * H=16으로 자르면: (20-16) + 0 + 0 + (17-16) = 4+0+0+1 = 5 (부족)
 * → 정답: 15
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000,000
 * 1 ≤ M ≤ 2,000,000,000
 * 나무 높이 ≤ 1,000,000,000
 * 백준 2805번 동일 문제
 * int 범위 초과 주의 → 합산 시 long 사용
 */
public class April03TreeCut {

  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    long m = Long.parseLong(input[1]);
    StringTokenizer st = new StringTokenizer(br.readLine());

    arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(findMaxHeight(m));


  }

  private static long findMaxHeight(long m) {
    long left = 0;
    long right = 0;
    for (int treeHeight : arr) {
      right = Math.max(right, treeHeight);
    }
    long answer = 0;

    while (left <= right) {
      long mid = (left + right) / 2;
      long wood = calculateWood(mid);

      if (wood >= m) {
        answer = mid;       // 정답 후보 저장
        left = mid + 1;     // 더 높여볼 수 있다
      } else {
        right = mid - 1;    // 너무 높다, 낮춰야 한다
      }
    }

    return answer;
  }

  private static long calculateWood(long height) {
    long total = 0;
    for (int treeHeight : arr) {
      if (treeHeight > height) {
        total += treeHeight - height;
      }
    }
    return total;
  }
}
