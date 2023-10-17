class Solution {
    public int solution(String a, String b) {
       int t=0;
		StringBuffer sb = new StringBuffer(a);
        StringBuffer sb2 = new StringBuffer(b);
		String areverse = sb.reverse().toString();
		String breverse = sb2.reverse().toString();
		if(areverse.length()<breverse.length()) {
			return 0;
		}
        for(int i=0; i<breverse.length(); i++) {
			if(areverse.charAt(i)!=breverse.charAt(i)) {
				return 0;
				
			}
			}
        return 1;
    }
}