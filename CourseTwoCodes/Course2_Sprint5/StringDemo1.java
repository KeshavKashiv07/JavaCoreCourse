package Course2_Sprint5;

class StringDemo1 {

	public String checkWithMethod(String str1,String str2){
		if(str1.equals(str2))
			return "String equal using equals()";
		else
			return "Not equal using equals()";
	}
  
  public String checkWithOperator(String str1,String str2){
		if(str1==str2)
			return "String equal using ==";
		else
			return "Not equal using ==";
	}
    public static void main(String[] args) {
        String s1=new String("Apple");
		String s2=new String("Apple");
		String s3="Apple Pie";
		String s4="Apple Pie";
		StringDemo1 obj=new StringDemo1();
		System.out.println("For " + s1 + " :  " + s3 + " ::" + obj.checkWithMethod(s1,s3));
		System.out.println("For " + s3 + " : " + s2 + ":: " + obj.checkWithMethod(s3,s2));
		System.out.println("For " + s1 + " :  " + s2 + " ::" + obj.checkWithOperator(s1,s2));
		System.out.println("For " + s3 + " : " + s4 + ":: " + obj.checkWithOperator(s3,s4));
    }
}

