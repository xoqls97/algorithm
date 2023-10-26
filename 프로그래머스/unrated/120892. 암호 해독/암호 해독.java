class Solution {
    public String solution(String cipher, int code) {
     StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb.append(" ");
		sb.append(cipher);
		
		for(int i=0; i<sb.length(); i++) {
			if(i%code==0) {
				sb2.append(sb.charAt(i));
			}
		}  
        return String.valueOf(sb2.deleteCharAt(0));
    }
}