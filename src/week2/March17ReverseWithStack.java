package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 2. 스택으로 문자열 뒤집기
 * 문자열이 하나 주어졌을 때, Stack을 직접 사용해서 문자열을 뒤집어 출력하시오.
 * (StringBuilder.reverse() 사용 금지)
 * 입력: hello
 * 출력: olleh
 * 제약 조건:
 * - java.util.Stack 을 반드시 사용할 것
 * - 알파벳 소문자만 입력됨
 */
public class March17ReverseWithStack {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    Deque<Character> stack = new ArrayDeque<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {

      char c = input.charAt(i);

      stack.push(c);
    }

    while (!stack.isEmpty()) {
      sb.append(stack.pop());  // LIFO — 마지막에 넣은 것부터 꺼냄
    }

    System.out.println(sb);


  }
}
