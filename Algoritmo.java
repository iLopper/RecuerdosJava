import libs.*;
public class Algoritmo {

	/** \
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Buen dia mundo de la programacion.");
		System.out.println("Ingrese dos valores numericos enteros separados por el ENTER:");
		int valor1=Input.get_int();
		int valor2=Input.get_int();
		System.out.println("Los Resultados de las sigueintes operaciones son los siguientes: ");
		System.out.println("RESTA: \t\t"+valor1+" - "+valor2+" = "+(valor1-valor2)+"");
		System.out.println("SUMA: \t\t"+valor1+" + "+valor2+" = "+(valor1+valor2)+"");
		System.out.println("MULTIPLICACION:\t\t"+valor1+" * "+valor2+" = "+(valor1*valor2)+"");
		System.out.println("DIVISION:\t\t"+valor1+" / "+valor2+" = "+(valor1/valor2)+"");

	}

}
