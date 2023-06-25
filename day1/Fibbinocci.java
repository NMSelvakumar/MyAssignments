package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		int sum=0;
		int firstNum =0;
		int secondNum =1;
		System.out.println(firstNum);
		
		for(int i=1;i<=n;i++)
		{			
			sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
		}		

	}

}
