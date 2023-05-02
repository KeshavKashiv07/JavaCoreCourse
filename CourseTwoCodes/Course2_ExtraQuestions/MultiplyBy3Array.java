package Course2_ExtraQuestions;

public class MultiplyBy3Array {
	
	public int[] multiplyBy3(int[] array) {
		int[] arr = new int[array.length];
		for(int i=0;i<array.length;i++) {
			arr[i] = array[i]*3;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		MultiplyBy3Array obj = new MultiplyBy3Array();
		
		int[] array = {2,4,6,7,9,10,4,7};
		
		int newArray[] = obj.multiplyBy3(array);
		
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i] + " ");
		}

	}

}
