package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 🟢 문제 1. 두 배열 합쳐서 정렬
 * 두 개의 오름차순 정렬된 배열이 주어졌을 때, 두 배열을 합쳐서 오름차순으로 출력하시오.
 * 입력:
 * <p>
 * 3
 * 1 3 5
 * 4
 * 2 4 6 8
 * 출력: 1 2 3 4 5 6 8
 * <p>
 * 제약 조건:
 * - 1 ≤ N, M ≤ 100,000
 * - 이미 정렬된 배열임을 활용할 것
 */
public class March25MergeArrays {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int firstSize = Integer.parseInt(br.readLine());
    StringTokenizer firstTokenizer = new StringTokenizer(br.readLine());
    int[] firstArr = new int[firstSize];
    for (int i = 0; i < firstSize; i++) {
      firstArr[i] = Integer.parseInt(firstTokenizer.nextToken());
    }

    int secondSize = Integer.parseInt(br.readLine());
    StringTokenizer secondTokenizer = new StringTokenizer(br.readLine());
    int[] secondArr = new int[secondSize];
    for (int i = 0; i < secondSize; i++) {
      secondArr[i] = Integer.parseInt(secondTokenizer.nextToken());
    }


    StringBuilder sb = new StringBuilder();
    int i = 0, j = 0;

    while (i < firstSize && j < secondSize) {
      if (firstArr[i] <= secondArr[j]) {
        sb.append(firstArr[i++]);
      } else {
        sb.append(secondArr[j++]);
      }
      sb.append(" ");
    }

    while (i < firstSize) {
      sb.append(firstArr[i++]).append(" ");
    }

    while (j < secondSize) {
      sb.append(secondArr[j++]).append(" ");
    }

    System.out.println(sb.toString().trim());
  }
}
