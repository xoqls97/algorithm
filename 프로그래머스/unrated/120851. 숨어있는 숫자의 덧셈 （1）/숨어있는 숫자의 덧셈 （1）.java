class Solution {
    public int solution(String my_string) {
        String c = my_string.replaceAll("[a-zA-Z]", "");
        int d [] = new int [c.length()];
           int sum=0; 
        for(int i=0; i<c.length(); i++) {
			d[i]=Integer.parseInt(String.valueOf(c.charAt(i)));
		}
        for(int i=0; i<d.length; i++) {
			sum+=d[i];
		}
        return sum;
    }
}