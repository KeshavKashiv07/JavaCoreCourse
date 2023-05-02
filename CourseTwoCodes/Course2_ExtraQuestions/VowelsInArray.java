package Course2_ExtraQuestions;

public class VowelsInArray {
	
	
	public char[] vowels(char[] array) {
		char[] arr = new char[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]=='A' || array[i]=='E' || array[i]=='I' || array[i]=='O' || array[i]=='U') {
				arr[i] = array[i];
			}			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		
		char[] array= {'A','K','R','U','P','Q','I'};
		
		VowelsInArray obj = new VowelsInArray();
		
		char vovels[] = obj.vowels(array);
		
		System.out.print("Vowels are : ");
		for(int i=0;i<vovels.length;i++) {
			System.out.print(vovels[i]);
		}
		

	}

}
