//Steven Treacy
//Class to test various sorting methods
import java.lang.reflect.Array;
import java.util.*;

public class sorting {
	    //create an array or an arraylist that has 50k-300kk slots to be used
		//call our sorting methods from here 
		static int[] Fiftyk = new int [50000];
		static int[] hundredk = new int[100000];
		static int[] onehundred50k = new int [150000];
		static int[] twohundredk = new int [200000];
		static int[] twohundred50k = new int[250000];
		static int[] threehundredk = new int [300000];
		
		
		static Selection_Sort ss = new Selection_Sort();
		static Bubble_Sort bs = new Bubble_Sort();
		static Quick_Sort qs = new Quick_Sort();
		static Merge_Sort ms = new Merge_Sort();
		static Radix_Sort rs = new Radix_Sort();
		static Heap_Sort hs = new Heap_Sort();
		
		/*
		 Gonna have to make 6 copies of arrays
		 since passing the array modifies the original making the other sorts
		 significantly faster
		 */
		static int[] FiftykSS = new int [50000];
		static int[] hundredkSS = new int[100000];
		static int[] onehundred50kSS = new int [150000];
		static int[] twohundredkSS = new int [200000];
		static int[] twohundred50kSS = new int[250000];
		static int[] threehundredkSS = new int [300000];
		
		static int[] FiftykBS = new int [50000];
		static int[] hundredkBS = new int[100000];
		static int[] onehundred50kBS = new int [150000];
		static int[] twohundredkBS = new int [200000];
		static int[] twohundred50kBS = new int[250000];
		static int[] threehundredkBS = new int [300000];
 
		static int[] FiftykMS = new int [50000];
		static int[] hundredkMS = new int[100000];
		static int[] onehundred50kMS = new int [150000];
		static int[] twohundredkMS = new int [200000];
		static int[] twohundred50kMS = new int[250000];
		static int[] threehundredkMS = new int [300000];
		
		static int[] FiftykQS = new int [50000];
		static int[] hundredkQS = new int[100000];
		static int[] onehundred50kQS = new int [150000];
		static int[] twohundredkQS = new int [200000];
		static int[] twohundred50kQS = new int[250000];
		static int[] threehundredkQS = new int [300000];
		
		static int[] FiftykHS = new int [50000];
		static int[] hundredkHS = new int[100000];
		static int[] onehundred50kHS = new int [150000];
		static int[] twohundredkHS = new int [200000];
		static int[] twohundred50kHS = new int[250000];
		static int[] threehundredkHS = new int [300000];
		
		static int[] FiftykRS = new int [50000];
		static int[] hundredkRS = new int[100000];
		static int[] onehundred50kRS = new int [150000];
		static int[] twohundredkRS = new int [200000];
		static int[] twohundred50kRS = new int[250000];
		static int[] threehundredkRS = new int [300000];
		
		static long startTime;

		
	public static void main(String[] args) {

		generate(Fiftyk);
		generate(hundredk);
		generate(onehundred50k);
		generate(twohundredk);
		generate(twohundred50k);
		generate(threehundredk);
		
		//after creating inital array copy them to unique arrays so the original doesn't get modified and result in lower values.
		System.arraycopy(Fiftyk, 0, FiftykSS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkSS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kSS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkSS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kSS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkSS, 0, threehundredk.length);
		
		System.arraycopy(Fiftyk, 0, FiftykBS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkBS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kBS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkBS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kBS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkBS, 0, threehundredk.length);
		
		System.arraycopy(Fiftyk, 0, FiftykMS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkMS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kMS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkMS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kMS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkMS, 0, threehundredk.length);
		
		System.arraycopy(Fiftyk, 0, FiftykQS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkQS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kQS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkQS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kQS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkQS, 0, threehundredk.length);
		
		System.arraycopy(Fiftyk, 0, FiftykHS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkHS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kHS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkHS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kHS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkHS, 0, threehundredk.length);
		
		System.arraycopy(Fiftyk, 0, FiftykRS, 0, Fiftyk.length);
		System.arraycopy(hundredk, 0, hundredkRS, 0, hundredk.length);
		System.arraycopy(onehundred50k, 0, onehundred50kRS, 0, onehundred50k.length);
		System.arraycopy(twohundredk, 0, twohundredkRS, 0, twohundredk.length);
		System.arraycopy(twohundred50k, 0, twohundred50kRS, 0, twohundred50k.length);
		System.arraycopy(threehundredk, 0, threehundredkRS, 0, threehundredk.length);
	
		
		printArray();
	}
	
public static void generate (int[] array) {
	Random rand = new Random();
	for(int i = 0; i < array.length; i++) {
		array[i] = rand.nextInt(1000000);
	}
}

//Note: We don't need to modify where we get get the length from since the copies share the same length with the original arrays
public static void printArray() {
	
	//this is out of place because the quick sort seems to mess up if placed after merge sort
	//Quick Sort
	callTimer();
	qs.sort(FiftykQS, 0, Fiftyk.length-1);
	long a4 =endTimer();
	
	callTimer();
	qs.sort(hundredkQS, 0, hundredk.length-1);
	long b4 =endTimer();

	callTimer();
	qs.sort(onehundred50kQS, 0, onehundred50k.length-1);
	long c4 = endTimer();
	
	callTimer();
	qs.sort(twohundredkQS, 0, twohundredk.length-1);
	long d4 = endTimer();
	
	callTimer();
	qs.sort(twohundred50kQS, 0, twohundred50k.length-1);
	long e4 = endTimer();
	
	callTimer();
	qs.sort(threehundredkQS, 0, threehundredk.length-1);
	long f4 = endTimer();
	//=============================================================
	//Selection Sort
	callTimer();
	ss.sort(FiftykSS);
	long a =endTimer();
	
	callTimer();
	ss.sort(hundredkSS);
	long b =endTimer();

	callTimer();
	ss.sort(onehundred50kSS);
	long c = endTimer();
	
	callTimer();
	ss.sort(twohundredkSS);
	long d = endTimer();
	
	callTimer();
	ss.sort(twohundred50kSS);
	long e = endTimer();
	
	callTimer();
	ss.sort(threehundredkSS);
	long f = endTimer();
	//============================================================================
	//Bubble Sort
	callTimer();
	bs.sort(FiftykBS);
	long a2 =endTimer();
	
	callTimer();
	bs.sort(hundredkBS);
	long b2 =endTimer();

	callTimer();
	bs.sort(onehundred50kBS);
	long c2 = endTimer();
	
	callTimer();
	bs.sort(twohundredkBS);
	long d2 = endTimer();
	
	callTimer();
	bs.sort(twohundred50kBS);
	long e2 = endTimer();
	
	callTimer();
	bs.sort(threehundredkBS);
	long f2 = endTimer();
	//==================================================================================
	//Merge Sort
	callTimer();
	ms.sort(FiftykMS, 0, Fiftyk.length-1);
	long a3 =endTimer();
	
	callTimer();
	ms.sort(hundredkMS, 0, hundredk.length-1);
	long b3 =endTimer();

	callTimer();
	ms.sort(onehundred50kMS, 0, onehundred50k.length-1);
	long c3 = endTimer();
	
	callTimer();
	ms.sort(twohundredkMS, 0, twohundredk.length-1);
	long d3 = endTimer();
	
	callTimer();
	ms.sort(twohundred50kMS, 0, twohundred50k.length-1);
	long e3 = endTimer();
	
	callTimer();
	ms.sort(threehundredkMS, 0, threehundredk.length-1);
	long f3 = endTimer();
	//=====================================================================================
	//Heap sort
	callTimer();
	hs.sort(FiftykHS);
	long a5 =endTimer();
	
	callTimer();
	hs.sort(hundredkHS);
	long b5 =endTimer();

	callTimer();
	hs.sort(onehundred50kHS);
	long c5 = endTimer();
	
	callTimer();
	hs.sort(twohundredkHS);
	long d5 = endTimer();
	
	callTimer();
	hs.sort(twohundred50kHS);
	long e5 = endTimer();
	
	callTimer();
	hs.sort(threehundredkHS);
	long f5 = endTimer();
	//==========================================================================================
	//Radix Sort
	callTimer();
	rs.sort(FiftykRS);
	long a6 =endTimer();
	
	callTimer();
	rs.sort(hundredkRS);
	long b6 =endTimer();

	callTimer();
	rs.sort(onehundred50kRS);
	long c6 = endTimer();
	
	callTimer();
	rs.sort(twohundredkRS);
	long d6 = endTimer();
	
	callTimer();
	rs.sort(twohundred50kRS);
	long e6 = endTimer();
	
	callTimer();
	rs.sort(threehundredkRS);
	long f6 = endTimer();
	//=====================================================================
	System.out.print("Array Size\t" + "Selction Sort\t" + "Bubble Sort\t" + "Merge Sort\t" + "Quick Sort\t" + "Heap Sort\t" + "Radix Sort\t\n");
	
	System.out.println("50,000\t\t" + a + "\t\t" + a2 + "\t\t" + a3 + "\t\t" + a4  + "\t\t" + a5 +"\t\t" + a6 + "\n" + 
	  "100,000\t\t" + b + "\t\t" + b2 + "\t\t" + b3 + "\t\t" + b4 + "\t\t" + b5 + "\t\t"  + b6 + "\n" + 
	  "150,000\t\t" + c +"\t\t" +c2 + "\t\t" + c3 + "\t\t" + c4 + "\t\t" + c5 + "\t\t"  + c6 + "\n" + 
	  "200,000\t\t" + d + "\t\t" + d2 + "\t\t" + d3 + "\t\t" + d4+ "\t\t" + d5  + "\t\t"  + d6 + "\n" + 
	  "250,000\t\t" + e + "\t\t" + e2 + "\t\t" + e3+ "\t\t" + e4 + "\t\t" + e5 + "\t\t"  + e6 + "\n" + 
	  "300,000\t\t" + f  + "\t\t" + f2 + "\t\t" + f3 + "\t\t" + f4 + "\t\t" + f5 + "\t\t"  + f6 +"\n");
	
	}

private static void callTimer() {
	startTime = System.currentTimeMillis();
	
}

private static long endTimer() {
	long endTime = System.currentTimeMillis();
	long exectutionTime = endTime - startTime;
	return exectutionTime;
}
}
