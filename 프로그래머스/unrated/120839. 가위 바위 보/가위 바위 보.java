import java.util.*;
class Solution {
    public String solution(String rsp) {
      List <String> list = new ArrayList<>();
		for(int i=0; i<rsp.length(); i++) {
				switch(String.valueOf(rsp.charAt(i))){
					case "2":
						list.add("0");
						break;
					case "0":
						list.add("5");
						break;
					case"5":
						list.add("2");
						break;
						default:break;
						
				}
		}
      String str = String.join("", list);
        return str;
    }
}