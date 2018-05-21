
public class Bubble_Sort {
	//Compare two adjacent values and swap them if index n is larger than index n + 1
	public  long sort(int[] array) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1 ; j++) {	
				if(array[j] > array[j + 1]){
					int temp = array[j];						//get the value in j
					array[j] = array[j + 1 ];					//value we're currently on gets replaced with it's successor index
					array[j + 1] = temp;						//replace the next index value with the value of the temp value (which stored the value of what our current index was)
				}
			}
		}
		long endTime = System.currentTimeMillis();
		long exectutionTime = endTime - startTime;
		return exectutionTime;
	}
}
