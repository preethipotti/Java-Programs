package Superprogram;

public class SuperChild extends SuperParent{
int a =20;
public void maths()
{
	System.out.println(a);
	System.out.println(super.a);
}
public static void main (String[] args)
{
	SuperChild s= new SuperChild();
	s.maths();
	
}

}
