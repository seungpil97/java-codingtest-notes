package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟡 문제 1. 수 정렬하기 3
 * 클래스명: March26CountingSort
 * N개의 수가 주어졌을 때 오름차순으로 정렬하여 출력하라.
 * <p>
 * 백준 10989번과 동일한 문제입니다.
 * <p>
 * 입력:
 * 10
 * 5 2 3 1 4 2 3 5 1 7
 * 출력:
 * 1
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 5
 * 5
 * 7
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 10,000,000
 * 각 수는 1 이상 10,000 이하의 자연수
 * 시간 제한: 3초
 */
public class March26CountingSort {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] count = new int[10001];  // 크기는 값의 범위 (1~10000)

    for (int i = 0; i < n; i++) {
      count[Integer.parseInt(st.nextToken())]++;  // 해당 값의 빈도 +1
    }

    StringBuilder sb = new StringBuilder();
    for (int value = 1; value <= 10000; value++) {
      for (int j = 0; j < count[value]; j++) {
        sb.append(value).append("\n");
      }

    }
    System.out.println(sb);

  }
}
