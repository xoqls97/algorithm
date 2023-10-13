class Solution {
    public int[] solution(int[] arr, int k) {
        int b [] = new int [arr.length];
        if(k%2 ==1) {
			for(int i=0; i<arr.length; i++) {
				b[i] = arr[i]*k;
			}
		}
			else if(k%2==0){
				for(int i=0;i<arr.length; i++) {
					b[i]=arr[i]+k;
					
					
				}
			}
        return b;
    }
}