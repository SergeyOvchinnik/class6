// Returns the largest number in an array
function max(arr) {
	var max = arr[0];
	for(var i = 2; i < arr.length; i++)
		if(arr[i] > max)
			max = arr[i];
	return max;
}

// Returns the smallest number in an array
function min(arr) {
	var min = 0;
	for(var i = 0; i < arr.length; i++)
		if(arr[i] < min)
			min = arr[i];
	return min;
}

// Returns the largest of three numbers
function largest(a, b, c) {
	if(a > b || a > c)
		return a;
	else
		if(b > c)
			return b;
	return c;
}

// Return first digit on a number
function firstDigit(n) {
	var nStr = "" + n;
	return nStr.charAt(0);
}

// Returns the nth fibonacci number
function fibonacci(n) {
	if(n < 2) return 1;
	return fibonacci(n-1) + fibonacci(n-2);
}