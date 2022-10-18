package ejerciciostema2;

import java.util.Scanner;

public class Exercise1 {

	/*We test if each if section is correct introducing firstly numbers form one digit to four that are palindromic and
	introducing higher or lower numbers it will give an error. If no one of this conditions are fulfilled like with the 
	number 1234, the program will say that it isn't palindromic*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numUser; //Variable to store the number entered by the user
		final String yCapicua = "El número introducido SI es capicúa"; //Constant to print it when the number is palindromic
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//The program asks for a number between 0 and 9999 and it opens a space to introduce it
		
		System.out.print("Introduzca un número comprendido entre 0 y 9999: ");
		numUser = sc.nextInt();
		System.out.println();
		
		if (numUser < 0 || numUser > 9999) {
			
			System.out.println("ERROR: El número introducido no está comprendido entre 0 y 9999");
			
		} else if (numUser < 10) { //if the number 
			
			System.out.println(yCapicua);
			
		} else if (numUser < 100 && numUser/10 == numUser%10) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 1000 && numUser/100 == numUser%10) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 10000 && numUser/1000 == numUser%10 && (numUser/100)%10 == (numUser/10)%10) {
			
			System.out.println(yCapicua);
			
		} else
			
			System.out.println("El número introducido NO es capicúa");
		
		sc.close();
		
	}

}
