class Solution {
    public int solution(int n) {
      int sum=0;
	    
	    if(n%2==1) {
	    	for(int i=n; i>0; i--) {
	    		if(i%2==1) {
	    			sum+=i;
	    		}
	    	}
	    }else if(n%2==0) {
	    	for(int i=n; i>0; i--) {
	    		if(i%2==0) {
	    			sum+=i*i;
	    		}
	    	}
	    }
        return sum;
        
    }
}