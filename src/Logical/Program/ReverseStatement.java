package Logical.Program;

public class ReverseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Automation";
		String [] st = str.split(" ");
		for(int i=st.length-1; i>=0; i--) {
			System.out.print(st[i]+ " ");
		}
	}

}
