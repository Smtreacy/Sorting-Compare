import java.util.Arrays;

public class Quick_Sort {
	//use one element to compare every other item
	//we can use first, last or a random value as the pivot
	//Then we have two pointers if the beginning pointer is greater than pivot we accept it
	//If the ending pointer is less than the pivot we accept. If in any case we dont accpet the value we move the index by one
	//After picking two values we swap them
	//After the two indexs meet we simply swap the value of where the pointers met and our pivot
	//we know everywhere to the right is less than the pivot and everything to the left is greater
	//now we have two partitions and call quicksort on these two. Repeat the above steps
	long startTime = System.currentTimeMillis();

	int partition(int array[], int firstIndex, int lastIndex)
    {
        int pivot = array[lastIndex]; 
        int border = (firstIndex-1); // get the last value in the array to act as a border
        for (int j=firstIndex; j<lastIndex; j++)
        {
            if (array[j] <= pivot)
            {
                border++;
           
                int temp = array[border];
                array[border] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[border+1];
        array[border+1] = array[lastIndex];
        array[lastIndex] = temp;
 
        return border+1;
    }
   
    long sort(int array[], int firstIndex, int lastIndex)
    {

        if (firstIndex < lastIndex)
        {
            //Indice we use for partition
            int partionIndex = partition(array, firstIndex, lastIndex);
 
            //This is recursion: Problem wants non-recursion
            sort(array, firstIndex, partionIndex-1);
            sort(array, partionIndex+1, lastIndex);
        }
        long endTime = System.currentTimeMillis();
		long exectutionTime = endTime - startTime;
		startTime = 0;
		return exectutionTime; 
    }
}
