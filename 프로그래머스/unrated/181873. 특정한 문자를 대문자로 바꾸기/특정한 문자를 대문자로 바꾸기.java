class Solution {
    public String solution(String my_string, String alp) {
        String a = "";
        if(my_string.contains(alp)){
       String s = String.valueOf(my_string.charAt(my_string.indexOf(alp))); 
        String S = s.toUpperCase();
        a=my_string.replace(alp, S);
        
    }
    else{
        a=my_string;
    }
       return a;
    }
}