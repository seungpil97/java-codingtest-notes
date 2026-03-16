package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 3 - 배열에서 두 번째로 큰 값 찾기
public class March11SecondLargestNumber {

  public static void main(String[] args) throws IOException {

    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");

    int[] arr = new int[input.length];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    // 처리
    int max;
    int secondMax;
    if (arr[0] > arr[1]) {
      max = arr[0];
      secondMax = arr[1];
    } else {
      max = arr[1];
      secondMax = arr[0];
    }

    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] < max && arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }

    // 출력
    System.out.println(secondMax);

  }
}
