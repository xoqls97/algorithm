class Solution {
    public int solution(int a, int b) {
       String c= String.valueOf(a);
		String d= String.valueOf(b);
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		sb.append(d);
		int f = Integer.parseInt(sb.toString());
        if(f==2*a*b){
            return f;
        }else{
            return Math.max(2*a*b,f);
        }
    }
}