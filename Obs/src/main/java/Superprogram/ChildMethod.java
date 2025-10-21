package Superprogram;

public class ChildMethod extends ParentMethod{
	public void display()
	{
		System.out.println("This is child class");
	}
public void tell()
{
	display();
	super.display();
}
public static void main (String[] args)
{
	ChildMethod m= new ChildMethod();
	m.tell();
	
}
}
