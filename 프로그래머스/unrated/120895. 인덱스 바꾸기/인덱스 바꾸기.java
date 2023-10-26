class Solution {
    public String solution(String s, int num1, int num2) {
        StringBuilder sb= new StringBuilder(s);
        sb.setCharAt(num2, s.charAt(num1));
        sb.setCharAt(num1, s.charAt(num2));
        String c =sb.toString();
        return c;
    }
}