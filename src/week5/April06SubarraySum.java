package week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 연속 부분 배열의 합 (백준 2003번 유사)
 * 클래스명: April06SubarraySum
 * 양의 정수로 이루어진 배열에서, 합이 정확히 target이 되는 연속 부분 배열의 개수를 구하라.
 * 입력:
 * 8 3
 * 1 2 3 1 2 1 3 2
 * (원소 개수, target / 배열)
 * 출력:
 * 5
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 1 ≤ numbers[i] ≤ 1,000
 * 1 ≤ target ≤ 1,000,000
 */

public class April06SubarraySum {
  static int arr[];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int target = Integer.parseInt(input[1]);
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int count = 0;
    int left = 0;
    int right = 0;

    int sum = 0;

    while (right < n) {
      sum += arr[right];
      right++;

      while (sum > target) {
        sum -= arr[left];
        left++;
      }

      if (sum == target) {
        count++;
      }
    }

    System.out.println(count);


  }
}
