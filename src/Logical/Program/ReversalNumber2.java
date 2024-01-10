package Logical.Program;

public class ReversalNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4536;
		int num1 = 0;
		for(int i=num; i>0; i=i/10)
		{
			int rem = i % 10;
			num1 = num1*10+rem;
		}
		System.out.println(num1);
	}

}
