class Solution {
    public int[] solution(int money) {
        int x= 0;
        int y= 0;
        
        
        if(money<5500){
            x=0; y=money;
        }else{
            x=money/5500;
            y=money - (x*5500);
        
    
        }
        int a [] = new int []{x,y};
        return a;
        
        
    }
}