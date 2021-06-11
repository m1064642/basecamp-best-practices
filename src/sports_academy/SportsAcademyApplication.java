/*
 * class contains following functionality 
 * 1. take input from user for n numbers of players
 * 2. create Player class array with size = n
 * 3. take input as id, name, age, label, matches played     //createPlayer();
 * 4. store it in array of object
 * 5. show all the details availble in the current system
 * 6. Search for Players by their Label and display all player details
 * 7. Sort all Player details by Age in descending order , if Age is same sort by Name and display player details
 * 8.Update number of matches played for an Particular player by Name
 * 
 * */

package sports_academy;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SportsAcademyApplication {
	static Scanner sc= new Scanner(System.in);
	static List<Player> players = new LinkedList<Player>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print("Enter the number of players in th academy: ");
//		
//		int size = sc.nextInt();
		
		
		
		while(true)
		{
			int choice = showMenu();
			
			switch(choice)
			{
			 case 1: display(players);     break;
			 case 2: createPlayer(players);   break;
			 case 3: searchPlayer(players);   break;
			 case 4: sortByAge(players); break;
			 case 5: updateMatches(players);    break;
			 case 6: System.exit(0);
			 default : System.out.println("Enter valid option...........");
			}
		}
		

	}

	private static int showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Show the available players");
		System.out.println("2. Register New player list");
		System.out.println("3. Search Player By label");
		System.out.println("4. Sort player by age");
		System.out.println("5. Update the Matches played for the player");
		System.out.println("6. Exit");
		int num = sc.nextInt();
		return num;
		
	}

	private static void createPlayer(List<Player> players) {
		// TODO Auto-generated method stub
		
		//id, name, age, label, matches played
	
			System.out.print("Enter ID: ");
			long id = sc.nextLong();
			sc.nextLine();
			
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter age: ");
			Byte age = sc.nextByte();
			
			
			String label= selectLabel();
			
			System.out.print("Enter the matches played");
			int matches = sc.nextInt();
			
			
			Player current = new Player(id,name, age, label, matches);
			
			players.add(current);
			
			System.out.println();

		
		System.out.println("Players added successfullyyy...........");
		System.out.println();
	}

	private static String selectLabel() {
		// TODO Auto-generated method stub
		System.out.print("Select label: 1.International 2.Domestic 3.Both ");
		int m = sc.nextInt();
		
		if(m == 1)
			return "International";
		else if(m == 2)
			return "Domestic";
		else if (m == 3)
			return "Both";
		
		return null;
	}

	private static void display(List<Player> players) {
		// TODO Auto-generated method stub
		for(Player i : players)
			i.display();
			
	}

	private static void searchPlayer(List<Player> players2) {
		// TODO Auto-generated method stub
		String m = selectLabel();
		
		for(Player i : players)
		{
			if(m.equals(i.getLabel()))
			{
				i.display();
			}
		}
		
	}

	private static void sortByAge(List<Player> players2) {
		// TODO Auto-generated method stub
		Collections.sort(players2, SportsAcademyApplication.playerAge);
		display(players2);
	}
	
	public static Comparator<Player> playerAge = new Comparator<Player>() {
		 
		 public int compare(Player m1, Player m2)
		 {
			 //get year of release 
			 int age1 = m1.getAge();
			 int age2 = m2.getAge();
			 
			 //get name of movie
			 String name1 = m1.getName();
			 String name2 = m2.getName();
			 
			 int n = age1-age2;
			 
			 //if year is same i.e. n==0, return same object i and j with sorted by name
			 if(n == 0)
			 {
				 return name1.compareTo(name2);
			 }
			 
			 //otherwise sort by year if year > || year < 0;
			 return n;
		 }
	 };

	private static void updateMatches(List<Player> players2) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of player: ");
		String nam = sc.next();
		
		System.out.println("Enter the new number of matches played: ");
		int val = sc.nextInt();
		
		for(Player i : players2)
		{
			if(nam.equals(i.getName()))
			{
				i.setMatches(val);
			}
		}
		
		
		display(players2);
	}

}
