package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟢 문제 1. 단어 뒤집기
 * 클래스명: Apr15ReverseWords
 * 문장이 주어진다. 문장 안의 각 단어를 뒤집어서 출력하라. 단어 사이 공백은 그대로 유지한다.
 * 입력:
 * Hello World Java
 * 출력:
 * olleH dlroW avaJ
 * 제약 조건:
 * <p>
 * 문장 길이 ≤ 1,000
 * 단어는 공백으로 구분
 * 특수문자 없음
 */
public class Apr15ReverseWords {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] words = input.split(" ");
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      sb.append(new StringBuilder(words[i]).reverse());
      if (i < words.length - 1) sb.append(" ");
    }

    System.out.println(sb);
  }
}
