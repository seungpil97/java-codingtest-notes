package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟡 문제 2. 수 정렬하기 (내림차순 + 중복 제거)
 * N개의 수가 주어졌을 때, 중복을 제거하고 내림차순으로 정렬해서 출력하시오.
 * 입력:
 * <p>
 * 5
 * 3 1 3 2 1
 * 출력:
 * <p>
 * 3
 * 2
 * 1
 * 제약 조건:
 * - 1 ≤ N ≤ 1,000,000
 * - 시간 제한: 2초
 */
public class March25SortDescUnique {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    Set<Integer> numSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
      numSet.add(Integer.parseInt(st.nextToken()));
    }
    List<Integer> numList = new ArrayList<>(numSet);
    Collections.sort(numList, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();

    for (int num : numList) {
      sb.append(num).append("\n");
    }
    System.out.print(sb);

  }
}
