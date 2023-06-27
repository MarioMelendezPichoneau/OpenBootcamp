package OpenBootcamp;

public class Coche {
	
	
	private int numeroPuertas; // variable numérica que almacene el número de puertas
	
	
	public Coche(int numeroPuerta) {
		
		this.numeroPuertas = numeroPuerta;
	}
	
	
	
	//  función que incremente el número de puertas que tiene el coche.
	public void incrementarPuertas() {
		this.numeroPuertas++; // incrementara de 1 en 1 
	}
	
	//metodo para obtener el numero de puertas
	 public int getNumeroPuertas() {
	        return this.numeroPuertas;
	 }

}
