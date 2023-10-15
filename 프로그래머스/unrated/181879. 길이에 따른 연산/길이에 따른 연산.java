class Solution {
    public int solution(int[] a) {
        int sum =0;
        int mul =1;
        int b=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            mul*=a[i];
        }
        if(a.length>=11){
            b=sum;
        }else if(a.length<=10){
            b= mul;
        }
       return b;
    }
}