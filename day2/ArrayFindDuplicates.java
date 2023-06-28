package week1.day2;

public class ArrayFindDuplicates {

	public static void main(String[] args)
	{
		String [] names = {"Ashis", "Balu" , "Dog" , "Selva" , "Cat" , "Dog" , "Sukanya", "Balu", "Dog"};
		
		for (int i=0;i<names.length;i++)
		{
			int count = 1;
			for (int j=i+1;j<names.length;j++)
			{
				if(names[i]==names[j])
				{
					count++;
					System.out.println(names[i]);
				}
			}

			if(count > 1)
			{
				System.out.println(count);
				count =0;
			}
		}
	}

}
