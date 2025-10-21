package pack;

public class SingleSubInherit extends SingleInherit
{
public void create()
{
	System.out.println("Example of child class");
}
public static void main (String[] args)
{
SingleSubInherit s = new SingleSubInherit();
s.display();
s.create();
}
}
