package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

import entitites.Rent;

public class ExerciseAboutVectors {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rent[] vect = new Rent[10];
		
		System.out.println("Jow many rooms will be rented? ");
		int n = sc.nextInt();
		
		for ( int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for ( int i = 0; i < 10; i++) {
			if ( vect[i] != null ) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
