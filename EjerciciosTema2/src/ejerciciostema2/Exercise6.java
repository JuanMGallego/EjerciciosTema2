package ejerciciostema2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		int userNum;

		Scanner sc = new Scanner(System.in);

		System.out.println("EL JUEGO DE LA SUMA");
		System.out.println();

		num1 = (int) (Math.random() * 99);
		num2 = (int) (Math.random() * 99);
		
		System.out.print("¿Cuanto es " + num1 + " + " + num2 + "?: ");
		userNum = sc.nextInt();
		System.out.println();
		
		if (userNum == num1 + num2) {
			
			System.out.println("¡Correcto! :)");
			
		} else {
			
			System.out.println("Incorrecto :(");
			
		}
		
		sc.close();

	}

}
