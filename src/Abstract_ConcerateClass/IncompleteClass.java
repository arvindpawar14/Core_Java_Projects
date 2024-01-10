package Abstract_ConcerateClass;

abstract public class IncompleteClass 
{
	/**
	 * Abstract class --> Complete + Incomplete methods
	 */

	//Complete method--> Method declaration+Method definition/body
	public void m1()
	{
		System.out.println("Implemented method m1 in the Abstract/incomplete class");
	}

	//Incomplete methods--> Method definition is absent
	abstract public void m2();

	//Incomplete methods--> Method definition is absent
	abstract public void m3();
}
