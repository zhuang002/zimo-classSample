package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		for (int i=0;i<n;i++) {
			Student student = new Student(sc.next(),sc.next(), 
					new Date(sc.nextInt(), sc.nextInt(),sc.nextInt()),
					sc.next(), sc.next());
			
			
			students[i] = student;
		}
		
		
		for (Student student:students) {
			System.out.println(student);
		}
		

	}

}

class Human {
	
	String name;
	String gender;
	Date birthDate;
	String nationality;
	
	
	public Human(String name, String gender, Date birthDate, String nationality) {
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.nationality = nationality;
	}
	
	

	@Override
	public String toString() {
		return this.name+" "+this.gender+" " + this.birthDate
			+" "+this.nationality;
	}
	
	
	
	
}

class Date {
	int year;
	int month;
	int day;
	
	// constructor
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.year+" "+this.month+" " +this.day;
	}
}

class Student extends Human {
	String ID;
	
	public Student(String name, String gender, Date birthDate, String nationality, String id) {
		super(name,gender,birthDate,nationality);
		this.ID = id;
	}
		
	@Override
	public String toString() {
		return super.toString()+" "+this.ID;
	}
}