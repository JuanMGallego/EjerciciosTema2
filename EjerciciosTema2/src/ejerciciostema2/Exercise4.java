package ejerciciostema2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int frstDigit;
		int scndDigit;
		String writFrstNum;
		String writScndNum;
		final String FINAL_MESSAGE = "Su número escrito con letras es: ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un númro del 1 al 99: ");
		num = sc.nextInt();
		System.out.println();
		
		frstDigit = num/10;
		scndDigit = num%10;
		
		writScndNum = switch (scndDigit) {
		
			case 1 -> {
				yield "uno";
				}
			
			case 2 -> {
				yield "dos";
				}
			
			case 3 -> {
				yield "tres";
				}
			
			case 4 -> {
				yield "cuatro";
				}
			
			case 5 -> {
				yield "cinco";
				}
			
			case 6 -> {
				yield "seis";
				}
			
			case 7 -> {
				yield "siete";
				}
			
			case 8 -> {
				yield "ocho";
				}
			
			case 9 -> {
				yield "nueve";
				}
			
			default -> "";
		
		};
		
		writFrstNum = switch (frstDigit) {
		
			case 1 -> {
				yield "dieci";
				}
			
			case 2 -> {
				yield "veinti";
				}
			
			case 3 -> {
				yield "treinta y ";
				}
			
			case 4 -> {
				yield "cuarenta y ";
				}
			
			case 5 -> {
				yield "cincuenta y ";
				}
			
			case 6 -> {
				yield "sesenta y ";
				}
			
			case 7 -> {
				yield "setenta y ";
				}
			
			case 8 -> {
				yield "ochenta y ";
				}
			
			case 9 -> {
				yield "noventa y ";
				}
			
			default -> "";
		
		};
		
		if (num < 1 || num > 99) {
			
			System.out.println("ERROR: El número introducido no cumple con el número de caracteres min/máx");
			
		} else if (num > 10 && num < 16 || scndDigit == 0) {
			
			switch (num) {
			
				case 10 -> System.out.println(FINAL_MESSAGE + "diez");
				
				case 11 -> System.out.println(FINAL_MESSAGE + "once");
				
				case 12 -> System.out.println(FINAL_MESSAGE + "doce");
				
				case 13 -> System.out.println(FINAL_MESSAGE + "trece");
				
				case 14 -> System.out.println(FINAL_MESSAGE + "catorce");
				
				case 15 -> System.out.println(FINAL_MESSAGE + "quince");
				
				case 20 -> System.out.println(FINAL_MESSAGE + "veinte");
				
				case 30 -> System.out.println(FINAL_MESSAGE + "treinta");
				
				case 40 -> System.out.println(FINAL_MESSAGE + "cuarenta");
				
				case 50 -> System.out.println(FINAL_MESSAGE + "cincuenta");
				
				case 60 -> System.out.println(FINAL_MESSAGE + "sesenta");
				
				case 70 -> System.out.println(FINAL_MESSAGE + "setenta");
				
				case 80 -> System.out.println(FINAL_MESSAGE + "ochenta");
				
				case 90 -> System.out.println(FINAL_MESSAGE + "noventa");
			
			}
			
		} else if (num < 10) {
				
			System.out.println(FINAL_MESSAGE + writScndNum);
			
		} else if (num > 10) {
			
			System.out.println(FINAL_MESSAGE + writFrstNum + writScndNum);
			
		}
		
		sc.close();
		
	}

}
