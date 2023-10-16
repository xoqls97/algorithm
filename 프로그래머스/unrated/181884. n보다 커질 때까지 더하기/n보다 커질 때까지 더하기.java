class Solution {
    public int solution(int[] numbers, int n) {
       int sum=0; 
        for(int i=0; i<numbers.length; i++) {
				while(sum<=n) {
				sum+=numbers[i];
				break;
			}
		}
        return sum;
      
    }
}