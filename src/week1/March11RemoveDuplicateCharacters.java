package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 1. 문자열에서 중복 문자 제거
public class March11RemoveDuplicateCharacters {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    Set<Character> seen = new HashSet<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (!seen.contains(c)) {
        seen.add(c);
        sb.append(c);
      }
    }

    System.out.println(sb);
  }
}
