package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 3. 배열에서 최댓값과 최솟값 찾기
public class March10ArrayMinMax {

  public static void main(String[] args) throws IOException {

    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    // 처리
    int min = arr[0];
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] < min) {
        min = arr[i];
      }

      if (arr[i] > max) {
        max = arr[i];
      }
    }

    // 출력
    System.out.println(min + " " + max);
  }
}
