import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
     List <String> list = new ArrayList<String>();   for(int i=1; i<cipher.length(); i++) {
		if(i%code==0) {
		list.add(String.valueOf(cipher.charAt(i-1)));
		}
		
	}
	if(cipher.length()%code==0) {
		list.add(String.valueOf(cipher.charAt(cipher.length()-1)));
	}
    StringBuffer sb = new StringBuffer();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        String result = sb.toString();
        return result;

        
    
    }
}