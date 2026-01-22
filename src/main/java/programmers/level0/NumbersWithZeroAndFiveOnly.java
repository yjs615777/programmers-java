package programmers.level0;

import java.util.*;

class NumbersWithZeroAndFiveOnly {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<String> q = new ArrayDeque<>();

        q.add("5"); // 시작은 5부터 (0은 선행 0 문제 때문에 제외)

        while (!q.isEmpty()) {
            String s = q.poll();
            long val = Long.parseLong(s);

            if (val > r) continue;          // r 초과면 버림
            if (val >= l) result.add((int) val);

            // 뒤에 붙여서 다음 후보 생성 (r보다 작거나 같을 가능성이 있을 때만)
            q.add(s + "0");
            q.add(s + "5");
        }

        if (result.isEmpty()) return new int[]{-1};

        Collections.sort(result); // 오름차순
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }
}