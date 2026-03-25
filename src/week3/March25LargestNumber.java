package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 3. 가장 큰 수 만들기
 * 정수 배열이 주어졌을 때, 배열의 원소를 이어 붙여 만들 수 있는 가장 큰 수를 출력하시오.
 * 입력: 3 30 34 5 9 출력: 9534330
 * <p>
 * 제약 조건:
 * - 1 ≤ N ≤ 100
 */
public class March25LargestNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String[] strNums = new String[st.countTokens()];

    for (int i = 0; i < strNums.length; i++) {
      strNums[i] = st.nextToken();
    }

    Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

    StringBuilder sb = new StringBuilder();
    for (String strNum : strNums) {
      sb.append(strNum);
    }

    System.out.println(sb);
  }
}
