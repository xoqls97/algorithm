import java.util.*;
class Solution {
    public int[] solution(int a, int b) {
        List <Integer> list = new ArrayList<>();
        
        for(int i=a; i>=b; i--){
            list.add(i);
        }
        int c [] = new int[list.size()];
        for(int i=0; i<c.length; i++){
            c[i]=list.get(i).intValue();
        }
        return c;
        


    }
}