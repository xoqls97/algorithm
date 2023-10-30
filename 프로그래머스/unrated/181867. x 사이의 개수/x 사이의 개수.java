import java.util.*;
class Solution {
    public int[] solution(String s) {
        String [] div = s.split("x");
		List <Integer> list = new ArrayList<>();
		if(s.charAt(s.length()-1)=='x') {
			for(int i=0; i<div.length; i++) {
				list.add(div[i].length());
			}
			list.add(0);
			
		}else {
			for(int i=0; i<div.length; i++) {
				list.add(div[i].length());
			}
			
		}
        int [] c = new int [list.size()];
        for(int i=0; i<c.length; i++){
            c[i]=list.get(i).intValue();
        }
        return c;
       
    }
}