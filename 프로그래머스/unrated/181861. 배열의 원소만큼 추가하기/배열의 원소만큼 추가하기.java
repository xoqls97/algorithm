import java.util.*;
class Solution {
    public int[] solution(int[] a) {
        List <Integer> list = new ArrayList<>();
        	for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i]; j++) {
				list.add(a[i]);
			}
		}
		int b[] = new int[list.size()];
		for(int i =0; i<b.length; i++) {
			b[i]=list.get(i).intValue();
		}
		
		return b;

    }
}