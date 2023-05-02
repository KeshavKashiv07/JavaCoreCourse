package Course2_ExtraQuestions;

public class DuplicElementInArray {

	public static void main(String[] args) {
		int[] array = {1,4,5,1,5,9,7,4 ,8,8,7};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] == array[j]) {
					System.out.print(array[i] + " ");
					
				}
			}
		}
		
		

	}

}
