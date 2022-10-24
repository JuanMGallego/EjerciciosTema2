package ejerciciostema2;

import java.util.Scanner;

public class Exercise1 {

	/*We test if each if section is correct introducing firstly numbers form one digit to four that are palindromic and
	introducing higher or lower numbers it will give an error. If no one of this conditions are fulfilled like with the 
	number 1234, the program will say that it isn't palindromic*/
	
	//numUser = -2 --> ERROR: El número introducido no está comprendido entre 0 y 9999
	//numUser = 12345 --> ERROR: El número introducido no está comprendido entre 0 y 9999
	//numUser = 9 --> ERROR: El número introducido SI es capicúa
	//numUser = 10 --> ERROR: El número introducido NO es capicúa
	//numUser = 55 --> ERROR: El número introducido SI es capicúa
	//numUser = 440 --> ERROR: El número introducido NO es capicúa
	//numUser = 606 --> ERROR: El número introducido SI es capicúa
	//numUser = 4755 --> ERROR: El número introducido NO es capicúa
	//numUser = 7557 --> ERROR: El número introducido SI es capicúa
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numUser; //Variable to store the number entered by the user
		final String Y_PALIN = "El número introducido SI es capicúa"; //Constant to print it when the number is palindromic
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//The program asks for a number between 0 and 9999 and it opens a space to introduce it
		
		System.out.print("Introduzca un número comprendido entre 0 y 9999: ");
		numUser = sc.nextInt();
		System.out.println();
		
		if (numUser < 0 || numUser > 9999) { //if the number is less than 0 or more than 9999 the program will print an error
			
			System.out.println("ERROR: El número introducido no está comprendido entre 0 y 9999");
			
		} else if (numUser < 10) { //if the number is less than 10 it means it is a single digit so is directly palindromic
			
			System.out.println(Y_PALIN); 
			
		//From this point the program will search for the number of digits the number has
			
		} else if (numUser < 100 && numUser/10 == numUser%10) { //(two digits) they have to be the same
			System.out.println(Y_PALIN);
			
		} else if (numUser < 1000 && numUser/100 == numUser%10) { //(Three digits) the first and the last one has to be the same
			
			System.out.println(Y_PALIN);
			
		} else if (numUser < 10000 && numUser/1000 == numUser%10 && (numUser/100)%10 == (numUser/10)%10) { //(Four digits) the first and the last, 
																										   //and the second and the third have to be the same numbers
			
			System.out.println(Y_PALIN);
			
		} else //if none of the previous options are fulfilled, it will say that the number isn't palindromic
			
			System.out.println("El número introducido NO es capicúa");
		
		sc.close(); //Scanner is closed
		
	}

}
