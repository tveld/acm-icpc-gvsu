/*
 * Author: Troy Veldhuizen
 * 1260 - Sales
 */

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String sampleInput = "2\n"
				+ "5\n"
				+ "38 111 102 111 177\n"
				+ "8\n"
				+ "276 284 103 439 452 276 452 389";
		
		Scanner sc = new Scanner(System.in);
		
		int sum;
		
		int[] data;
		int cases = sc.nextInt();
		
		// loops through all cases
		for(int i = 0; i < cases; i++) {
			
			sum = 0;
			
			//get size of case
			int n = sc.nextInt();
			
			data = new int[n];
			
			// loops through individual case
			for(int j = 0; j < n; j++) {
				
				data[j] = sc.nextInt();
				
				for(int k = 0; k < j; k++) {
					if(data[k] <= data[j]) {
						sum++;
					}
				}
								
				
				
			}
			
			System.out.println(sum);
		}				
	}
}
