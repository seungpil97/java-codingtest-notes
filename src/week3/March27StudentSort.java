package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 🟡 문제 3. 국영수
 * 백준 10825번. N명의 학생 이름과 국어·영어·수학 점수가 주어질 때, 아래 기준으로 정렬해 이름을 출력하세요.
 * <p>
 * 국어 점수 내림차순
 * 국어 같으면 영어 점수 오름차순
 * 영어 같으면 수학 점수 내림차순
 * 수학도 같으면 이름 오름차순 (사전순)
 * <p>
 * 입력:
 * 12
 * Junkyu 50 60 100
 * Sangkeun 80 60 50
 * Sunyoung 80 70 100
 * Soong 50 60 90
 * Haebin 50 60 100
 * Mingi 50 60 100
 * Hyunjin 80 60 100
 * Jeong 80 60 100
 * JunBeom 70 70 70
 * SinYoong 70 70 100
 * Jeen 70 70 60
 * Sung 70 70 100
 * 출력:
 * Hyunjin
 * Jeong
 * Sangkeun
 * Sunyoung
 * JunBeom
 * Jeen
 * Sung
 * SinYoong
 * Haebin
 * Junkyu
 * Mingi
 * Soong
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 100,000
 * 점수는 0 이상 100 이하
 * 이름은 알파벳 대소문자, 최대 10자
 */
public class March27StudentSort {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] names = new String[n];
    int[][] scores = new int[n][3];  // [0]=국어, [1]=영어, [2]=수학

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      names[i] = st.nextToken();
      scores[i][0] = Integer.parseInt(st.nextToken()); // 국어
      scores[i][1] = Integer.parseInt(st.nextToken()); // 영어
      scores[i][2] = Integer.parseInt(st.nextToken()); // 수학
    }

    // 0, 1, 2, ... n-1 인덱스를 담은 배열
    Integer[] idx = new Integer[n];
    for (int i = 0; i < n; i++) idx[i] = i;

    // 인덱스를 기준으로 정렬
    Arrays.sort(idx, (a, b) -> {
      if (scores[a][0] != scores[b][0])
        return scores[b][0] - scores[a][0]; // 국어 내림차순

      else if (scores[a][1] != scores[b][1])
        return scores[a][1] - scores[b][1]; // 국어 같으면 영어 오름차순

      else if (scores[a][2] != scores[b][2])
        return scores[b][2] - scores[a][2]; // 영어 같으면 수학 점수 내림차순

      else return names[a].compareTo(names[b]); // 수학도 같으면 이름 오름차순
    });

    // 정렬된 인덱스 순서로 이름 출력
    StringBuilder sb = new StringBuilder();
    for (int i : idx) {
      sb.append(names[i]).append('\n');
    }
    System.out.print(sb);
  }
}
