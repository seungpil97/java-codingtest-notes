package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟢 문제 1. 피보나치 수
 * 클래스명: March30Fibonacci
 * 0번째 피보나치 수는 0, 1번째는 1이다.
 * 그 다음부터는 바로 앞 두 수의 합이 된다.
 * n이 주어졌을 때, n번째 피보나치 수를 출력하라.
 * 입력:
 * 10
 * 출력:
 * 55
 * 제약 조건:
 * <p>
 * 0 ≤ n ≤ 20
 * 재귀 함수로 구현할 것 (반복문 사용 금지)
 * <p>
 * <p>
 * 💡 n = 0 → 0, n = 1 → 1, n = 2 → 1, n = 3 → 2, n = 4 → 3, n = 5 → 5 ...
 * <p>
 * 백준: 10870번
 */
public class March30Fibonacci {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int result = fibonacci(n);

    System.out.println(result);

  }

  private static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
