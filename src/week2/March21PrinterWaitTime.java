package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 2. 프린터 큐 대기 시간
 * N개의 작업이 큐에 들어있고 각 작업의 처리 시간이 주어진다.
 * 앞에서부터 순서대로 처리하며, M번째 작업(0-index)이 완료되는 시점의 총 경과 시간을 출력하시오.
 * 입력:
 * 5 2
 * 3 1 4 1 5
 * 출력: 8
 * 제약 조건:
 * - 1 ≤ N ≤ 100
 */
public class March21PrinterWaitTime {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] firstLine = br.readLine().split(" ");
    int m = Integer.parseInt(firstLine[1]);  // 2

    String[] input = br.readLine().split(" ");

    int sum = 0;

    for (int i = 0; i <= m; i++) {
      sum += Integer.parseInt(input[i]);
    }

    System.out.println(sum);


  }

}
