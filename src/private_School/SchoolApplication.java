package private_School;

import java.util.Scanner;

public class SchoolApplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isExit = false;

		// take input from user for size of obj array
		System.out.print("Enter the No of Student:  ");
		int noOfStudent = sc.nextInt();

		Student[] students = new Student[noOfStudent];

		// add student details and return the same array
		students = createStudent(students);

		// for repeating the steps until user wants to exit
		do {
			// return the choice option from menu
			int choice = showMenu();

			/*
			 * 1. for sorting the student in asc by the name (use selection sort) 2. Display
			 * student details those who remains to paid fees / check with all student
			 * details whoes status is not submitted 3. Update the feesSubmitted variable as
			 * a true if this method is call by taking input from user for a student name/id
			 * 4. Display students according to class by taking input from user for class
			 */
			switch (choice) {
			case 1:
				boolean successful = displayStudent(students);
				break;
			case 2:
				students = sortStudentByName(students);
				break;
			case 3:
				students = showUnpaidFeesStudent(students);
				break;
			case 4:
				students = updateFees(students);
				break;
			case 5:
				students = showStudentByClass(students);
				break;
			case 6:
				System.out.println("<Thank You>");
				isExit = true;

			}

		} while (!isExit);

	}

	private static Student[] showStudentByClass(Student[] students) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Class to Show all Student:  ");
		byte std = sc.nextByte();

		for (int i = 0; i < students.length; i++) {
			if (std == students[i].getStandard()) {
				students[i].display();
			}
		}
		return students;
	}

	private static Student[] updateFees(Student[] students) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Id to Update Fees Status:  ");
		int newId = sc.nextInt();

		for (int i = 0; i < students.length; i++) {
			if (newId == students[i].getId()) {
				students[i].setIsfeesSubmitted(true);
				System.out.println("Updated successfuly........");
				students[i].display();
			}
		}

		return students;
	}

	private static Student[] showUnpaidFeesStudent(Student[] students) {
		// TODO Auto-generated method stub

		for (int i = 0; i < students.length; i++) {
			if (!students[i].isIsfeesSubmitted()) {
				students[i].display();
			}
		}
		return students;
	}

	private static Student[] sortStudentByName(Student[] students) {
		// TODO Auto-generated method stub
		Student temp = new Student();

		Student[] arr = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			arr[i] = students[i];
		}

//		for (int i = 0; i < students.length; i++) {
//			for (int j = 0; j < students.length; j++) {
//				if (arr[i].getName().compareTo(arr[j].getName()) > 0) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		//insertion sort 
		for(int i = 1; i < arr.length; i++)
		{
			Student key = arr[i];
			
			int j = i-1;
			
			while((j> -1) && (arr[j].getName().compareTo(key.getName()) > 0))
			{
				arr[j+1]=  arr[j];
				j--;
			}
			arr[j+1] = key;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}

		return students;
	}

	private static boolean displayStudent(Student[] students) {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.length; i++) {
			students[i].display();
		}
		return true;
	}

	private static Student[] createStudent(Student[] students) {
		// TODO Auto-generated method stub
		// input id

		for (int i = 0; i < students.length; i++) {
			System.out.print("Enter the id:  ");
			int id = sc.nextInt();

			// input name
			System.out.print("Enter name:  ");
			String name = sc.next();

			// input class,
			System.out.print("Enter Class:  ");
			byte standard = validateClass();// sc.nextByte();

			// input phonedetails,
			System.out.print("Enter Mobile no:  ");
			String mobNo = validateNumber();

			// input Total_Fees_per_Year,
			System.out.print("Total fees per Year:  ");
			float totalFeesPerYear = sc.nextFloat();

			// select Fees-Submitted
			boolean isfeesSubmitted = selectStatus();

			students[i] = new Student(id, name, standard, mobNo, totalFeesPerYear, isfeesSubmitted);
			
//			students[i].setId(id);
//			students[i].setName(name);
//			students[i].setMobNo(mobNo);
//			students[i].setStandard(standard);
//			students[i].setTotalFeesPerYear(totalFeesPerYear);
//			students[i].setIsfeesSubmitted(isfeesSubmitted);
		}

		return students;
	}

	private static byte validateClass() {
		// TODO Auto-generated method stub
		byte n = sc.nextByte();

		if (n > 0 && n < 12) {
			return n;
		} else
			System.out.println("Please enter class between 1-12");

		return validateClass();
	}

	private static String validateNumber() {
		// TODO Auto-generated method stub
		String num = sc.next();

		if (num.length() == 10) {
			return num;
		} else
			System.out.println("Please enter valid phone number");

		return validateNumber();
	}

	private static boolean selectStatus() {
		// TODO Auto-generated method stub
		System.out.println("Fees Submitted: 1.Yes 2.No");
		byte n = sc.nextByte();
		if (n == 1)
			return true;
		else if (n == 2)
			return false;
		else
			selectStatus();
		return false;
	}

	private static int showMenu() {
		// TODO Auto-generated method stub

		System.out.println("1. Show all Student");
		System.out.println("2. Sort student by the Name");
		System.out.println("3. Show the student with pending fees");
		System.out.println("4. Update the fees status");
		System.out.println("5. Show Studentsof perticular class");
		System.out.println("6. Exit");

		int n = sc.nextInt();
		return n;
	}

}
