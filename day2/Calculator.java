package week1.day2;

public class Calculator {

	public int addThreeNumbers(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	
	public float subTwoNumbers( int num1, float num2)
	{
		return num1-num2;
	}
	
	public int divideTwoNumbers(int num1, int num2) 
	{
	    return num1/num2;
	}
	
	public void isHadLunch()
	{
		System.out.println("True");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Calculator cl = new Calculator();
		int sum= cl.addThreeNumbers(1, 2, 3);
		System.out.println("The sum of three numbers is : " +sum);
		
		float sub=cl.subTwoNumbers(3,2.5f);
		System.out.println("The subtraction of two numbers  : " +sub);
		
		int div = cl.divideTwoNumbers(10,2);
		System.out.println("The dividion of two numbers : " + div);
		
		
	}

	
}
