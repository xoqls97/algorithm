class Solution {
    public int solution(int price) {
      double result=0;
        if(price>=100000 && price<300000) {
       result=price-(price*0.05);
	}else if(price>=300000 && price<500000) {
		 result=price-(price*0.1);
	}else if(price>=500000) {
		 result=price-(price*0.2);
	}else if(price<100000){
            result=price;
        }
        return (int)result;
		
        
        
    }
}