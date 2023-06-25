package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=10;
        for (int i=2;i<num-1;i++)
        {
        	if(num%i==0)
        	{
        		System.out.println(i + " is a prime number");
        	}
        	else
        	{
        		System.out.println(i + " is not a prime number");
        	}
        }
	}

}
