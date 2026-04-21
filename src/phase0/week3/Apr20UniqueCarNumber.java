package phase0.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟢 문제 1. 중복 없는 번호판
 * 주차장 입차 기록이 담긴 정수 배열이 주어진다. 같은 차량이 여러 번 입차될 수 있다. 입차한 차량 번호를 중복 없이, 입차 순서대로 출력하라.
 * 클래스명: Apr20UniqueCarNumber
 * 입력:
 * 7
 * 1003 2047 1003 5521 2047 2047 9001
 * 출력:
 * 1003 2047 5521 9001
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 차량 번호는 1 이상 9999 이하의 정수
 */
public class Apr20UniqueCarNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    List<Integer> result = new ArrayList<>();
    Map<Integer, Boolean> seen = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (!seen.containsKey(num)) {
        seen.put(num, true);
        result.add(num);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < result.size(); i++) {
      if (i > 0) {
        sb.append(" ");
      }
      sb.append(result.get(i));

    }

    System.out.println(sb);

  }
}
