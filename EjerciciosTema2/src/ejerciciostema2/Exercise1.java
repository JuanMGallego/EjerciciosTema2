package ejerciciostema2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numUser;
		final String yCapicua = "El n�mero introducido es capic�a";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero comprendido entre 0 y 9999: ");
		numUser = sc.nextInt();
		
		if (numUser < 0 || numUser > 9999) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 10) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 100 && numUser/10 == numUser%10) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 1000 && numUser/100 == numUser%10) {
			
			System.out.println(yCapicua);
			
		} else if (numUser < 10000 && numUser/1000 == numUser%10 && numUser/100 == (numUser/10)%10) {
			
			System.out.println(yCapicua);
			
		} else
			
			System.out.println("El n�mero introducido no es capic�a");
		
		sc.close();
		
	}

}
