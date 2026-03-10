package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 2 - 특정 문자 개수 세기
public class March10CountCharacter {

  public static void main(String[] args) throws IOException {

    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    char target = Character.toLowerCase(br.readLine().charAt(0));

    // 처리
    int count = 0;

    for (int i = 0; i < input.length(); i++) {

      char current = Character.toLowerCase(input.charAt(i));

      if (target == current) {
        count++;
      }
    }

    // 출력
    System.out.println(count);
  }
}
