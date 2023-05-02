package Course2_Sprint5;

public class ReverseStringDemo {
    public static void main(String[] args) {
		String name = "Keshav";
        ReverseStringDemo obj = new ReverseStringDemo();
        String newName= obj.getReverseString(name);
        System.out.println(newName);
       
    }

public String getReverseString(String string){
     String reverse="";
     char ar[] = string.toCharArray();
     
     for(int i=ar.length-1; i>=0; i--) {
    	 reverse=reverse+ar[i];
     }
	 return reverse;
	}
        
}

