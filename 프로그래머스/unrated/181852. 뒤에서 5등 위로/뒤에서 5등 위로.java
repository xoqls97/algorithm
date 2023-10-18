import java.util.*;
class Solution {
    public int[] solution(int[] a) {
        int b[] = new int[a.length-5];
        Arrays.sort(a);
        for(int i=0; i<b.length; i++){
            b[i]=a[i+5];
        }
        return b;
        
    }
}