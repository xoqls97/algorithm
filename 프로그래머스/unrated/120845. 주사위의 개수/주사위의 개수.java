class Solution {
    public int solution(int[] box, int n) {
        
        int c=(box[0]/n) * (box[1]/n) * (box[2]/n);
        return c;
    }
}