package ejerciciostema2;

import java.util.Scanner;

public class Exercise3 {

	//buyFood = 200, numAnimal = 0, dailyFood = 150 --> ERROR: Ha introducido una cantidad de 0 o menos animales
	//buyFood = 140, numAnimal = -23, dailyFood = 50 --> ERROR: Ha introducido una cantidad de 0 o menos animales
	//buyFood = 300, numAnimal = 50, dailyFood = 200 --> Hay comida suficiente para todos los animales
	//buyFood = 100, numAnimal = 50, dailyFood = 200 --> Los animales no tienen suficiente comida, por lo que deberán comer 2.0kg cada uno
	//buyFood = 451, numAnimal = 32, dailyFood = 345 --> Hay comida suficiente para todos los animales
	//buyFood = 312, numAnimal = 234, dailyFood = 400 --> Los animales no tienen suficiente comida, por lo que deberán comer 1.3333333333333333kg cada uno

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double buyFood; //Variable used to store the food bought
		int numAnimal; //Variable used to store the number of animals
		double dailyFood; //Variables used to store the food animals daily eat
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//The user introduces the food bought
		System.out.print("Introduzca la cantidad de comida comprada en kg: ");
		buyFood = sc.nextDouble();
		
		//The user introduces the number of animals
		System.out.print("Introduzca el número de animales: ");
		numAnimal = sc.nextInt();
		
		//The user introduces all the food they eat
		System.out.print("Introduzca la cantidad de comida que comen todos los animales en kg: ");
		dailyFood = sc.nextDouble();
		System.out.println();
		
		//if animals are 0 or less, the program will print an error
		if (numAnimal <= 0) { 
			
			System.out.println("ERROR: Ha introducido una cantidad de 0 o menos animales");
			
		//if the food animals eat each day is less or the same than the bought one, it will print that there are enough
		} else if (dailyFood <= buyFood) {
			
			System.out.println("Hay comida suficiente para todos los animales");
			
		//else the program will print that there aren't enough and it will calculate how many food they have to eat individually
		} else {
			
			dailyFood = buyFood / numAnimal; 
			
			System.out.println("Los animales no tienen suficiente comida, por lo que deberán comer " + dailyFood + "kg cada uno");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
