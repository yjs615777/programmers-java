package programmers.level0;
/*
26.01.09
I로 만들기:
알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
*/
public class MakeItL {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) { //**toCharArray** 문자열을 “글자 단위”로 쪼개고 Array가됨
            if (c < 'l') sb.append('l');
            else sb.append(c);
            /* l보다 작은 알파벳이라면 l로 append 아니라면 원래 char로 append
              ex)입력:abclmno 출력:llllmno */
        }
        return sb.toString();
    }
}