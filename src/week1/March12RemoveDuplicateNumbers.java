package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 문제 3
 * 정수들이 공백으로 구분되어 주어졌을 때, 중복된 숫자를 제거하고 처음 등장한 숫자만 남겨서 출력하시오.
 * 단, 숫자의 등장 순서는 유지해야 한다.
 */
public class March12RemoveDuplicateNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        Set<Integer> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String s : input) {
            int num = Integer.parseInt(s);

            if (seen.add(num)) {

                if (!sb.isEmpty()) {
                    sb.append(" ");
                }
                sb.append(num);
            }
        }

        System.out.println(sb);
    }
}