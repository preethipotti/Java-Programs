package multiinherit;

public class child extends intermediateparent{
	public void subtract() {
		int a =30;
		int b=15;
		int result =a-b;
		System.out.println("result of sub"+ result);
		
	}
public static void main (String args[]) {
	
child obj = new child();
obj.subtract();
obj.add();
obj.display();
}
}