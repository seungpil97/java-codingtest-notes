import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class April03CardCount {

  static int[] cards;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    cards = new int[n];
    for (int i = 0; i < n; i++) {
      cards[i] = Integer.parseInt(st.nextToken());
    }

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    Arrays.sort(cards); // cards만 정렬

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      int target = Integer.parseInt(st.nextToken());
      int count = upperBound(target) - lowerBound(target);
      if (i > 0) sb.append(" ");
      sb.append(count);
    }

    System.out.println(sb);
  }

  private static int lowerBound(int target) {
    int left = 0, right = cards.length;
    while (left < right) {
      int mid = (left + right) / 2;
      if (cards[mid] < target) left = mid + 1;
      else right = mid;
    }
    return left;
  }

  private static int upperBound(int target) {
    int left = 0, right = cards.length;
    while (left < right) {
      int mid = (left + right) / 2;
      if (cards[mid] <= target) left = mid + 1;
      else right = mid;
    }
    return left;
  }
}