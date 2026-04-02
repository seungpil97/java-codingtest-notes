package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🔴 문제 2. 공유기 설치
 * 클래스명: April02RouterInstall
 * N개의 집이 일직선 위에 있고, C개의 공유기를 설치하려 한다.
 * 공유기 간 최소 거리가 최대가 되도록 설치할 때, 그 최솟값을 구하여라.
 * 입력:
 * 5 3
 * 1
 * 2
 * 8
 * 4
 * 9
 * 출력:
 * 3
 * 설명:
 * 집의 위치를 정렬하면 [1, 2, 4, 8, 9].
 * 1, 4, 9에 설치하면 간격이 3, 5 → 최솟값 3.
 * 1, 4, 8에 설치하면 간격이 3, 4 → 최솟값 3.
 * 최솟값의 최댓값 = 3.
 * 제약 조건:
 * <p>
 * 2 ≤ N ≤ 200,000
 * 2 ≤ C ≤ N
 * 1 ≤ 집의 좌표 ≤ 1,000,000,000
 * 백준 2110번
 */
public class April02RouterInstall {

  static int[] houses;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int c = Integer.parseInt(input[1]);

    houses = new int[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      houses[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(houses);

    System.out.println(findMaxMinGap(c));

  }

  private static long findMaxMinGap(int c) {

    long left = 1;
    long right = houses[houses.length - 1] - houses[0];

    long answer = 0;

    while (left <= right) {
      long mid = (left + right) / 2;

      long installCount = countInstallable(mid);

      if (installCount >= c) {
        answer = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return answer;
  }

  private static long countInstallable(long minGap) {
    int count = 1;                    // 첫 번째 집에 설치
    int lastInstalled = houses[0];    // 마지막으로 설치한 위치

    for (int i = 1; i < houses.length; i++) {
      if (houses[i] - lastInstalled >= minGap) {
        count++;
        lastInstalled = houses[i];
      }
    }
    return count;
  }
}
