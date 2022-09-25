package entity;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Student implements Person{
	private int rollno;
	private String first_name;
	private String last_name;
	private String Department;
	private String mobileno;
	
	public int getRollno() {
		return rollno;
	}
	public String getfirst_name() {
		return first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public String getDepartment() {
		return Department;
	}
	public String getMobileno() {
		return mobileno;
	}
	
	public String toString() {
		return "The Student's Roll No is : " + rollno +
				"\nThe Student's First Name is:" + first_name +
				"\nThe Student's Last name is:" + last_name +
				"\nThe Student's Department is: "+ Department +
				"\nThe Student's Mobile No is: "+ mobileno;
	}
	
	Student(int rollno,String first_name,String last_name,String Department,String mobileno){
		this.rollno = rollno;
		this.first_name = first_name;
		this.last_name = last_name;
		this.Department = Department;
		this.mobileno = mobileno;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	Scanner read = new Scanner(System.in);
	// Initializing the arraylist
	ArrayList<Student> st = new ArrayList<Student>();
	@Override
	public void insert() {
		System.out.println("Enter the Roll No : ");
		rollno = read.nextInt();
		System.out.println("Enter the First Name : ");
		first_name = read.next();
		System.out.println("Enter the Student's Last Name : ");
		last_name = read.next();
		System.out.println("Enter the Student's Department : ");
		Department = read.next();
		System.out.println("Enter the Student's Mobile No : ");
		mobileno = read.next();
		st.add(new Student(rollno,first_name,last_name,Department,mobileno));
	}
	@Override
	public void display() {
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			Student su = it.next();
			System.out.println(su);
		}
	}
	
	public void searchbyrollno() {
		System.out.println("Enter the Roll No : ");
		int rollno = read.nextInt();
		Iterator<Student> iu = st.iterator();
		while(iu.hasNext()) {
			Student sd = iu.next();
			if(sd.getRollno() == rollno) {
				System.out.println(sd);
			}
			else {
				System.out.println("No such Student Record Found....");
			}
		}
	}
	public void searchbyfirst_name() {
		System.out.println("Enter the Student's First Name : ");
		String name = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student se = is.next();
			if(se.getfirst_name().equals(name)) {
				System.out.println(se);
			}
			else {
				System.out.println("No such Student Record Found....");
			}
		}
	}
	public void searchbylast_name() {
		System.out.println("Enter the Student Last Name : ");
		String name = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student se = is.next();
			if(se.getlast_name().equals(name)) {
				System.out.println(se);
			}
			else {
				System.out.println("No such Student Record Found....");
			}
		}
	}
	
	public void searchbydepartment() {
		System.out.println("Enter the Department Name : ");
		String name = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student se = is.next();
			if(se.getDepartment().equals(name)) {
				System.out.println(se);
			}
			else {
				System.out.println("No such Student Record Found....");
			}
		}
	}
	public void searchbymobileno() {
		System.out.println("Enter the Student's Mobile No : ");
		String mobileno = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student sn = is.next();
			if(sn.getMobileno().equals(mobileno)) {
				System.out.println(sn);
			}
			else {
				System.out.println("No such Student Record Found....");
			}
		}
	}

}