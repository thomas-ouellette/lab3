package util;

public class ListUtilities {

	/*
	 * Sorts a list of objects in ascending natural order using selection sort.
	 * 
	 * Precondition: Assumes that the list is not null and that the list's capacity
	 * is equal to the list's size.
	 * 
	 *
	 * @param list A list of objects. Assumes that the list's capacity is equal to
	 * the list's size.
	 * 
	 * @throws IllegalArgumentException if the parameter is not full to capacity.
	 *
	 * @throws NullPointerException if the list is null.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] list) throws IllegalArgumentException, NullPointerException {

		for (int i = 0; i < list.length; i++) {

			Comparable smallest = list[0];

			for (int j = 0; j < list.length; j++) {

			}

		}

	}// end sort

	public static void sort(int[] a) {

		int smallest = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] < a[smallest]) {
				
				int temp = a[smallest];
				a[smallest] = a[i];
				a[i] = temp;
				
			}
			/*
			for (int j = 0; j < a.length; j++) {

				if(a[j] < a[i]) {
					
					
					
				}
				
			}*/

		}

	}

}
