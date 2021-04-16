package lab6;

public class RecursionExercises {
	
	/**
	 * Given an integer n, find the sum of the series 1^1 + 2^2 + 3^3 + бн.. + n^n 
	 * using recursion.
	 * @param n 
	 * @return the sum of the series 1^1 + 2^2 + 3^3 + бн.. + n^n 
	 */
	public static double sum(int n)
	{
		if(n<=1)
			return n;
		return sum(n-1) + Math.pow(n,n);
	
		
	}
	
	
	/**
	 * Climbing stairs Problem: @restriction: Each time can climb 1, 2 or 3 steps.
	 * @param n - total number of steps
	 * @return the number of distinct ways from bottom to top
	 */
	public static long climbStairs(int n)
	{
		if(n<=1 || n==2)
			return n;
		if(n==3)
			return 4;
		return  climbStairs(n-3) + climbStairs(n-2) + climbStairs(n-1);			
		
		
	}
	
	
	/**
	 * Find the index of the given target in sorted array (assume no duplicated elements)
	 * Example: (arr = [1 2 4 7 9], target = 7, start = 0, end = 4)  return true
	 * @param arr
	 * @param target
	 * @param start - starting index
	 * @param end - ending index
	 * @return true the given target in sorted array or false if not found
	 */
	public static boolean  binSearchTarget(int[] arr, int target, int start, int end)
	{
		if( start == end && start == target)
			return true;
		if(start>end)
			return false;
		int mid = (end+start)/2;
		if(target>arr[mid])
			return binSearchTarget(arr, target, mid+1, end);
		if(target<arr[mid])
			return binSearchTarget(arr, target, start, mid-1);
		if(arr[mid]==target)
			return true;
		
		return false;
		
		
		
	}
	

}
