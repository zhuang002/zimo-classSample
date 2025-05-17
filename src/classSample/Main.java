package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxPopulation = Integer.MIN_VALUE;
		City maxCity = null;
		City[] cities = new City[n];
		
		for (int i=0;i<n;i++) {
			City city = new City();
			
			city.name = sc.next();
			city.population = sc.nextInt();
			city.brev = sc.next();
			city.gdp = sc.nextInt();
			
			
			cities[i] = city;
		}
		
		for (int i=0;i<cities.length;i++) {
			if (cities[i].population > maxPopulation) {
				maxPopulation = cities[i].population;
				maxCity = cities[i];
			}
		}
		
		//System.out.println(maxCity.name + " " + maxCity.population+" "+maxCity.brev+" "+maxCity.gdp);
		String information = maxCity.info();
		System.out.println(information);
	}

}


class City {
	String name;
	int population;
	String brev;
	int gdp;
	
	public String info() {
		// TODO Auto-generated method stub
		return this.name+" "+this.population+" "+this.brev+" "+this.gdp;
	}
}
