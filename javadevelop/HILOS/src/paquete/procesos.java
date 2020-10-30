package paquete;

public class procesos extends Thread {

	public procesos (String msg) 
	{
		super(msg);
	}
	
	public void run()
	{
		System.out.println(this.getName());
	}
}
