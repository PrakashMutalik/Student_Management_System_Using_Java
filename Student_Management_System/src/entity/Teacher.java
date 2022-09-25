package entity;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Teacher implements Person{
	private int empid;
	private String first_name;
	private String last_name;
	private String job_position;
	private String Department;
	private String mobileno;
	
	public int getempid() {
		return empid;
	}
	public String getfirst_name() {
		return first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public String getJob_position() {
		return job_position;
	}
	public String getDepartment() {
		return Department;
	}
	public String getMobileno() {
		return mobileno;
	}
	
	public String toString() {
		return "The Teacher's Id is : " + empid +
				"\nThe Teacher's First Name is : " + first_name +
				"\nThe Teacher's Last Name is : " + last_name +
				"\nThe Teacher's Role is : " + job_position +
				"\nThe Teacher's Department is :  "+ Department +
				"\nThe Teacher's Mobile No is :  "+ mobileno;
	}
	
	Teacher(int empid,String first_name,String last_name,String job_position,String Department,String mobileno){
		this.empid = empid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.job_position = job_position;
		this.Department = Department;
		this.mobileno = mobileno;
	}
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	Scanner read = new Scanner(System.in);
	// Initializing the arraylist
	ArrayList<Teacher> st = new ArrayList<Teacher>();
	@Override
	public void insert() {
		System.out.println("Enter the Teacher's ID : ");
		empid = read.nextInt();
		System.out.println("Enter the First Name :  ");
		first_name = read.next();
		System.out.println("Enter the Teacher's Role :  ");
		job_position = read.next();
		System.out.println("Enter the Teacher's Department : ");
		Department = read.next();
		System.out.println("Enter the Teacher's Mobile No : ");
		mobileno = read.next();
		st.add(new Teacher(empid,first_name,last_name,job_position,Department,mobileno));
	}
	@Override
	public void display() {
		Iterator<Teacher> it = st.iterator();
		while(it.hasNext()) {
			Teacher su = it.next();
			System.out.println(su);
		}
	}
	
	public void searchbyempid() {
		System.out.println("Enter the Teacher's ID : ");
		int empid = read.nextInt();
		Iterator<Teacher> iu = st.iterator();
		while(iu.hasNext()) {
			Teacher tr = iu.next();
			if(tr.getempid() == empid) {
				System.out.println(tr);
			}
			else {
				System.out.println("No such Teacher's Record Found...");
			}
		}
	}
	public void searchbyfirst_name() {
		System.out.println("Enter the Teacher's First Name : ");
		String name = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher th = is.next();
			if(th.getfirst_name().equals(name)) {
				System.out.println(th);
			}
			else {
				System.out.println("No such Teacher's Record Found...");
			}
		}
	}
	
	public void searchbylast_name() {
		System.out.println("Enter the Teacher's Last Name : ");
		String name = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher th = is.next();
			if(th.getlast_name().equals(name)) {
				System.out.println(th);
			}
			else {
				System.out.println("No such Teacher's Record Found...");
			}
		}
	}
	
	public void searchbydepartment() {
		System.out.println("Enter the Department Name : ");
		String name = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher th = is.next();
			if(th.getDepartment().equals(name)) {
				System.out.println(th);
			}
			else {
				System.out.println("No such Teacher's Record Found...");
			}
		}
	}
	public void searchbymobileno() {
		System.out.println("Enter the Teacher's mobileno");
		String mobileno = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher tc = is.next();
			if(tc.getMobileno().equals(mobileno)) {
				System.out.println(tc);
			}
			else {
				System.out.println("No such Teacher's Record Found...");
			}
		}
	}

}