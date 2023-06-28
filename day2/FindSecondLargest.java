package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		int arr[] = {1,3,5,4,2,6,9,7};
		Arrays.sort(arr);
		int secLargeNum = arr.length - 1;
		System.out.println("The Second Largest Number is : " + secLargeNum);
	}

}
