import java.util.*;
class Solution {
    public int solution(int[] a) {
      StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
        for(int i=0; i<a.length; i++) {
			int num = a[i];
			if(num%2 == 0) {
				even.append(num);
			} else {
				odd.append(num);
			}
		}
		int evensum = Integer.parseInt(even.toString());
		int oddsum = Integer.parseInt(odd.toString());
        return evensum+oddsum;
    }
}