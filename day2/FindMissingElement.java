package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		int numbers[] = {1,2,4,5,3,7,9};
		int diff=1;
		Arrays.sort(numbers);
		
		System.out.println("Sorted Elements are :" + Arrays.toString(numbers));
		System.out.println("Missing Elements are : ");
				
		for(int i=numbers[0];i<numbers.length;i++)
		{
			if(numbers[i] != i)
			{
				while(diff < numbers[i] - i) 
				{
					System.out.println(i+diff);
					diff++;
				}
			}
		}
		
		

	}

}
