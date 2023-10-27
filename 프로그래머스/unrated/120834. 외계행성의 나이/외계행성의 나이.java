import java.util.*;
class Solution {
    public String solution(int age) {
        String re="";
        int tho=0;
        int hun=0;
		int ten=0;
		int one=0;
		List<String> list= new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(char i='a'; i<='z'; i++) {
			list.add(String.valueOf(i));
		}
		
		String str = String.valueOf(age);
        if(str.length()==4){
            
            tho=1;
            sb.append(list.get(tho));
        sb.append(list.get(hun));
            sb.append(list.get(ten));
            sb.append(list.get(one));
            return sb.toString();
            
        }
		else if(str.length()>2 && str.length()<4) {
			hun=age/100;
			ten=(age%100)/10;
			one=(age%100)%10;
			sb.append(list.get(hun));
			sb.append(list.get(ten));
			sb.append(list.get(one));
            return sb.toString();
			
		
			
			
		}else if(str.length()==1){
            one=age;
sb.append(list.get(one));
            return sb.toString();
            }
        else {
			ten=age/10;
			one = age%10;
			sb.append(list.get(ten));
			sb.append(list.get(one));
            return sb.toString();
			
		}
        
		
    }
}