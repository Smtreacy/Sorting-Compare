import java.lang.reflect.Array;
import java.util.Arrays;

public class Radix_Sort {

	long startTime = System.currentTimeMillis();	

		//used to pad values if they have less digits
	    static int getMaxValue(int array[]) {
	        int maxValue = array[0];
	        for (int i = 1; i < array.length; i++)
	            if (array[i] > maxValue)
	                maxValue = array[i];
	        return maxValue;
	    }
				
			 // Main Radix Sort sort function
		public long sort(int array[]) {
				 

				
		        int numberPlacement = 1;
		        int n=array.length;
		        //get a final sorted array
		        int result[]=new int[array.length]; 
		       
		        int largestNum = getMaxValue(array);
		  
		        while(largestNum/numberPlacement >0){
		             
		            int count[]=new int[10];
		            for (int i=0; i <10; i++) {
		                count[i] = 0;
		            }
		             //get the ones, tens, hundreds, etc place of each value
		            //put them into the count 
		            for (int i = 0; i < n; i++) {
		                count[ (array[i]/numberPlacement)%10 ]++;
		            }
		            // Change count[i] so that count[i] now contains actual
		            //  position of this digit in result[]
		            //  Working similar to the counting sort algorithm
		            for (int i = 1; i < 10; i++)
		                count[i] += count[i - 1];
		     
		            // create the array that will be sorted
		            for (int i = n - 1; i >= 0; i--)
		            {
		                result[count[ (array[i]/numberPlacement)%10 ] - 1] = array[i];
		                count[ (array[i]/numberPlacement)%10 ]--;
		            }
		     
		            //copy the values from our result array to the real array
		            for (int i = 0; i < n; i++)
		                array[i] = result[i];
		     
		                // move to a more significant digit.
		                numberPlacement = numberPlacement * 10;
		        }
		        long endTime = System.currentTimeMillis();
				long exectutionTime = endTime - startTime;
				startTime = 0;
				return exectutionTime;	
	    }
	  
	}

