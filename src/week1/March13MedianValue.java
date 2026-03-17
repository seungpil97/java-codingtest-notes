package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 3. 중간값 찾기
 * 정수들이 공백으로 구분되어 주어졌을 때, 오름차순 정렬 후 중간값을 출력하시오. 단, 정수의 개수는 홀수라고 가정한다.
 * 입력: 7 1 9 3 5
 * 출력: 5
 */
public class March13MedianValue {

  public static void main(String[] args) throws IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] tokens = br.readLine().split(" ");
    int[] nums = new int[tokens.length];

    for (int i = 0; i < tokens.length; i++) {
      nums[i] = Integer.parseInt(tokens[i]);
    }

    Arrays.sort(nums);
    System.out.println(nums[nums.length / 2]);
  }
}
