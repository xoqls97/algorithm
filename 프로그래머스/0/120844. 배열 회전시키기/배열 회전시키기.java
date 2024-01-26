class Solution {
    public int[] solution(int[] numbers, String direction) {
        
       int a [] = new int[numbers.length]; 
        
        	if(direction.equals("right")) {
			a[0]=numbers[numbers.length-1];
			for(int i=1; i<numbers.length; i++) {
				a[i]=numbers[i-1];
				
			}
				
			}
		else if(direction.equals("left")) {
			for(int i=0; i<numbers.length-1; i++) {
				a[i]=numbers[i+1];
			}
			a[numbers.length-1]=numbers[0];
		}
        return a;
    }
}