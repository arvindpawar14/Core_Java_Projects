package Abstract_ConcerateClass;

public class Arvind {

	public void sub() {
		System.out.println("I am in Test Class Method");
	}
	
	public void sub(String s1) {
		System.out.println("I am in Test Class Method "+ s1);
	}

	public static void main(String[] args) {
		Arvind a=new Arvind();
		A m=a :: sub;
		m.add("SWapnil");
	}
}


//Steps required
//Need one Functional Interface which have one abstract method
//Need one Execute class 
//add one Method in same class  which is refer to Interface method
//Create a Object of class
// Iterface refrenceVariable= Object_Of_Class :: Method of Created Object class
//Callig:- refrenceVariable.Interface Method

