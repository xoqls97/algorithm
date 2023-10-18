class Solution {
    public int solution(int a, int b) {
        int c=0;
        int d=0;
       
        if(a%2==1 && b%2==1){
            c=(a*a) + (b*b);
        }else if(a%2==1 || b%2==1){
            c=2*(a+b);
        }else if(a%2==0 && b%2==0){
            d=Math.max(a, b)-Math.min(a, b);
            c=d;
        }
        return c;
    }
}