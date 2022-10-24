package ejerciciostema2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double buyFood;
		int numAnimal;
		double dailyFood;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de comida comprada en kg: ");
		buyFood = sc.nextDouble();
		System.out.print("Introduzca el número de animales: ");
		numAnimal = sc.nextInt();
		System.out.print("Introduzca la cantidad de comida que comen todos los animales en kg: ");
		dailyFood = sc.nextDouble();
		System.out.println();
		
		if (numAnimal == 0) {
			
			System.out.println("ERROR: Ha introducido una cantidad de 0 animales");
			
		} else if (dailyFood <= buyFood) {
			
			System.out.println("Hay comida suficiente para todos los animales");
			
		} else {
			
			dailyFood = buyFood / numAnimal; 
			
			System.out.println("Los animales no tienen suficiente comida, por lo que deberán comer " + dailyFood + "kg cada uno");
			
		}
		
		sc.close();
		
	}

}
