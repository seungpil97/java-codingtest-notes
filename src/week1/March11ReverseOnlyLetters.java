package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 2 - 알파벳만 뒤집기
public class March11ReverseOnlyLetters {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    char[] arr = input.toCharArray();

    // 처리
    int lt = 0;
    int rt = arr.length - 1;

    while (lt < rt) {

      if (!Character.isAlphabetic(arr[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(arr[rt])) {
        rt--;
      } else {
        char temp = arr[lt];
        arr[lt] = arr[rt];
        arr[rt] = temp;
        lt++;
        rt--;
      }
    }

    String result = String.valueOf(arr);

    System.out.println(result);

  }
}
