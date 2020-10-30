package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread hilo = new procesos("Este es el hilo 1");
		Thread hilo2 = new procesos("Este es el hilo 2");
		Thread hilo3 = new procesos("Este es el hilo 3");
		
		hilo.start();
		hilo2.start();
		hilo3.start();
		
	}

}
