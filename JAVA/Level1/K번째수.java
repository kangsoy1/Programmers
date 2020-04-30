import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];      
        for(int i=0;i<commands.length;i++){
            
            int num = commands[i][1]-commands[i][0]+1;
            int[] answer2 = new int[num]  ;
            
            for(int j=0;j<num;j++){
                answer2[j] = array[commands[i][0]-1+j];
            }
            Arrays.sort(answer2);
            answer[i] = answer2[commands[i][2]-1];
        }
        return answer;
    }
}