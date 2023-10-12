class Solution {
    public int solution(int price) {
        double a=0;
        if(price>=100000 && price<300000){
         a=(price-(price*0.05));
            
           
            
        }else if(price>=300000 && price<500000){
        a=(price-(price*0.1));
            
            
            
        }else if(price>=500000){
        a=(price-(price*0.2));    
            
        }else if(price<100000){
            a=price;
        }
        return (int) a;
      
        
        
        
        
    }
}