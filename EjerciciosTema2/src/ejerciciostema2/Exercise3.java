package ejerciciostema2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double buyFood;
		int numAnimal;
		double dailyFood;
		double needFood;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de comida comprada en kg: ");
		buyFood = sc.nextDouble();
		System.out.print("Introduzca el n�mero de animales: ");
		numAnimal = sc.nextInt();
		System.out.print("Introduzca la cantidad de comida que come cada animal en kg: ");
		dailyFood = sc.nextDouble();
		System.out.println();
		
		needFood = numAnimal * buyFood;
		
		if (needFood <= dailyFood) {
			
			System.out.println("Hay comida suficiente para todos los animales");
			
		} else {
			
			dailyFood = buyFood / numAnimal;
			
			System.out.println("Los animales no tienen suficiente comida, por lo que deber�n comer " + dailyFood + "kg cada uno");
			
		}
		
		sc.close();
		
	}

}