package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 🟡 문제 2. 신고 횟수 집계
 * 학생들이 급식 줄에서 새치기한 학생을 신고했다. 신고 기록이 담긴 문자열 배열이 주어질 때, 신고를 가장 많이 받은 학생의 이름과 횟수를 출력하라. 동점이면 알파벳 순으로 먼저인 학생을 출력한다.
 * 클래스명: Apr20MostReported
 * 입력:
 * 8
 * kim lee park kim lee kim park park
 * 출력:
 * kim 3
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 이름은 소문자 영문자로만 구성, 길이 1 이상 10 이하
 */
public class Apr20MostReported {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    Map<String, Integer> reportCountMap = new HashMap<>();

    for (int i = 0; i < n; i++) {
      String key = st.nextToken();
      reportCountMap.put(key, reportCountMap.getOrDefault(key, 0) + 1);
    }

    String maxKey = "";
    int maxValue = 0;

    for (String name : reportCountMap.keySet()) {
      int value = reportCountMap.get(name);
      if (value > maxValue || (value == maxValue && name.compareTo(maxKey) < 0)) {
        maxValue = value;
        maxKey = name;
      }
    }

    System.out.print(maxKey + " " + maxValue);
  }
}
