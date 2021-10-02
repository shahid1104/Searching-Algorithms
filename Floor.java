// Java program to find floor of
// a given number in a sorted array
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {

	/* An inefficient function to get index of floor
of x in arr[0..n-1] */
	static int floorSearch(
		int arr[], int n, int x)
	{
		// If last element is smaller than x
		if (x >= arr[n - 1])
			return n - 1;

		// If first element is greater than x
		if (x < arr[0])
			return -1;

		// Linearly search for the first element
		// greater than x
		for (int i = 1; i < n; i++)
			if (arr[i] > x)
				return (i - 1);

		return -1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
		int n = arr.length;
		int x = 7;
		int index = floorSearch(arr, n - 1, x);
		if (index == -1)
			System.out.print(
				"Floor of " + x
				+ " doesn't exist in array ");
		else
			System.out.print(
				"Floor of " + x + " is "
				+ arr[index]);
	}
}

// This code is contributed
// by Akanksha Rai(Abby_akku)
