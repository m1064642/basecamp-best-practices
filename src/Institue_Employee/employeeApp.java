package Institue_Employee;

import java.util.*;

public class employeeApp {

	static Scanner sc = new Scanner(System.in);
	static int size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number of emplyoee: ");
		size =  sc.nextInt();
		Emplyoee emp[] = new Emplyoee[size];
		
		addEmp(emp);

		while (true) {
			int choice = display_menu();
			// System.out.println(choice);

			switch (choice) {
			case 1:showEmp(emp);                               break;
			case 2:addEmp(emp);	                               break;
			case 3:updateEmp(emp);                             break;
			case 4:deleteEmp(emp);                             break;
			case 5:experience_wise_dispaly(emp);               break;
			case 6:searchEmp(emp);                             break;
			case 7:System.exit(0);                             break;
			default:System.out.println("Please enter valid input");
			}
		}
	}

	private static int display_menu() {
		// TODO Auto-generated method stub
		System.out.println("1. Show Emplyoee");
		System.out.println("2. Add Emplyoee");
		System.out.println("3. Update employee");
		System.out.println("4. Delete emplyoee");
		System.out.println("5  Show emp by experience");
		System.out.println("6. Search Emplyoee ");
		System.out.println("7. Exit");
		System.out.println();
		int n = sc.nextInt();

		return n;
	}

	private static void showEmp(Emplyoee[] emp) {
		// TODO Auto-generated method stub
		for (int i = 0; i < emp.length; i++) {
			emp[i].display();
		}
		System.out.println();
	}

	private static void addEmp(Emplyoee[] emp) {
		// TODO Auto-generated method stub
		for(int i =0; i < emp.length; i++)
		{
			System.out.print("Enter  id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter  Name: ");
			String name = sc.nextLine();
			
			
			System.out.print("Select  department: 1.Computer 2.Arts 3.Physics"); //computer/arts/physics
			String dept=selectDept();
			
			System.out.print("Enter  Experience: ");
			int exp = sc.nextInt();
			
			System.out.print("Select  Degination: 1.HOD 2.Assistant Professor 3.Professor 4.Instructor "); // HOD, Assistant Professor, Professor, Instructor
			String deg= selectDeg();
	
			System.out.println();
			
			emp[i] = new Emplyoee(id, name, dept, exp, deg);
			
		}
		
		//Test purpose emp size  =3;
//		emp[0] = new Emplyoee(1, "Nikhil", "computer", 5, "HOD");
//		emp[1] = new Emplyoee(2, "vicky", "arts", 6, "Instructor");
//		emp[2] = new Emplyoee(3, "anushree", "physics", 7, "Professor");

	}

	private static String selectDept() {
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		String dept = "";

		if (a == 1)
			return "computer";
		else if (a == 2)
			return "arts";
		else if (a == 3)
			return "physics";
		else
			System.out.println("Invalid Option");

//		switch(a)
//		{
//		case 1: dept = "computer";  break;
//		case 2: dept = "Arts";      break;
//		case 3: dept = "Physics";   break;
//		default: System.out.println("Invalid Option"); 
//		//goto repeat;
//		}
		return selectDept();
	}

	private static String selectDeg() {
		// TODO Auto-generated method stub
		int p = sc.nextInt();
		if (p == 1)
			return "HOD";
		else if (p == 2)
			return "Assistant Professor";
		else if (p == 3)
			return "Professor";
		else if (p == 4)
			return "Instructor";
		else
			System.out.println("Invalid Option");

		return selectDeg();
	}

	private static void updateEmp(Emplyoee[] emp) {
		// TODO Auto-generated method stub

		System.out.println("Enter the name to update degination");
		String n = sc.next();
		boolean name = false;

		

		for (int i = 0; i < emp.length; i++) {
			if (n.equals(emp[i].empName)) {
				System.out.println("Select New Degination: 1.HOD 2.Assistant Professor 3.Professor 4.Instructor");
				name = true;
				emp[i].degination = selectDeg();
				System.out.println("Degination updated succefully...");
				emp[i].display();
				break;
			}
		}
		if (name == false) {
			System.out.println("Emplyoee Not found.....please retype eith correct name");
			updateEmp(emp);
		}

	}

	private static void deleteEmp(Emplyoee[] emp) {
		// TODO Auto-generated method stub
		Emplyoee[] copy = new Emplyoee[emp.length - 1];
		System.out.println("Enter the emplyoee id to delete");
		int sr = sc.nextInt();

		for (int i = 0, j = 0; i < emp.length; i++) {
			if (sr == emp[i].empId) {
				//copy[j++] = emp[i];
				emp[i] = new Emplyoee(0, "", "", 0, "");			
			}
		}
		//size -= 1;

		//System.out.println(copy.length);
		for (int i = 0; i < size; i++) {
			
//			if(emp.length == i)
//				{emp[i]=null;}
//			else {
//				emp[i] = copy[i];}
			emp[i].display();
		}

	}

	private static void experience_wise_dispaly(Emplyoee[] emp) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of experience:  ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		// Size of resultant array;
		int count = 0;
		for (int i = 0, j = 0; i < emp.length; i++) {
			if (emp[i].exp >= n1 && emp[i].exp <= n2) {
				count++;
			}
		}
		System.out.println("***************Result is: " + count + "**************");
		System.out.println("Resulted details of emplyoee is sorted accourding to department in ascending order.");

		Emplyoee[] sort = new Emplyoee[count]; // = new Emplyoee[size];
		for (int i = 0, j = 0; i < emp.length; i++) {
			if (emp[i].exp >= n1 && emp[i].exp <= n2) {
				sort[j++] = emp[i];
				// sort[j-1].display();
			}
		}

		sortArray(sort);
//		for(int i =0; i< sort.length;i++)
//		{
//			sort[i].display();
//		}
//		
	}

	private static void sortArray(Emplyoee[] sort) {
		// TODO Auto-generated method stub
		Emplyoee temp;
		for (int i = 0; i < sort.length; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i].deptName.compareTo(sort[j].deptName) > 0) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}

		}

		for (int i = 0; i < sort.length; i++) {
			sort[i].display();
		}

	}

	private static void searchEmp(Emplyoee[] emp) {
		// TODO Auto-generated method stub
		System.out.print("Select  Degination: 1.HOD 2.Assistant Professor 3.Professor 4.Instructor ");
		String find = selectDeg();

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].degination == find) {
				emp[i].display();
			}
		}

	}

}
