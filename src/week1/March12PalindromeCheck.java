package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 2
 * 문자열이 하나 주어졌을 때, 해당 문자열이 회문인지 판별하시오.
 * 회문이면 YES, 아니면 NO를 출력하시오.
 * 단, 대소문자는 구분하지 않는다.
 */
public class March12PalindromeCheck {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();

        int lt = 0;
        int rt = input.length() - 1;

        while (lt < rt) {
            if (input.charAt(lt) != input.charAt(rt)) {
                System.out.println("NO");
                return;
            }
            lt++;
            rt--;
        }

        System.out.println("YES");
    }
}