package util;

public class Test {

	public static void main(String[] args) {
		
		int[] array = {5, 5, 5, 5, 5, 5, 1, 5, 5, 5, 5};
		printArray(array);
		ListUtilities.sort(array);
		printArray(array);

	}
	
	public static void printArray(int[] a) {
		
		System.out.print("{");
		
		for(int i = 0; i < a.length; i++) {
			
			if(i > 0) {
				System.out.print(" ");
			}
			
			System.out.print(a[i]);
			
			if(!(i == a.length - 1)) {
				System.out.print(",");
			}
		}
		
		System.out.print("}");
		System.out.print("\n");
		
	}

}
