package es.cursojava.inicio.bucles;

public class BucleFor {

	public static void main(String[] args) {
		//1� parte inicializacion variables
		//2� parte condici�n que se tiene que cumplir para que el bucle se ejecute
		//3� modificaci�n variable por cada iteraci�n
		for (int i=0 ;  i<100    ;  i++  ) {
			//System.out.println("Hola "+i);
			if (i%2==0) {
				continue;
			}
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
			if (i>=10) {
				break;
			}
			
		}
		
		System.out.println("FIN");

	}

}
