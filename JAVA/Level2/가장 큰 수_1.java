import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String max = "";
        int answer2 = 0;
        int max2 = 0;
        int cnt = numbers.length;
        Arrays.sort(numbers);
        
        do{
            max = "";
            for(int j=0;j<cnt;j++){
                max += numbers[j];
            }
            if(max2<Integer.parseInt(max)){
                max2 = Integer.parseInt(max);
            }
        }while(find(cnt,numbers));
        return Integer.toString(max2);
    }
    
    public boolean find(int n, int[] ar){
        int i = n-1;
        while(i>0&&ar[i-1]>=ar[i]){
            i--;
        }
        if(i<=0) return false;
        int j = n-1;
        while(ar[j]<=ar[i-1]){
            j --;
        }
        swap(j,i-1,ar);
        j = n-1;
        while(i<j){
            swap(i,j,ar);
            i++;
            j--;
        }
        return true;
    }
    
    public static void swap(int a, int b, int[] ar) {
        int tmp = ar[a];
        ar[a] = ar[b];
        ar[b] = tmp;
    }
}