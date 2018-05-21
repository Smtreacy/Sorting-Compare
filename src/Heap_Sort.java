
public class Heap_Sort {
	long startTime = System.currentTimeMillis();	 

	public long sort(int array[])
		    {

		        int size = array.length;
		
		        for (int i = size / 2 - 1; i >= 0; i--) {
		            reheap(array, size, i);
		        }
		        for (int i=size-1; i>=0; i--)
		        {
		            // Move current root to end
		            int temp = array[0];
		            array[0] = array[i];
		            array[i] = temp;
		 
		            reheap(array, i, 0);
		        }
		        long endTime = System.currentTimeMillis();
				long exectutionTime = endTime - startTime;
				startTime = 0;
				return exectutionTime;
		    }
		 

	void reheap(int array[], int size, int i)
		    {
		   		//root should be the largest value
				//on init we get the midpoint of our array and use that as the largest value
		   		int largest = i;  
		        int left = 2*i + 1;  
		        int right = 2*i + 2;  
		 
		        // make sure that child gets swapped with root if the value is larger
		        if (left < size && array[left] > array[largest])
		            largest = left;
		 
		        if (right < size && array[right] > array[largest])
		            largest = right;
		 
		        //update to get the largest value as root
		        //repeat until true
		        if (largest != i)
		        {
		            int swap = array[i];
		            array[i] = array[largest];
		            array[largest] = swap;
	
		            reheap(array, size, largest);
		        }
		    }
	}

