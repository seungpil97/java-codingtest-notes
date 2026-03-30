package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 1. 병합 정렬 구현
 * 정수 배열을 병합 정렬(Merge Sort) 로 오름차순 정렬하여 출력하세요.
 * Arrays.sort() 사용 금지 — 직접 구현해야 합니다.
 * 입력:
 * 5
 * 3 1 4 1 5
 * 출력:
 * 1 1 3 4 5
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * -1,000,000 ≤ 원소 ≤ 1,000,000
 * N이 크므로 O(n log n) 구현 필수
 */
public class March27MergeSort {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());

    }
    // 1. mergeSort() 메서드 호출
    mergeSort(nums, 0, n - 1);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(' ');
      sb.append(nums[i]);
    }
    System.out.println(sb);

  }

  static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;  // ← 이미 드린 탈출 조건

    int mid = (left + right) / 2;

    mergeSort(arr, left, mid);   // 왼쪽 절반 범위
    mergeSort(arr, mid + 1, right);   // 오른쪽 절반 범위
    merge(arr, left, mid, right);         // 합치기

  }

  static void merge(int[] arr, int left, int mid, int right) {

    int[] temp = new int[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= right) {

      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }

    while (i <= mid) temp[k++] = arr[i++];
    while (j <= right) temp[k++] = arr[j++];


    for (int idx = 0; idx < temp.length; idx++) {
      arr[left + idx] = temp[idx];
    }
  }

}
