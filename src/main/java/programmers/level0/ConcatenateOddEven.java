package programmers.level0;
/*
이어 붙인 수:
정수가 담긴 리스트 num_list가 주어집니다.
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class ConcatenateOddEven {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }

        int oddNum = odd.length() == 0 ? 0 : Integer.parseInt(odd.toString());
        int evenNum = even.length() == 0 ? 0 : Integer.parseInt(even.toString());

        return oddNum + evenNum;
    }
}
