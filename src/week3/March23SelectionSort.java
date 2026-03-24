package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 2. 선택 정렬 직접 구현
 * 정수 배열이 주어졌을 때, 선택 정렬을 직접 구현해서 오름차순으로 정렬 후 출력하시오.
 * (Arrays.sort() 사용 금지)
 * 입력:
 * 5
 * 3 1 4 1 5
 * 출력: 1 1 3 4 5
 * 제약 조건:
 * - 1 ≤ N ≤ 1,000
 */
public class March23SelectionSort {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    int[] arr = new int[n];

    for (int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    // 3 1 4 1 5
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;

      for (int j = i + 1; j < arr.length; j++) {

        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }

      int swapValue = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = swapValue;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);

      if (i < arr.length - 1) {
        sb.append(" ");
      }
    }

    System.out.println(sb);


  }
}
