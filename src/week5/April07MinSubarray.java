package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🔴 문제 3. 조건을 만족하는 가장 짧은 부분 배열
 * 클래스명: April07MinSubarray
 * 양의 정수 배열과 목표값 target이 주어진다.
 * 합이 target 이상인 부분 배열 중 길이가 가장 짧은 것의 길이를 출력하라.
 * 조건을 만족하는 부분 배열이 없으면 0을 출력한다.
 * 입력:
 * 7 6
 * 2 3 1 2 4 3
 * (첫 번째 숫자: target, 두 번째 숫자: N)
 * 출력:
 * 2
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 1 ≤ target ≤ 1,000,000,000
 * 1 ≤ 배열 원소 ≤ 10,000
 */
public class April07MinSubarray {

  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int target = Integer.parseInt(input[0]);
    int n = Integer.parseInt(input[1]);

    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int left = 0;
    int right = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (right > n) break;
      sum += arr[right];
      right++;

      while (sum >= target) {
        minLen = Math.min(minLen, right - left);
        sum -= arr[left];
        left++;
      }
    }

    System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);

  }
}
