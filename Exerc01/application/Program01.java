package application;

import java.util.Scanner;

import entities.Location;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Location[] vect = new Location[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		
		for(int i = 1; i <= rooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Location(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms");
		for(int i=0; i< vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
