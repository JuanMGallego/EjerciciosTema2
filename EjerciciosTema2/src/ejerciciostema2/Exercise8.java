package ejerciciostema2;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days;
		int distance;
		double price;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Introduzca el número de días de estancia: ");
		days = sc.nextInt();
		System.out.print("Introduzca la distancia a recorrer: ");
		distance = sc.nextInt();
		System.out.println();
		
		price = distance * 2.5;
		
		if (distance > 800 && days > 7) {
			
			price = price * 0.70;
			
		}
		
		System.out.println("Su billete tiene un precio de " + price + " euros");
		
		sc.close();
		
	}

}
