package Course2_Sprint2;

public class MaximumAge {
	int max=0;
	public int getMaximumAge(int[] age) {
		for(int i=0; i<age.length; i++) {
			if(max < age[i]) {
				max = age[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		
		int age[] = {23,34,45,40,26,28,47,89};
		
		MaximumAge obj = new MaximumAge();
		
		int maxAge = obj.getMaximumAge(age);
		System.out.println(maxAge);
		
	}

}
