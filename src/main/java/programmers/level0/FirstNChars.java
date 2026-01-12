package programmers.level0;
/*
 문자열의 앞의 n글자:
 문자열 my_string과 정수 n이 매개변수로 주어질 때,
  my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요. 
 */
public class FirstNChars {
	 public String solution(String my_string, int n) {
	        String answer = my_string.substring(0,n);
	        //substring(x,y)x인덱스 부터 y인덱스까지 *y인덱스는 포함안됨*
	        //substring(x) x인덱스부터 끝까지 출력 
	        return answer;
	    }

}
