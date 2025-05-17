package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxPopulation = Integer.MIN_VALUE;
		int index = -1;
		
		String[] cities = new String[n];
		int[] populations = new int[n];
		
		for (int i=0;i<n;i++) {
			cities[i] = sc.next();
			populations[i]  = sc.nextInt();
		}
		
		for (int i=0;i<cities.length;i++) {
			if (populations[i] > maxPopulation) {
				maxPopulation = populations[i];
				index = i;
			}
		}
		
		System.out.println(cities[index]);

	}

}
