package phase0.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟡 문제 2. 메뉴 주문 집계
 * 클래스명: Apr21MenuOrder
 * 카페에서 하루 동안 주문된 메뉴 이름이 순서대로 주어진다. 주문 횟수 상위 2개 메뉴를 출력하라. 동점이면 알파벳 순으로 먼저인 것을 우선한다.
 * 입력:
 * 8
 * latte americano latte mocha americano latte mocha mocha
 * 출력:
 * latte 3
 * mocha 3
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 메뉴 이름은 소문자 영문자로만 구성, 길이 1 이상 20 이하
 */
public class Apr21MenuOrder {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    Map<String, Integer> menuOrderMap = new HashMap<>();

    for (int i = 0; i < n; i++) {

      String order = st.nextToken();

      menuOrderMap.put(order, menuOrderMap.getOrDefault(order, 0) + 1);
    }

    List<Map.Entry<String, Integer>> list = new ArrayList<>(menuOrderMap.entrySet());

    list.sort((firstEntry, secondEntry) -> {

      if (!firstEntry.getValue().equals(secondEntry.getValue())) {
        return secondEntry.getValue() - firstEntry.getValue(); // 주문 횟수 내림차순
      }

      return firstEntry.getKey().compareTo(secondEntry.getKey()); // 메뉴명 오름차순
    });

    for (int i = 0; i < 2 && i < list.size(); i++) {
      System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
    }
  }
}
