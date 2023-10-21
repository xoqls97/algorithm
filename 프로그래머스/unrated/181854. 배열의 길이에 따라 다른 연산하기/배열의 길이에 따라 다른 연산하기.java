class Solution {
    public int[] solution(int[] a, int n) {
	if(a.length%2==1) {
			for(int i=0; i<a.length;i++) {
				if((i+2)%2==0) {
					a[i]=a[i]+n;
				}
			}
		}else {
			for(int i=0; i<a.length; i++) {
				if((i+1)%2==1) {
					a[i+1]=a[i+1]+n;
				}
			}
		}
        return a;
    }
}