import java.util.*;
class Solution {
    public int[] solution(int[] a) {
        Arrays.sort(a);
		int b [] = new int[5];
		for(int i=0; i<5; i++) {
			b[i]=a[i];
			
			
		}
		Arrays.sort(b);
        return b;
     
    }
}