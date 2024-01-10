package Logical.Program;

public class ReverseStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Fusion";
		String [] st= str.split(" ");
		for(int i=st.length-1; i>=0; i--) {
			System.out.print(st[i]+ " ");
		}
	}

}
