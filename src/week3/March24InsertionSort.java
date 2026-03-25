package week3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 1. 삽입 정렬 직접 구현
 * 정수 배열이 주어졌을 때, 삽입 정렬을 직접 구현해서 오름차순으로 정렬 후 출력하시오.
 * (Arrays.sort() 사용 금지)
 * 입력:
 * 5
 * 3 1 4 1 5
 * 출력: 1 1 3 4 5
 * 제약 조건:
 * - 1 ≤ N ≤ 1,000
 */
public class March24InsertionSort {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    int[] arr = Arrays.stream(br.readLine().split(" "))
      .mapToInt(Integer::parseInt)
      .toArray();

    for (int i = 0; i < arr.length; i++) {

      int key = arr[i];      // 현재 삽입할 값
      int j = i - 1;

      // key보다 큰 값들을 오른쪽으로 밀기
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];  // 한 칸 오른쪽으로 이동
        j--;
      }

      arr[j + 1] = key;  // 올바른 위치에 삽입

    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);

      if (i < arr.length - 1) {
        System.out.print(" ");
      }

    }

  }
}
