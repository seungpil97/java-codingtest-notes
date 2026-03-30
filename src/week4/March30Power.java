package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟡 문제 2. 재귀로 거듭제곱 구하기
 * 클래스명: March30Power
 * 정수 base와 지수 exp가 주어진다.
 * base^exp를 재귀로 계산해서 출력하라.
 * 입력:
 * 3 5
 * 출력:
 * 243
 * 제약 조건:
 * <p>
 * 1 ≤ base ≤ 10
 * 0 ≤ exp ≤ 20
 * 재귀 함수로 구현할 것 (Math.pow 사용 금지)
 * base^0 = 1
 */
public class March30Power {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int base = Integer.parseInt(input[0]);
    int exp = Integer.parseInt(input[1]);

    int result = getPower(base, exp);
    System.out.println(result);
  }

  private static int getPower(int base, int exp) {

    if (exp == 0) return 1;

    return base * getPower(base, exp - 1);
  }
}
