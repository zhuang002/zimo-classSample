package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Human[] persons = new Human[n];
		
		for (int i=0;i<n;i++) {
			Human person = new Human();
			person.name = sc.next();
			person.gender =sc.next();
			
			Date date = new Date();
			date.year = sc.nextInt();
			date.month = sc.nextInt();
			date.day = sc.nextInt();
			person.birthDate = date;
			
			person.nationality = sc.next();
			
			persons[i] = person;
		}
		
		
		for (Human person:persons) {
			System.out.println(person.getFullInfo());
		}

	}

}

class Human {
	String name;
	String gender;
	Date birthDate;
	String nationality;
	
	
	public String getFullInfo() {
		// TODO Auto-generated method stub
		return this.name+" "+this.gender+" " + this.birthDate.getInfo()
				+" "+this.nationality;
	}
	
	
}

class Date {
	int year;
	int month;
	int day;
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.year+" "+this.month+" " +this.day;
	}
}
