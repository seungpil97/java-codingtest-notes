package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 1. 버블 정렬 직접 구현
 * 정수 배열이 주어졌을 때, 버블 정렬을 직접 구현해서 오름차순으로 정렬 후 출력하시오.
 * (Arrays.sort() 사용 금지)
 * 입력:
 * 5
 * 3 1 4 1 5
 * 출력: 1 1 3 4 5
 * 제약 조건:
 * - 1 ≤ N ≤ 1,000
 */
public class March23BubbleSort {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");

    int[] arr = new int[n];

    for (int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }


    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {

          int swapValue = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = swapValue;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      sb.append(arr[i]);
      if (i < n - 1) sb.append(" ");
    }

    System.out.println(sb);
  }
}
