package ejerciciostema2;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sec, min, hour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora:");
		System.out.print("horas: ");
		hour = sc.nextInt();
		System.out.print("minutos: ");
		min = sc.nextInt();
		System.out.print("segundos: ");
		sec = sc.nextInt();
		System.out.println();
		
		sec = sec + 1;
		
		if (sec == 60) {
			
			min = min + 1;
			sec = 0;
		
		}
		
		if (min >= 60) {
				
			hour = hour + 1;
			min = 0;
				
		}
		
		if (hour == 24) {
					
			hour = 0;
			min = 0;
			sec = 0;
				
		}
		
		sc.close();
		
	}

}
