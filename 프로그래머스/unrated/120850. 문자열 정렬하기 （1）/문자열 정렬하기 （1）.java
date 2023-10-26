import java.util.*;
class Solution {
    public int [] solution(String s) {
        String b [] =s.replaceAll("[^0-9]", "").split("");
        Arrays.sort(b);
        int c [] = new int[b.length];
		for(int i=0; i<c.length ;i++) {
			c[i]=Integer.parseInt(b[i]);
		}
        return c;
        	
	
      
    }
}