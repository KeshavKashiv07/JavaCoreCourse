package Course2_Sprint5;

public class ShortestWord {

	 public static void main(String[] args) {
	      ShortestWord obj = new ShortestWord();
		  String[] str = {"Atrocity", "Pensive", "Imperceptible", "Discordant" };
	        String newStr = obj.findShortestWord(str);
	        System.out.println(newStr);
	    }

	    public String findShortestWord(String[] words) {
            String min=words[0];
            
	        for(int i=0; i<words.length; i++) {
	        	if(min.length() > words[i].length()) {
	        		min=words[i];
	        	}	
	        }
	        return min;
	        
	        
	    }

}
