class Solution {
    public int[] solution(int[] num_list) {
        int cnt =0;
        int cnt2=0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 ==0){
                cnt++;
            }else{
                cnt2++;
            }
        }
   int a [] = new int[]   {cnt,cnt2};
        
        
        return a;
    }
}