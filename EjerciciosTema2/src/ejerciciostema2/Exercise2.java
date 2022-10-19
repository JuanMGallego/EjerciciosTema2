package ejerciciostema2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numDni; //Variable used to store the number introduced by the user
		char lettDni = 0; //Variable used to store the letter depending of the switch's option
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//The program asks for the number and it opens a space to introduce it
		
		System.out.print("Introduce los números de tu DNI: ");
		numDni = sc.nextInt();
		System.out.println();
		
		if (numDni < 1000000 || numDni > 100000000) { //option to prevent if the user introduces a wrong number
			
			System.out.println("ERROR: El número introducido no cumple con el número de caracteres min/máx");
			
		} else { //if not, it will do the option corresponding to the module of 23 of the number introduced
		
			switch (numDni%23) {
				
				case 0: 
					lettDni = 'T';
					break;
				
				case 1:
					lettDni = 'R';
					break;
					
				case 2:
					lettDni = 'W';
					break;
					
				case 3:
					lettDni = 'A';
					break;
					
				case 4:
					lettDni = 'G';
					break;
					
				case 5:
					lettDni = 'M';
					break;
					
				case 6:
					lettDni = 'Y';
					break;
					
				case 7:
					lettDni = 'F';
					break;
					
				case 8:
					lettDni = 'P';
					break;
					
				case 9:
					lettDni = 'D';
					break;
					
				case 10:
					lettDni = 'X';
					break;
					
				case 11:
					lettDni = 'B';
					break;
					
				case 12:
					lettDni = 'N';
					break;
					
				case 13:
					lettDni = 'J';
					break;
					
				case 14:
					lettDni = 'Z';
					break;
					
				case 15:
					lettDni = 'S';
					break;
					
				case 16:
					lettDni = 'Q';
					break;
					
				case 17:
					lettDni = 'V';
					break;
					
				case 18:
					lettDni = 'H';
					break;
					
				case 19:
					lettDni = 'L';
					break;
					
				case 20:
					lettDni = 'C';
					break;
					
				case 21:
					lettDni = 'K';
					break;
					
				case 22:
					lettDni = 'E';
					break;
			}
			
			System.out.println("El DNI completo es: " + numDni + lettDni); //the final result will be printed only if the letter is calculated
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
