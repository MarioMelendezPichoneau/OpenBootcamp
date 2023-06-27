package OpenBootcamp;

public class Ejercicio_tema_3 {

	public static void main(String[] args) {
		
		// Primera parte:
		// Crear una función con tres parámetros que sean números que se suman entre sí.
		// Llamar a la función en el main y darle valores.
		
		int resultado = sumarNumeros(10, 5, 20);
		System.out.println(resultado);
		
		
		
		
		// Segunda parte:
		
		Coche miCoche = new Coche(5);
		
		miCoche.incrementarPuertas();// incremento el numero de puertas => 5 + 1 = 6 puertas deberia ser el resultado
		
		System.out.println("Mi coche tiene " + miCoche.getNumeroPuertas() + " puertas.");
		
		

	}
	
	
	// funcion que toma los numeros y los suma 
	public static int sumarNumeros(int a, int b, int c) {
		
		return a+b+c;
	}
	
	
	
}

