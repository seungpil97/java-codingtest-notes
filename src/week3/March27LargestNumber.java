package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 가장 큰 수 만들기
 * N개의 비음수 정수가 주어질 때, 이 수들을 이어 붙여 만들 수 있는 가장 큰 수를 출력하세요.
 * 입력:
 * 4
 * 3 30 34 5
 * 출력:
 * 5343330
 * 입력 2:
 * 2
 * 0 0
 * 출력 2:
 * 0
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 0 ≤ 각 수 ≤ 1,000
 * 결과가 "000..." 형태면 "0" 하나만 출력
 */
public class March27LargestNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] tokens = new String[n];
    for (int i = 0; i < n; i++) {
      tokens[i] = st.nextToken();
    }

    StringBuilder sb = new StringBuilder();

    Arrays.sort(tokens, (a, b) -> (b + a).compareTo(a + b));
    for (int i = 0; i < tokens.length; i++) {
      sb.append(tokens[i]);
    }

    String result = sb.toString();
    System.out.println(result.charAt(0) == '0' ? "0" : result);
  }
}
