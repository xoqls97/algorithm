import java.util.*;
class Solution {
    public int[] solution(int[] a, int n) {
        List <Integer> list= new ArrayList<>();
		List <Integer> listafter= new ArrayList<>();
		List <Integer> listbefore= new ArrayList<>();
      	for(int i=0; i<a.length;i++) {
			list.add(a[i]);
		}
		for(int i=n; i<a.length; i++) {
			listafter.add(a[i]);
		}
		for(int i=0; i<n; i++) {
			listbefore.add(a[i]);
		}
		for(int i=0; i<listbefore.size();i++) {
			listafter.add(listbefore.get(i));
		}
		int b [] = new int[listafter.size()];
		for(int i=0; i<b.length; i++) {
			b[i]= listafter.get(i).intValue();
		}
        return b;
    }
}