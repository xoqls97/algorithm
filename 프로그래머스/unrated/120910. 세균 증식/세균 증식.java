class Solution {
    public int solution(int n, int t) {
      int cnt = 0;  
        int a [] = new int [t+1];
        for(int i=0; i<=t; i++) {
		cnt =(int) Math.pow(2, i+1);
		a[i]=n*cnt;
		}
    return a[t-1];
        
    }
}