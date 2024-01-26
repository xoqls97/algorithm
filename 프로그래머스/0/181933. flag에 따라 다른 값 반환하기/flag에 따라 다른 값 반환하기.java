class Solution {
    public int solution(int a, int b, boolean flag) {
        int c=0;
        if(flag==true){
            c= a+b;
        }
        if(flag==false){
            c= a-b;
        }
return c;
    }
}