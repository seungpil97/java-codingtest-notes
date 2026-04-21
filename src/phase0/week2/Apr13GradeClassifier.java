package phase0.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 🟢 문제 1. 성적 등급 분류
 * 클래스명: Apr13GradeClassifier
 * N명의 학생 점수가 주어진다.
 * 각 점수를 아래 기준에 따라 등급으로 변환하여 출력하라.
 * 90 이상        → A
 * 80 이상 90 미만 → B
 * 70 이상 80 미만 → C
 * 60 이상 70 미만 → D
 * 60 미만        → F
 * 입력:
 * 5
 * 95 82 73 61 45
 * 출력:
 * A B C D F
 * 제약 조건:
 * <p>
 * 1 ≤ N ≤ 1,000
 * 0 ≤ 점수 ≤ 100
 * 출력은 공백으로 구분
 */
public class Apr13GradeClassifier {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {

      int score = Integer.parseInt(st.nextToken());
      String grade;

      if (i > 0) {
        sb.append(" ");
      }

      grade = getGrade(score);

      sb.append(grade);
    }

    System.out.println(sb);


  }

  private static String getGrade(int score) {
    String grade;
    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    return grade;
  }
}
