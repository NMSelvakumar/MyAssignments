package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) 
	{
		String colors[] = {"red", "blue", "orange", "blue", "green", "red"};

		String dulicateColors[] = new String[2];


		for (int i = 0; i < colors.length; i++) 
		{
			for (int j = i+1; j < colors.length; j++) 
			{
				if(colors[i] == colors[j])
				{
					dulicateColors[i] = colors[i];
				}
			}
		}

		PrintDuplicates(dulicateColors);
	}

	public static void PrintDuplicates(String[] dulicateColors) 
	{
		System.out.println("The Duplicate Colors are : " );
		
		for (int i = 0; i < dulicateColors.length; i++) 
		{
			System.out.println(dulicateColors[i]);
		}

	}
}
