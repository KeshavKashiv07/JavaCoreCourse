package Course2_Sprint5;
public class StringDemoThree{
	public static void main(String args[]){
		StringDemoThree obj=new StringDemoThree();
		String[] str={"apple","banana","orange","mango","pineapple","apricot"};
		 obj.calculateLength(str);
		 System.out.println("--------------------------------------");
		 obj.UppercaseElements(str);
		 System.out.println("--------------------------------------");
		 obj.StartsWithElemts(str,"A");
		 System.out.println("--------------------------------------");
		obj.countVowels(str);

	}

	public void calculateLength(String[] arrayStr){
		for(int i=0;i<arrayStr.length;i++){
			System.out.println("Length of " + arrayStr[i] + " is : " + arrayStr[i].length());
		}
	}

	public void UppercaseElements(String[] arrayStr){
		for(int i=0;i<arrayStr.length;i++){
			System.out.println("elements in Uppercase " + arrayStr[i].toUpperCase());
		}
	}

	public void StartsWithElemts(String[] arrayStr,String start){
		for(int i=0;i<arrayStr.length;i++){

			System.out.println(arrayStr[i] + " startsWith " + start + " : " +arrayStr[i].startsWith(start));
		}
	}

	public void countVowels(String str[]){
		for(int j=0;j<str.length;j++){
		char[] ch=str[j].toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
				count++;
			}
		}
		System.out.println("Vowels in "+ str[j] + " is : " + count);
		count=0;
	}
	}
}