package inherit2;

public class classb extends parent{
public void create()
{
	System.out.println("classb");
	}
public static void main (String[] args)
{
	classb b = new classb();
	b.create();
	b.display();
}
}