import java.util.Arrays;

public class PoorCode {

	public static void main(String[] args) {
		
		x("Mr", "Sergey", "Ovchinnik");
		
		System.out.println();
		
		int[] arr = new int[] {5, 8, 3, 4, 2, 9, 6};
		System.out.println("Top even is " + locateTopEven(arr));
		
		System.out.println();
		
		System.out.println("evaluateConditions(false, false, -1) = " + evaluateConditions(false, false, -1));
		System.out.println("evaluateConditions(false, true, -1) = " + evaluateConditions(false, true, -1));
		System.out.println("evaluateConditions(true, false, -1) = " + evaluateConditions(true, false, -1));
		System.out.println("evaluateConditions(true, true, -1) = " + evaluateConditions(true, true, -1));
		System.out.println("evaluateConditions(false, false, 0) = " + evaluateConditions(false, false, 0));
		System.out.println("evaluateConditions(false, true, 0) = " + evaluateConditions(false, true, 0));
		System.out.println("evaluateConditions(true, false, 0) = " + evaluateConditions(true, false, 0));
		System.out.println("evaluateConditions(true, true, 0) = " + evaluateConditions(true, true, 0));
		System.out.println("evaluateConditions(false, false, 1) = " + evaluateConditions(false, false, 1));
		System.out.println("evaluateConditions(false, true, 1) = " + evaluateConditions(false, true, 1));
		System.out.println("evaluateConditions(true, false, 1) = " + evaluateConditions(true, false, 1));
		System.out.println("evaluateConditions(true, true, 1) = " + evaluateConditions(true, true, 1));
		
		System.out.println();
		
		double[] arr2 = new double[] {3.0, 4.0, 3.5, 4.0, 6.0, 5.0, 5.5, 6.6, 6.1};
		printStats(arr2);
		
		System.out.println();
		
		System.out.println(intArrayToString(new int[] {1, 2, 3, 4, 5}));
		
		System.out.println();
		
		System.out.println(casing("Big Sergio Comp8860"));

	}
	
	/*
	 * Method x
	 * 
	 * Takes in three string parameters and prints out the greeting
	 * 
	 * First parameter serves as the title, second as the first name and second is the surname
	 * 
	 */
	public static void x(String a, String b, String c) {
		System.out.println("Hello, " + a + " " + b + " " + c);
	}
	
public 
static 
int   locateTopEven(int[] arr) 
	  {
int topEven =   Integer.MIN_VALUE, indexOfTopEven
= 0;
  for(int i =0; (   i < arr.length);i  ++){if   (arr[i] % 2 
    == 0) {
if(  arr[i] > topEven   )    {{topEven 
	 	= arr[i];}
		indexOfTopEven = i;
				}}}
return indexOfTopEven;}
	
	
	public static boolean evaluateConditions(boolean a,boolean b, int c) {
		if(c >0) {
			if(a == false) {
				if(b == true) {
					return true ;
				} else {
					return false;
				}
			}
			else {
				if(b == false){
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		else 
			if(c < 0) {
			if(b == true && a ==true) return false;
			if(a==false && b == false) return false;
			return true;
		}
		return false;
	}
	
	
	public static void printStats(double[] arr) {
		
		double length = (double) arr.length;
		
		System.out.println("Length = " + length);
		
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		System.out.println("Sum = " + sum);
		
		double n = (double) arr.length;
		
		double mean = sum / n;
		
		System.out.println("Mean = " + mean);
		
		double[] sorted = b(arr);
		
		double median;
		
		if(sorted.length % 2 == 1)
			median = sorted[sorted.length/2];
		else
			median = (sorted[sorted.length/2 - 1] + sorted[sorted.length/2]) / 2.0;
		
		System.out.println("Median = " + median);
		
		double mode = sorted[0];
		int topOccurrences = 0;
		double currentNumber = sorted[0];
		int occurrences = 0;
		
		for(int i = 0; i < sorted.length; i++) {
			if(sorted[i] == currentNumber) {
				occurrences++;
				if(occurrences > topOccurrences) {
					topOccurrences = occurrences;
					mode = currentNumber;
				}
			}
			else {
				currentNumber = sorted[i];
				occurrences = 1;
			}
		}
		
		System.out.println("Mode = " + mode);
		
		double variance = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			double diff = arr[i] - mean;
			variance += diff * diff;
		}
		variance /= length;
		
		System.out.println("Variance = " + variance);
		
		double standardDeviation = Math.sqrt(variance);
		
		System.out.println("Standard Deviation = " + standardDeviation);
		
	}
	
	public static double[] b(double[] arr) {
		double[] sortingArr = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i < sortingArr.length - 1; i++)
			for(int j = i + 1; j < sortingArr.length; j++)
				if(sortingArr[i] > sortingArr[j]) {
					double temp = sortingArr[i];
					sortingArr[i] = sortingArr[j];
					sortingArr[j] = temp;
				}
		return sortingArr;
	}
	
	// True for 2, 3, 5, 7, 11, 13 ...
	// False for 1, 4, 6, 8, 9, 10, 12 ...
	public static boolean p(int n) {
		if(n <= 1)
			return false;
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				return false;
		return true;
	}
	
	// Converts integer array to string
	public  static String intArrayToString(int [] arr) 
	{
		if(arr == null)		return "null"; // if null then "null"
String out = "[";
		for(int i =   0;i<arr.length; i++) {
			if(i > 0)
			out = out + ", "; { // add comma when necessary
			out = out + arr[i];
			}}  /* TODO: fix this */
			out = out + "]";
			// Close the array
	return out; // return out;
	}

	// Big Sergio Comp8860 -> bIG sERGIO cOMP8860
	public static String casing(String s) {
		String out = "";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				out = out + Character.toLowerCase(s.charAt(i));
			}
			else
				if(Character.isLowerCase(s.charAt(i))) 
					out = out + Character.toUpperCase(s.charAt(i));
				else
					out = out + s.charAt(i);
	}
		return out;
	}
	
	public static int howMany(boolean f, boolean t, boolean k, boolean z) {
		if(f == true) {
			if(k == false) {
				if(z && t)
					return 3;
				if(z || t)
					return 2;
				return 1;
			}
			else {
				if(z == true) {
					if(t) return 4;
					else return 3;
				}
				if(t == true) {
					if(z) return 4;
					else return 3;
				}
				else return 2; 
			}
		}
		if(k && t && z) {
			return 3;
		}
		if(k || z || t) {
			int number = 0;
			if(k && z) number = number + 2;
			else if(z || k) number ++;
			number+=(t?1:0);
			return number;
		}
		return 0;
	}
	
}
