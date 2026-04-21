package phase0.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟢 문제 1. 출석 번호 정리
 * 클래스명: Apr21AttendanceList
 * N명의 학생이 출석 체크를 했다. 출석한 학생 번호가 순서대로 주어질 때, 출석하지 않은 학생 번호를 오름차순으로 출력하라. 전체 학생 번호는 1번부터 N번까지다.
 * 입력:
 * 5
 * 1 3 3 5 1
 * 출력:
 * 2 4
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 */
public class Apr21AttendanceList {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    Map<Integer, Boolean> attendedSet = new HashMap<>();

    for (int i = 1; i <= n; i++) {
      int attendedNumber = Integer.parseInt(st.nextToken());

      attendedSet.put(attendedNumber, true);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      if (!attendedSet.containsKey(i)) {
        if (!sb.isEmpty()) sb.append(" ");
        sb.append(i);
      }
    }

    System.out.println(sb);
  }
}
