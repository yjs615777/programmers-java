package programmers.level0;
//더 크게 합치기:
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
public class ConcatenateIntegers {
    public int solution(int a, int b) {
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        if(Integer.parseInt(result1)>Integer.parseInt(result2))
        {
            return Integer.parseInt(result1);
        }
        else
        {
            return Integer.parseInt(result2);
        }

        //String.valueOf() 정수=>String , Integer.parseInt() String => 정수
    }
}
