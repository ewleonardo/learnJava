/* Escalas Utilizadas
 * 
 * Celsius (°C)
 * Fahrenheit (°F)
 * Kelvin (K)
 *  */

/* Celsius (°C)
 * 
 * (°C × 9/5) + 32 = °F
 * °C + 273,15 = K
 */

/* Fahrenheit (°F)
 * 
 * (°F) -> (°C)  = (ºF - 32) x 5/9 = ºC
 * (°F) -> (K)	 = (°F − 32) × 5/9 + 273,15 = K
 */

/* Kelvin (K)
 * 
 * K − 273,15 = °C
 * (K − 273,15) × 9/5 + 32 = °F
 */


import java.util.Scanner;

public class ConverterTemperatura {
	public static void main(String[] args) {
		// Variáveis
		double temperaturaFahrenheit;
		double temperaturaCelsius;
		final int ajuste = 32;
		final double ajusteDois = 5.0 / 9.0;
		double graus;
		double resultado;
		Scanner leia = new Scanner(System.in);

		temperaturaFahrenheit = 32;
		temperaturaCelsius = ((temperaturaFahrenheit - ajuste) * ajusteDois);
		System.out.println("");
		System.out.println("+-----------------------+");
		System.out.println("| Fahrenheit To Celsius |");
		System.out.println("+-----------------------+");
		
		System.out.println("\n+---------------------+");
		System.out.println("| Opções de Conversão |");
		System.out.println("+---------------------+");
		System.out.println("| 1 - (°C) → (°F)     |");
		System.out.println("| 2 - (°C) → (K)      |");
		System.out.println("| 3 - (°F) → (°C)     |");
		System.out.println("| 4 - (°F) → (K)      |");
		System.out.println("| 5 - (K)  → (°F)     |");
		System.out.println("| 6 - (K)  → (°C)     |");
		System.out.println("+---------------------+");
		System.out.println("| Escolha entre 1 à 6 |");
		System.out.println("+---------------------+");
		System.out.print("Opção:");
		short op = leia.nextShort();
		System.out.println("+---------------------+");
		System.out.print("Temperatura: ");
		graus = leia.nextInt();
		System.out.println("+---------------------+");
		// Celsius
		resultado = op == 1 ? (graus * 9/5) + 32 : 0;
		resultado = op == 2 ? (graus + 273.15) : resultado;
		// Fahrenheit
		resultado = op == 3 ? (graus - 32) * 5/9 : resultado;
		resultado = op == 4 ? (graus - 32) * 5/9 + 273.15 : resultado;
		// Kelvin
		resultado = op == 5 ? (graus - 273.15) * 9/5 + 32 : resultado;
		resultado = op == 6 ? graus - 273.15 : resultado;
		
		System.out.println("Resultado: " + resultado);

		leia.close();
		
//		System.out.println("\n+---------------------+");
//		System.out.println("| Graus em " + op);
//		System.out.println("| ");
//		System.out.println("| ");
//		System.out.println("\n+---------------------+");
//		
//		System.out.println("\n+---------------------+");
//		System.out.println("|      RESULTADO");
//		System.out.println("| ");
//		System.out.println("| ");
//		System.out.println("\n+---------------------+");
	}
}
