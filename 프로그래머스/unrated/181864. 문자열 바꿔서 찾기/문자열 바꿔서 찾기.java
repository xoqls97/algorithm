class Solution {
    public int solution(String myString, String pat) {
       StringBuilder c = new StringBuilder(); 
          for (int i = 0; i < myString.length(); i++) {
	            if (myString.charAt(i) == 'A') {
	                c.append('B');
	            } else {
	                c.append('A');
	            }
	        }
        int d=0;
        if(c.toString().contains(pat)) {
            	d=1;
            }else {
            	d=0;
            }
        return d;
    }
}