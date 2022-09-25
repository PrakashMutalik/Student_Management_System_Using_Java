package student_management;
import java.util.Scanner;

public class Menu {
	int studentchoice;
	int teacherchoice;
	
    entity.Student s = new entity.Student();  //accessing the student class by using qualified name
    entity.Teacher td = new entity.Teacher(); //accessing the teacher class by using qualified name

	public void option() {
		Scanner read = new Scanner(System.in);
		int con;
		System.out.println("Student Management System");
		System.out.println("-----------------------------");
		do {
			System.out.println();
			System.out.println("1.Student");
			System.out.println("2.Teacher");
			System.out.println("3.Exit");
			System.out.println("Enter Your Choice : ");
			con = read.nextInt(); // if the user input is zero then do while gets stopped.
			System.out.println();
			switch (con) {
			case 1:
				System.out.println("1.Insert the Student Record");
				System.out.println("2.Display the Student Record");
				System.out.println("3.Search the Student by Roll No");
				System.out.println("4.Search the Student by First Name");
				System.out.println("5.Search the Student by Last Name");
				System.out.println("6.Search the Student by Mobile No");
				System.out.println("7.Search the Student by Department");
				System.out.println("6.Exit");
				System.out.println("Enter Your Choice : ");
				studentchoice = read.nextInt();
				
				switch (studentchoice) {
				case 1:
					s.insert(); // accessing the insert method in student class
					break;
				case 2:
					s.display(); // accessing the display method in student class
					break;
				case 3:
					s.searchbyrollno(); // accessing the searchbyrollno method in student class
					break;
				case 4:
					s.searchbyfirst_name(); // accessing the searchbyname method in student class
					break;
				case 5:
					s.searchbylast_name();
					break;
				case 6:
					s.searchbymobileno(); // accessing the searchbymobileno method in student class
					break;
				case 7:
					s.searchbydepartment();
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice....");
				}
				break;
				
			case 2:
				System.out.println("1.Insert the Teacher Record");
				System.out.println("2.Display the Teacher Record");
				System.out.println("3.Search the Teacher by Id");
				System.out.println("4.Search the Teacher by First Name");
				System.out.println("5.Search the Teacher by Last Name");
				System.out.println("6.Search the Teacher by Department");
				System.out.println("7.Search the Teacher by Mobile No");
				System.out.println("8.Exit");
				teacherchoice = read.nextInt();
				switch (teacherchoice) {
				case 1:
					td.insert(); // accessing the insert method in teacher class
					break;
				case 2:
					td.display(); // accessing the display method in teacher class
					break;
				case 3:
					td.searchbyempid(); // accessing the searchbyempid in teacher class
					break;
				case 4:
					td.searchbyfirst_name(); // accessing the searchbyname method in teacher class
					break;
				case 5:
					td.searchbylast_name();
					break;
				case 6:
					td.searchbydepartment();
					break;
				case 7:
					td.searchbymobileno(); // accessing the searchbymobileno method in teacher class
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice....");
				}
				break;
			case 3:
				System.out.println("Thank You....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice....");
			}
		} while (con != 0);
	}
}