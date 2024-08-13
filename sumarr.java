public class sumarr { 
	static int arr[] = { 1, 2, 3, 4, 5 }; 
	static int findSum(int a[], int N) 
	{ 
		if (N <= 0) 
			return 0; 
		return (findSum(a, N - 1) + a[N - 1]); 
	} 
	public static void main(String[] args) 
	{  
		System.out.println(findSum(arr, arr.length)); 
	} 
} 
