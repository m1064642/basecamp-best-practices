package task_mangement;

import java.util.Scanner;

public class TaskManagementApplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = true;
		
		System.out.print("Enter the no of tasks:   ");
		int noOfTask = sc.nextInt();
		
		Task[] tasks = new Task[noOfTask];
		
		tasks = createTask(tasks);
		do {
		int choice =showMenu();
		
		switch(choice)
		{
		case 1: showwAllTask(tasks); break;
		case 2: searchAndSort(tasks); break;
		case 3: updateStatusofTask(tasks); break;
		case 4: System.out.println("< Thank You >"); flag= false; break;
		default : System.out.println("Invalid Option");
		}
		}
		while(flag);		

	}

	private static void updateStatusofTask(Task[] tasks) {
		// TODO Auto-generated method stub
		System.out.println("Enter the id:  ");
		int updateId = sc.nextInt();
		
		boolean isFound = true, isUpdated = false;
		
		
		for(int i =0; i < tasks.length;i++)
		{
			if(tasks[i].getId() == updateId)
			{
				String newStatus = selectStatus();
				tasks[i].setStatus(newStatus);
				isUpdated = true;
				System.out.println("Updated Successfully.......");
				tasks[i].display();
				break;
			}
		}
		
		if(!isUpdated)
		{
			System.out.println("Id not found\n     please try again.....");
			updateStatusofTask(tasks);
		}
		
	}

	private static void searchAndSort(Task[] tasks) {
		// TODO Auto-generated method stub
		String selected = selectStatus();
		int size = 0;
		for(int p = 0; p < tasks.length;p++)
		{
			if(selected.equals(tasks[p].getStatus()))
			{
				size++;
			}
		}
		
		Task[] temp = new Task[size];
		
		for(int i =0,j=0; i <tasks.length;i++)
		{
			if(selected.equals(tasks[i].getStatus()))
			{
				temp[j++] = tasks[i];
			}
		}
		
		
		sortArray(temp);
	}

	private static void sortArray(Task[] temp) {
		// TODO Auto-generated method stub
		Task m = new Task();
		
		for(int i = 0; i< temp.length;i++)
		{
			for(int j =i+1; j<temp.length;j++)
			{
				if(temp[i].getAssignedTo().compareTo(temp[j].getAssignedTo()) > 0)
				{
					m = temp[i];
					temp[i] = temp[j];
					temp[j] = m;
				}
			}
		}
		
		showwAllTask(temp);
	}

	private static void showwAllTask(Task[] tasks) {
		// TODO Auto-generated method stub
		
		for(int i =0; i < tasks.length;i++)
		{
			tasks[i].display();
		}
		
	}

	private static int showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Show All");
		System.out.println("2. Search task and Sort ");
		System.out.println("3. update the status of task");
		System.out.println("4. Exit");
		
		int n = sc.nextInt();
		return n;
	}

	private static Task[] createTask(Task[] tasks) {
		// TODO Auto-generated method stub
		for(int i =0; i < tasks.length; i++) {
		System.out.println("Enter id:   ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the description:   ");
		String des = sc.nextLine();
		
		
		System.out.println("Asigned to:  ");
		//sc.nextLine();
		String assign = sc.next();
		
		
		String status = selectStatus();
		
		tasks[i] = new Task(id, des, assign, status);

		}
		
		System.out.println("---------------Successfully added");
		return tasks;
		
	}

	private static String selectStatus() {
		// TODO Auto-generated method stub
		System.out.println("Select the Status: 1.open 2.inprogress 3.complted");
		int n = sc.nextInt();
		
		switch(n) {
		case 1: return "open";
		case 2: return "inprogress";
		case 3: return "completed";
		default : 
			System.out.println("Invalid option");
			selectStatus();
		}
		
		return "NA";
	}

}
