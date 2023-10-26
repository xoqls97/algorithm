import java.util.*;
class Solution {
    public int[] solution(int[] a) {
        List<Integer> list= new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			list.add(a[i]);
		}
		Integer max=list.stream().mapToInt(x->x).max().orElseThrow();
		int b [] = new int[2];
		b[0]=max;
		for(int i=0; i<a.length; i++) {
			if(a[i]==max) {
				b[1]=i;
			}
		}
        return b;
       
    }
}