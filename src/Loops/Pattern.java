package Loops;

public class Pattern
{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println(i);
		}
		for(int a=1; a<=5; a++) {
			for(int k=1; k<=5-a; k++) {
				System.out.print(k+" ");
			}
			System.out.println(a);
		}
	}
}
