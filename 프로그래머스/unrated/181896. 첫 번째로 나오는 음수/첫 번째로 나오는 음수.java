class Solution {
    public int solution(int[] a) {
      int cnt=0;
      
     
        int b=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<0) {
                b=i;
                break;
            
			}else{
                cnt++;
            }
		}

        if(cnt==a.length){
            b=-1;
        }
        return b;
        
    }
}