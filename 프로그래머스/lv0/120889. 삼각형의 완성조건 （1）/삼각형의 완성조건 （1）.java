class Solution {
    public int solution(int[] sides) {
         int a = 0;
         if(sides[0]>=sides[1]+sides[2] || sides[1]>=sides[0]+sides[2] || sides[2]>=sides[1]+sides[0]) {
             a=2;
        	 
         }else if(sides[0]<sides[1]+sides[2] || sides[1]<sides[0]+sides[2] || sides[2]<sides[1]+sides[0]) {
        	a=1;
         }
        return a;
    }
}