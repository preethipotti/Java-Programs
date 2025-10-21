package inherit2;

public class classa extends parent{
public void create()
{
	System.out.println("classa");
	}
public static void main (String[] args)
{
	classa a = new classa();
	a.create();
	a.display();
}
}

