import java.util.*;



class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List <String> termslist1 = new ArrayList<>();
	    List <String> termslist2 = new ArrayList<>();
	    List <String> privacieslist1 = new ArrayList<>();
	    List <String> privacieslist2 = new ArrayList<>();
	    List <String> privaciesdatelisty= new ArrayList<>();
	    List <String> privaciesdatelistm= new ArrayList<>();
	    List <String> privaciesdatelistd= new ArrayList<>();
	    List <String> todaylisty = new ArrayList<>();
	    List <String> todaylistm = new ArrayList<>();
	    List <String> todaylistd = new ArrayList<>();
	    List <Integer> answer = new ArrayList<>();
        todaylisty.add(today.split("[.]")[0]);
	    todaylistm.add(today.split("[.]")[1]);
	    todaylistd.add(today.split("[.]")[2]);
	    for(int i=0; i<terms.length; i++) {
	    	termslist1.add(terms[i].split(" ")[0]);
	    }
	    for(int i=0; i<terms.length; i++) {
	    	termslist2.add(terms[i].split(" ")[1]);
	    }
	    for(int i=0; i<privacies.length; i++) {
	    	privacieslist1.add(privacies[i].split(" ")[0]);
	    }
	    for(int i=0; i<privacies.length; i++) {
	    	privacieslist2.add(privacies[i].split(" ")[1]);
	    }
	    for(int i=0; i<privacies.length; i++) {
	    	privaciesdatelisty.add(privacieslist1.get(i).split("[.]")[0]);
	    }
	    for(int i=0; i<privacies.length; i++) {
	    	privaciesdatelistm.add(privacieslist1.get(i).split("[.]")[1]);
	    }
	    for(int i=0; i<privacies.length; i++) {
	    	privaciesdatelistd.add(privacieslist1.get(i).split("[.]")[2]);
	    }

	    for(int i=0; i<termslist1.size(); i++) {
	    	for(int j=0; j<privacieslist1.size(); j++) {
	    		if(termslist1.get(i).equals(privacieslist2.get(j))) {
	    			if((Integer.parseInt(todaylisty.get(0))*336)+(Integer.parseInt(todaylistm.get(0))*28)+Integer.parseInt(todaylistd.get(0))
	    			-(Integer.parseInt(termslist2.get(i))*28)>=(Integer.parseInt(privaciesdatelisty.get(j))*336)+(Integer.parseInt(privaciesdatelistm.get(j))*28)+Integer.parseInt(privaciesdatelistd.get(j))) {
	    				answer.add(j);
	    			}
	    			
	    			
	    		}
	    	}
	    }
	    int answerarr [] = new int[answer.size()];
	   for(int i=0; i<answer.size(); i++ ) {
		   
		  answerarr[i] = answer.get(i).intValue()+1;
	   }
        Arrays.sort(answerarr);
        
        return answerarr;
    }
}