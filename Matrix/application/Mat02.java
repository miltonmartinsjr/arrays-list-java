package application;

import java.util.Scanner;

public class Mat02 {

	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);

		int line = imput.nextInt();
		int column = imput.nextInt();
		int[][] mat = new int[line][column];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = imput.nextInt();
			}
		}
		
		System.out.print("Enter the matrix number: ");
		int number = imput.nextInt();
	
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == number) {
					System.out.println("Position " + i + "," + j +":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Rigth: " + mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		}
			
		
		imput.close();
	}

}
