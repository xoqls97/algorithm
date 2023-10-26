class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else {
				result.append(Character.toUpperCase(c));
			}
		}
        return result.toString();
    }
}