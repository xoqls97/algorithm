import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] del) {
     List <Integer> list = new ArrayList<>();
		List <Integer> alist = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<del.length; j++) {
				if(arr[i]==del[j]) {
					list.add(arr[i]);
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			alist.add(arr[i]);
		}
		for(int i=0; i<list.size();i++) {
			alist.remove(list.get(i));
		}
		int b [] = new int[alist.size()];
		for(int i=0; i<b.length; i++) {
			b[i]=alist.get(i).intValue();
		}
        return b;
    }
}