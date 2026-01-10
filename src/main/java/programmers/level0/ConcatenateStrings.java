package programmers.level0;

public class ConcatenateStrings {
    public String solution(String[] arr) {
        String answer="";
        for(String s: arr)
        {
            answer += s;
        }
        return answer;
    }
}
