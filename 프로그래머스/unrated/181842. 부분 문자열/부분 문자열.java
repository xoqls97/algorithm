class Solution {
    public int solution(String str1, String str2) {
        int a=0;
        if(str2.contains(str1)){
            a=1;
        }else{
            a=0;
        }
        return a;
    }
}