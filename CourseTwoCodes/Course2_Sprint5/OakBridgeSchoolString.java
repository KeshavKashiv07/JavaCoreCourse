package Course2_Sprint5;

public class OakBridgeSchoolString {
	
	 public String convertToUpperCase(String name){
	       return name.toUpperCase();
	    }

	 public String shortestSurname(String[] surnames)
	    {
	        String sort = surnames[0];
	        for(int i=0;i<surnames.length;i++) {
	        	if(sort.length() > surnames[i].length()) {
	        		sort =surnames[i];
	        	}
	        }
	        return sort;
	    }
	 

	    public boolean checkIfNamesAreRepeated(String[] names){
	        boolean flag=false;
	        
	        for(int i=0;i<names.length;i++) {
	        	for(int j=i+1; j<names.length;j++) {
	        		if(names[i]==names[j]) {
	        			//System.out.println(names[i]);
	        			flag=true;
	        		}
	        	}
	        }
	        return flag;
	    }
	    
	    

	    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
	       // String []  concatenatedNames = ;
	    	String concatenatedNames[] = new String[names.length];
	    	int k=0;
	          for(int i=0 , j=0;  i<names.length;  i++ , j++) {
	        	concatenatedNames[k] = names[i].concat(" ").concat(surnames[j]);
	        	k++;
	        	}
	        return  concatenatedNames;
	    }

	    // Display the names
	    public void displayStudentNames(String[] namesArray){
            
	    	System.out.println("Name with surname : ");
	    	for(int i=0; i<namesArray.length; i++) {
	    		System.out.print(namesArray[i] + ", ");
	    	}

	    }

	    public static void main(String[] args) {
	        OakBridgeSchoolString obj = new OakBridgeSchoolString();
	        // Declare and Initialize values to the arrays
	        String[] studentNames = {"Michelle", "Kate", "Alue", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
	        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
	        
	        // Call the method to convert all the student names to upper case and display results
	        for(int i=0; i<studentNames.length;i++) {
	        String upperName = obj.convertToUpperCase(studentNames[i]);
	        System.out.println("The "+ studentNames[i]+ " is in upper case : "+ upperName);
	        }

	        // Call the method to sort names in alphabetical order and display results
	        String sortSurname = obj.shortestSurname(studentSurnames);
	        System.out.println("Shortest surname is : "+ sortSurname);
	        

	        // Call the method to find the shortest surname and display results
	        boolean repeatName = obj.checkIfNamesAreRepeated(studentNames);
	        System.out.println("There are repeted names in the list : "+ repeatName);

	        // Call the method to check if two names in the array are the same and display results
	        String[] concatNameSurname = obj.concatenateNameAndSurname(studentNames, studentSurnames);
	        for(int i=0; i<concatNameSurname.length; i++) {
	        	System.out.println(concatNameSurname[i]);
	        }
	        

	        // Call the method to concatenate name and surname with a space in between and display results

             obj.displayStudentNames(concatNameSurname);     
	    }

}
