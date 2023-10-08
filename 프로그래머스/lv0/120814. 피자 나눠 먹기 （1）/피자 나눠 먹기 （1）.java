class Solution {
    public int solution(int n) {
        int a =0;
        if(n<=7){
            a=1;
        }
       else if(n%7 == 0){
           a = n/7;
       }else if(n%7<7){
           a = n/7 +1; 
       }
        return a;
}
}