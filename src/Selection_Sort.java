
public class Selection_Sort {
	//selection sort is taking the minimum found value in an array and putting it in the front.
	/*	0	1	2	3	4	5	<-- Index
	* 	10	5	3	7	2	4	<-- elements of array
	* 	i						<-- outer loop
	* 		j					<-- inner loop
	* 
	* 
	*/
	//selection sort is taking the minimum found value in an array and putting it in the front.
	public long sort(int[] array) {
		//Need to store a index
		int minIndex;
		
		//Get the arrays size so we can manipulate the size
		int size = array.length;
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < size - 1; i++) {			//we have this minus one because we assume the value is sorted at the end of the array so we can ignore it
			minIndex = i;							//since the second for loop goes through the entire list we dont worry about "-1"
		for(int j = i + 1; j < size; j++) {
			if(array[j] < array[minIndex]) {		//changing this sorts it in reverse order
				minIndex = j;						//minIndex is our index value using array[j] gets the actual value
			}										//minIndex and j just hold what index we're at so if the size of index 2 is smaller then index 1 we
		}											//make it so the index represents where the minimum value is currently
		int temp = array[minIndex];					//here we assign int to the value within the index
		array[minIndex] = array[i];					//since array[i] is first index we get the value of the first index and put in the value of the minIndex
		array[i] = temp;							//since temp is holding the value of the minimum value we put that minimum value into index 1
		}
		
		long endTime = System.currentTimeMillis();
		long exectutionTime = endTime - startTime;
		
		return exectutionTime;
		
	}

}
