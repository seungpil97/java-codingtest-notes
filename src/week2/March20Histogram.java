package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 3. 히스토그램에서 가장 큰 직사각형
 * N개의 막대로 이루어진 히스토그램이 주어질 때,
 * 히스토그램 안에서 만들 수 있는 가장 큰 직사각형의 넓이를 출력하시오.
 * 입력:
 * 6
 * 2 1 5 6 2 3
 * 출력: 10
 * 제약 조건:
 * - 1 ≤ N ≤ 1000
 * - Stack을 사용할 것
 */
public class March20Histogram {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] tokens = br.readLine().split(" ");
    int[] heights = new int[n];
    for (int i = 0; i < tokens.length; i++) {
      heights[i] = Integer.parseInt(tokens[i]);
    }


    Deque<Integer> stack = new ArrayDeque<>();
    int maxArea = 0;

    for (int i = 0; i <= n; i++) {
      int currentHeight = (i == n) ? 0 : heights[i];  // 끝에 0 추가해서 남은 것 처리

      while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
        int height = heights[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        maxArea = Math.max(maxArea, height * width);
      }
      stack.push(i);
    }

    System.out.println(maxArea);
  }
}
