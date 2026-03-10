package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 1 - 문자열 뒤집기
public class March10ReverseString {

  public static void main(String[] args) throws IOException {

    // 입력: 문자열 S
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    // 처리: 문자열을 뒤에서부터 읽어 뒤집기
    StringBuilder reversed = new StringBuilder();

    for (int i = input.length() - 1; i >= 0; i--) {

      reversed.append(input.charAt(i));
    }

    // 출력: 뒤집힌 문자열
    System.out.println(reversed);
  }
}
