import java.util.*;
class Solution {
    public int[] solution(int n) {
        	List <Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				list.add(i);
			}
		}
		int arr[]=new int[list.size()];
		for(int i=0; i<arr.length;i++) {
			arr[i]=list.get(i);
		}
        return arr;
      
    }
}