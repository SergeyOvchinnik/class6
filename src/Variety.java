
public class Variety {
	
	// Returns the largest number in an array
	public static int max(int[] arr) {
		int max = arr[0];
		for(int i = 2; i < arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		return max;
	}
	
	// Returns the smallest number in an array
	public static int min(int[] arr) {
		int min = 0;
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < min)
				min = arr[i];
		return min;
	}
	
	// Returns the largest of three numbers
	public static int largest(int a, int b, int c) {
		if(a > b || a > c)
			return a;
		else
			if(b > c)
				return b;
		return c;
	}
	
	// Return first digit on a number
	public static int firstDigit(int n) {
		String nStr = "" + n;
		return nStr.charAt(0);
	}
	
	// Returns the nth fibonacci number
	public static int fibonacci(int n) {
		if(n < 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
