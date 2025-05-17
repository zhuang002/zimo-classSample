package classSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		for (int i=0;i<n;i++) {
			Student student = new Student();
			student.name = sc.next();
			student.gender =sc.next();
			
			Date date = new Date();
			date.year = sc.nextInt();
			date.month = sc.nextInt();
			date.day = sc.nextInt();
			student.birthDate = date;
			
			student.nationality = sc.next();
			student.ID = sc.next();
			
			students[i] = student;
		}
		
		
		for (Student student:students) {
			System.out.println(student.getFullInfo());
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

class Student extends Human {
	String ID;
	
	public String getFullInfo() {
		// TODO Auto-generated method stub
		return super.getFullInfo()+" "+this.ID;
	}
}