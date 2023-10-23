class Solution {
    public int solution(int[] a, int[] a1) {
        int sum=0;
		int sum1=0;
        int b=0;
        if(a.length!=a1.length) {
			if(a.length>a1.length) {
				b=1;
			}else {
				b=-1;
			}
		}else {
			for(int i=0; i<a.length; i++) {
				sum+=a[i];
			}
			for(int i=0; i<a1.length; i++) {
				sum1+=a1[i];
			}
			if(sum==sum1) {
				b=0;
			}else if(sum>sum1) {
				b=1;
			}else {
				b=-1;
			}
		}
        return b;
		
       
    }
}