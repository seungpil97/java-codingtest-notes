package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 🟢 문제 1. 두 수의 합 (Two Sum)
 * 클래스명: April06TwoSum
 * 정수 배열 numbers와 정수 target이 주어진다.
 * 배열에서 두 수를 골라 더했을 때 target이 되는 두 인덱스를 출력하라.
 * 항상 정답이 존재하며, 같은 원소를 두 번 사용할 수 없다.
 * 인덱스는 작은 것부터 출력한다.
 * 입력:
 * 5 9
 * 2 7 4 1 3
 * (원소 개수, target / 배열)
 * 출력:
 * 0 1
 * (numbers[0]=2, numbers[1]=7 → 합=9)
 * 제약 조건:
 * <p>
 * 2 ≤ N ≤ 100,000
 * -10,000 ≤ numbers[i] ≤ 10,000
 * 정답은 항상 하나만 존재
 * <p>
 * N이 100,000입니다. O(n²) 이중 루프는 시간 초과가 날 수 있습니다.
 */
public class April06TwoSum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int target = Integer.parseInt(input[1]);
    StringTokenizer st = new StringTokenizer(br.readLine());

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      int partner = target - num;
      if (map.containsKey(partner)) {
        int partnerIndex = map.get(partner);
        System.out.println(partnerIndex + " " + i);
        break;
      }

      map.put(num, i);
    }
  }
}
