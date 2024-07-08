import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> que = new ArrayDeque<>();
        int[] answer;
        
        //배열의 첫번째 값 저장
        int num = arr[0];
        que.add(num);
        
        for(int i=1; i<arr.length; i++){
            if(num != arr[i]){
                num = arr[i];
                que.add(num);
            }
        }
        
        answer = new int[que.size()];
        int idx = 0;
        
        while(!que.isEmpty()){
            answer[idx] = que.poll();
            idx++;
        }
        return answer;
    }
}
