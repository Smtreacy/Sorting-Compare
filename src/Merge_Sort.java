
public class Merge_Sort {
	//keep breaking up the array until theres only one element than merge them 
	
    void merge(int array[], int beginningIndex, int middleIndex, int rightIndex)
    {
        // Find sizes of two subarrays to be merged
    	//size of the new subarrays gathered from the values fed to the function 
        int sizeA1 = middleIndex - beginningIndex + 1;
        int sizeA2 = rightIndex - middleIndex;
 
        int leftIndexArray[] = new int [sizeA1];
        int rightIndexArray[] = new int [sizeA2];
 
        //go through and fill our arrays with the information in our passed in array
        for (int i=0; i<sizeA1; ++i)
            leftIndexArray[i] = array[beginningIndex + i];
        for (int j=0; j<sizeA2; ++j)
            rightIndexArray[j] = array[middleIndex + 1+ j];
 
        // setup our indices for leftIndexArray and rightIndexArray
        int i = 0; 
        int j = 0;
 
        // Initial index of merged subarry array
        int k = beginningIndex;
        
        //compare the two values and see where the value goes
        while (i < sizeA1 && j < sizeA2)
        {
            if (leftIndexArray[i] <= rightIndexArray[j])
            {
                array[k] = leftIndexArray[i];
                i++;
            }
            else
            {
                array[k] = rightIndexArray[j];
                j++;
            }
            k++;
        }
        //copy the sorted array
        while (i < sizeA1)
        {
            array[k] = leftIndexArray[i];
            i++;
            k++;
        }
        // clean up, copy any leftovers to our sorted array 
        while (j < sizeA2)
        {
            array[k] = rightIndexArray[j];
            j++;
            k++;
        }
    }
 
    //keep break the array until theres only one value in one array
    long sort(int array[], int beginningIndex, int rightIndex)
    {
    	
            long startTime = System.currentTimeMillis();
    		


        if (beginningIndex < rightIndex)
        {
            // Find the middle point 
            int middleIndex = (beginningIndex+rightIndex)/2;
 
            // Sort first and second halves
            sort(array, beginningIndex, middleIndex);
            sort(array , middleIndex+1, rightIndex);
 
            // Merge the sorted halves
            merge(array, beginningIndex, middleIndex, rightIndex);
        }
        long endTime = System.currentTimeMillis();
		long exectutionTime = endTime - startTime;
		return exectutionTime;
    }
 

}
