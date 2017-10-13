/*
 * Author: Troy Veldhuizen
 * 11727 - Cost Cutting
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String td = "3\n"
				+ "1000 2000 3000\n"
				+ "3000 2500 1500\n"
				+ "1500 1200 1800";
		
		int cases;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList();
		
		cases = sc.nextInt();
		
		for(int i = 0; i < cases; ++i) {
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			list.add(sc.nextInt());	
			Collections.sort(list);
			System.out.printf("Case %d: %d\n", i + 1, list.get(1));
			list.clear();
		}
	}
}
