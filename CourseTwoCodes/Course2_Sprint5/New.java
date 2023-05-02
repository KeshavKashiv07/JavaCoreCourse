package Course2_Sprint5;

public class New {

	public void concatenateNameAndSurname(String[] names, String [] surnames){
	       // String []  concatenatedNames = ;
	    	String concatenatedNames[] = new String[names.length];
	        int k=0;
	            for(int i=0 , j=0;  i<names.length;  i++ , j++) { 
	        		System.out.println(names[i].concat(" ").concat(surnames[j]));
	        	}	
	        }
	        	
	public static void main(String args[]) {
		
		 String[] studentNames = {"Michelle", "Kate", "Alue", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
	        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
		New obj = new New();
		obj.concatenateNameAndSurname(studentNames, studentSurnames);
	}
}
