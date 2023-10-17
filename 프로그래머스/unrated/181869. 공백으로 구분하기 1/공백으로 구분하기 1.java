import java.util.*;
class Solution {
    public String[] solution(String s) {
       List <String> list = new ArrayList<>();
		for(int i=0; i<s.split(" ").length; i++) {
			if(s.contains(" ")) {
				list.add(s.split(" ")[i]);
			}else {
				list.add(s);
			}
			
		} 
        String[] array = list.toArray(new String[0]);
        return array;
       
    }
}