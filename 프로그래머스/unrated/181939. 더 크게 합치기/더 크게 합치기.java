class Solution {
    public int solution(int a, int b) {
        String stra=String.valueOf(a);
		String strb = String.valueOf(b);
		
		String result = stra+strb; 
		String result1 =strb+stra;
		int c = Integer.parseInt(result);
		int d = Integer.parseInt(result1);
		int e = Math.max(c, d);
		if(c==d) {
			return c;
		}else {
			return e;
		}
       
    }
}