import java.util.*;
class Solution {
    public String[] solution(String[] a) {
         List<String> list = new ArrayList<>();
	    for(int i=0; i<a.length; i++) {
	    	if(i%5==0) {
	    	   list.add(a[i]);
	    	}
	    	
	    }
        String[] sArrays = list.toArray(new String[list.size()]);
        
        return sArrays;
    }
}