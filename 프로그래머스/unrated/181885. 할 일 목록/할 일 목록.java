import java.util.*;
class Solution {
    public String[] solution(String[] a, boolean[] b) {
        List <String> list = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			if(b[i]==false) {
				list.add(a[i]);
			}
		}
        	String [] result = list.toArray(new String[list.size()]);
		return result;
       
    }
}