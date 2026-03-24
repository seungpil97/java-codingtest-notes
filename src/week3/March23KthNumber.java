package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 문제 3. 정렬로 K번째 수 찾기
 * N개의 수가 주어졌을 때, i번째부터 j번째까지 자른 후 정렬했을 때 k번째 수를 출력하시오.
 * 입력:
 * 5
 * 1 5 2 6 3
 * 2 5 3
 * (배열 크기 N / 배열 / i j k)
 * 출력: 5
 * 제약 조건:
 * - 1 ≤ N ≤ 100
 */
public class March23KthNumber {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    String[] condition = br.readLine().split(" ");

    int[] nums = new int[input.length];
    int[] arr = new int[condition.length];

    for (int i = 0; i < input.length; i++) {
      nums[i] = Integer.parseInt(input[i]);
    }

    for (int i = 0; i < condition.length; i++) {
      arr[i] = Integer.parseInt(condition[i]);
    }

    List<Integer> sortNums = new ArrayList<>();

    int startIndex = arr[0];
    int endIndex = arr[1];
    int k = arr[2];
    for (int i = 0; i < nums.length; i++) {

      if (i >= startIndex - 1 && i <= endIndex - 1) {
        sortNums.add(nums[i]);
      }
    }

    Collections.sort(sortNums);

    System.out.println(sortNums.get(k - 1));
  }
}
