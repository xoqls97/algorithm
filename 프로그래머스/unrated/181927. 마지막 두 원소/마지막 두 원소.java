class Solution {
    public int[] solution(int[] a) {
        int b=0;
        int c[] = new int[a.length+1]; 
		if(a[a.length-1]>a[a.length-2]) {
			b=a[a.length-1]-a[a.length-2];
		}else if(a[a.length-1]<=a[a.length-2]) {
			b=a[a.length-1]*2;
		}
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
        c[c.length-1]=b;
        return c;
    }
}