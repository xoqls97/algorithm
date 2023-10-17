class Solution {
    public int solution(String myString, String pat) {
        int a=0;
       if(myString.toUpperCase().contains(pat.toUpperCase())){
           a=1;
       }else{
           a=0;
       }
        return a;
    }
}