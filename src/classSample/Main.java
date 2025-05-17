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
			person.birthyear = sc.nextInt();
			person.birthmonth = sc.nextInt();
			person.birthday = sc.nextInt();
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
	int birthyear;
	int birthmonth;
	int birthday;
	String nationality;
	
	
	public String getFullInfo() {
		// TODO Auto-generated method stub
		return this.name+" "+this.gender+" " + this.birthyear +" "+this.birthmonth+" "+this.birthday
				+" "+this.nationality;
	}
	
	
}
