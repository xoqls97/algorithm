class Solution {
    public int solution(int n, int k) {
		
		int sheep = 12000;
		int drink = 2000;
		int sale = k-(n/10);
		
		int result = (n*sheep)+(sale*drink);
		return result;
    }
}