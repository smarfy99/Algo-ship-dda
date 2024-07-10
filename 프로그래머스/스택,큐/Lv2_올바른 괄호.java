import java.util.Stack;

class Solution {
    boolean solution(String s) {
        int count = 0; // '('의 개수를 저장하기 위한 변수

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                if (count == 0) {
                    return false; // ')'가 더 많이 나왔을 경우
                }
                count--;
            }
        }

        return count == 0; // '('와 ')'의 개수가 맞아야 올바른 괄호
    }
}
