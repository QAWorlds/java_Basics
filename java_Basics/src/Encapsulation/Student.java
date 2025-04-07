package Encapsulation;

public class Student {
private int rollno ;
private String name ;
private boolean isattanded;

public Student(int rollno){
	
	this.rollno=rollno;
	
}
	
	
	public void setstudentattandance(boolean flag) {
		if
		
	(isattanded)
		
		isattanded = flag;
		System.out.println("present");
		
		
		}
	//////////////////////////////////////////////////////////////////
		public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


		public boolean getstudentattandance() {
			System.out.println("accese attanded");
			
		return	isattanded;
		
	}
}