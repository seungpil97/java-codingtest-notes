package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * N개의 정수가 주어졌을 때, 각 원소의 오큰수를 출력하시오.
 * 오큰수란 해당 원소보다 오른쪽에 있으면서 처음으로 더 큰 수를 말한다.
 * 오큰수가 없으면 -1을 출력한다.
 * 입력:
 * 4
 * 3 5 2 7
 * 출력: 5 7 7 -1
 * 제약 조건:
 * - 1 ≤ N ≤ 1000
 * - Stack을 사용할 것
 */
public class March19NextGreaterElement {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = Arrays.stream(br.readLine().split(" "))
      .mapToInt(Integer::parseInt)
      .toArray();
    int[] result = new int[n];
    Arrays.fill(result, -1);  // 전부 -1로 초기화

    Deque<Integer> stack = new ArrayDeque<>();  // 인덱스 저장

    for (int i = 0; i < n; i++) {
      // 현재 숫자가 스택 top 인덱스의 숫자보다 크면
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        result[stack.pop()] = arr[i];  // 오큰수 발견!
      }
      stack.push(i);  // 현재 인덱스 push
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(" ");
      sb.append(result[i]);
    }
    System.out.println(sb);

  }
}
