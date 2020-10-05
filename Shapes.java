// Wyatt Hanes
// Student ID: 300311372

import java.io.*;
import java.util.Scanner;


 public class Shapes {

 	public static void square(int input){
		for(int row = 0; row< input; row++){
			for(int col = 0; col <input; col++) {
				if(row == 0 || row == input-1)
					System.out.print("*");
				else {
					if (col == 0 || col == input - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println(" ");


	}

 	public static void twoTriangles(int input){

		int right = input -1;
		int left = 0;
		for(int row = 0; row <input; row++) {
			for (int col = 0; col < input; col++) {
				if (col == left || col == right)
					System.out.print("*");
				else {
					System.out.print(" ");
				}

			}
			left++;
			right--;
			System.out.println();
		}



	}


 	public static void main(String [] args) {
         		Scanner stdin = new Scanner(System.in);


				System.out.println("Do you want an O or an X? ");
				String inputString = stdin.nextLine();

				System.out.println("What size should it be?");
				int number = stdin.nextInt();

				switch (inputString){

					case "X", "x": twoTriangles(number); 
						break;
					
					case "o", "O": square(number); 
						break;
					
					default: System.out.println("Not an input");

				}

				stdin.close();








	}
 }
