package programmers.level0;
/*문자열 곱하기:
문자열 my_string과 정수 k가 주어질 때,
my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.*/
public class RepeatString {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
        //java11이상 문자열.repeat(n) n번 문자열을 반복함 문법
    }
}
