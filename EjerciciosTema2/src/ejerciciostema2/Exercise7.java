package ejerciciostema2;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sec, min, hour; //Variables are used to store the hours, minutes and seconds that user enters
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//title and spaces to ask the user for the hour
		
		System.out.println("Introduce la hora:");
		System.out.print("horas: ");
		hour = sc.nextInt();
		System.out.print("minutos: ");
		min = sc.nextInt();
		System.out.print("segundos: ");
		sec = sc.nextInt();
		System.out.println();
		
		sec = sec + 1; //operation to add one second to the hour introduced
		
		//if seconds are 60, they convert into a minute
		
		if (sec == 60) {
			
			min = min + 1;
			sec = 0;
		
		}
		
		//if minutes are 60, they convert into a minute
		
		if (min >= 60) {
				
			hour = hour + 1;
			min = 0;
				
		}
		
		//if the hours are 24, all transforms to 0:0:0
		
		if (hour == 24) {
					
			hour = 0;
			min = 0;
			sec = 0;
				
		}
		
		System.out.println("La hora dentro de un segundo es: " + hour + ":" + min + ":" + sec); //Final message printed to the user
		
		sc.close(); //Scanner is closed
		
	}

}
