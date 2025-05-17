package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxPopulation = Integer.MIN_VALUE;
		String maxCity = null;
		for (int i=0;i<n;i++) {
			String city = sc.next();
			int population  = sc.nextInt();
			
			if (population > maxPopulation) {
				maxPopulation = population;
				maxCity = city;
			}
		}
		
		System.out.println(maxCity);

	}

}
