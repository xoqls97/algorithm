class Solution {
    public String solution(String a) {
        String answer = "";
        answer= a.replace("a", "");
		answer=answer.replace("e", "");
		answer=answer.replace("i", "");
		answer=answer.replace("o", "");
		answer=answer.replace("u", "");
        return answer;
    }
}