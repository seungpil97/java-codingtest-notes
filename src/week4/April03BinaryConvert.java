package week4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🟢 문제 1. 이진수 변환
 * 클래스명: April03BinaryConvert
 * 10진수 양의 정수 N을 입력받아, 재귀 함수를 이용해 2진수 문자열로 변환하여 출력하라.
 * 반복문(while, for) 사용 금지 — 재귀로만 구현한다.
 * 입력:
 * 10
 * 출력:
 * 1010
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000,000
 * 반복문 사용 금지, 재귀로만 구현
 */
public class April03BinaryConvert {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    binaryConvert(n, sb);

    System.out.println(sb);
  }

  private static void binaryConvert(int n, StringBuilder sb) {

    if (n < 2) {
      sb.append(n); // n이 0이면 "0", 1이면 "1"
      return;
    }
    binaryConvert(n / 2, sb);
    sb.append(n % 2);
  }
}
