package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list1[] = {1,2,3,5,6,7,9};
		int list2[] = {2,4,6,8};
		
		for (int i = 0; i < list1.length; i++) {
			for(int j=0; j<list2.length;j++)
			{
				if(list1[i] == list2[j])
				{
					System.out.println(list1[i]);
				}
			}
			
		}

	}

}
