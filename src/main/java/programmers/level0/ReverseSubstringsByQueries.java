package programmers.level0;

public class ReverseSubstringsByQueries {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];

            // s~e 구간 뒤집기 (양끝에서 스왑)
            while (s < e) {
                char left = sb.charAt(s);
                char right = sb.charAt(e);

                sb.setCharAt(s, right);
                sb.setCharAt(e, left);

                s++;
                e--;
            }
        }

        return sb.toString();
    }
}
