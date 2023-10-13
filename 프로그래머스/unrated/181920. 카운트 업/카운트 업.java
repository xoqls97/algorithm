import java.util.List;
import java.util.ArrayList;



class Solution {
    public int[] solution(int a, int b) {
    
        List <Integer> list = new ArrayList<>();
        
        for(int i=a; i<=b; i++){
        list.add(i);
    
        }
        int d [] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
			d[i]=list.get(i).intValue();
		}
        
        return d;
       
    }
}