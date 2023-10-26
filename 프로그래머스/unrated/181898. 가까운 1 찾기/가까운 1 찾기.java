import java.util.*;
class Solution {
    public int solution(int[] a, int n) {
       		List<Integer>list = new ArrayList<>();
		
		int b=0;
		for(int i=n; i<a.length; i++) {
			if(a[i]==1) {
				list.add(i);
                 b=list.get(0);
                break;
			}else {
				b=-1;
			}
		
		}
        return b;
    }
}