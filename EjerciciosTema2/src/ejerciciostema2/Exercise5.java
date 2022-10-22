package ejerciciostema2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		double absValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num = sc.nextDouble();
		System.out.println();
		
		absValue = (num < 0)?-(num):num;
		
		System.out.println("El valor absoluto de " + num + " es " + absValue);
		
		sc.close();
		
	}

}
