package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 1. 랜선 자르기
 * 클래스명: April02CableCut
 * K개의 랜선을 잘라서 N개 이상의 랜선을 만들려고 한다.
 * 자를 때는 모두 같은 길이로 자르며, 남는 부분은 버린다.
 * 만들 수 있는 랜선의 최대 길이를 구하여라.
 * 입력:
 * 4 11
 * 802
 * 743
 * 457
 * 539
 * 출력:
 * 200
 * 설명:
 * 4개의 랜선을 길이 200으로 자르면 → 4 + 3 + 2 + 2 = 11개 이상 만들 수 있다.
 * 제약 조건:
 * <p>
 * 1 ≤ K ≤ 10,000
 * 1 ≤ N ≤ 1,000,000
 * 각 랜선의 길이 ≤ 2³¹ - 1
 * 백준 1654번
 */
public class April02CableCut {
  static int[] cables;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] firstLine = br.readLine().split(" ");
    int k = Integer.parseInt(firstLine[0]);
    int n = Integer.parseInt(firstLine[1]);

    cables = new int[k];

    for (int i = 0; i < k; i++) {
      cables[i] = Integer.parseInt(br.readLine().trim());
    }

    System.out.println(findMaxLength(n));
  }

  private static long findMaxLength(int targetCount) {
    long left = 1; // 0 나누기 방지
    long right = 0;
    for (int cable : cables) {
      right = Math.max(right, cable);
    }

    long answer = 0;

    while (left <= right) {
      long mid = (left + right) / 2;
      long cableCount = countCables(mid);

      if (cableCount >= targetCount) {
        answer = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return answer;
  }

  private static long countCables(long cutLength) {
    long total = 0;
    for (int cable : cables) {
      total += cable / cutLength;
    }
    return total;
  }
}