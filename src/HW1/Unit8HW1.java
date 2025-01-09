package HW1;

import java.util.Scanner;
public class Unit8HW1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//make your own 2D test array of integers (or whatever)
		int[][] test = {
				{2, 2, 12},
				{3, 27, 32},
				{23, 27, 36}
		};
		//ask user for column number
		System.out.println("Enter a column: ");
		int column = sc.nextInt();

		//make sure it is a valid option
		if (test[0].length > column && column >= 0){
			columnPrinter(column, test);
		} else {
			System.out.println("Inavlid Number!");
		}

		//print the column number they asked for with each element on a new line
		
	}
	public static void columnPrinter(int columnNumber, int[][] test){
		for (int[] row : test) {
			System.out.println(row[columnNumber]);
		}
	}
}
