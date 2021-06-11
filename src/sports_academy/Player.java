
/**
 * @author Nikhil Mitkari
 * 
 * >    Id
    >    Name
    >    Age
    >    Label ( International / Domestic / Both )
    >    Matches played
 *
 */
package sports_academy;

public class Player {

	private long id;
	private String name;
	private Byte age;
	private String label;
	private int matches;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
		super();
	}


	public Player(long id, String name, Byte age, String label, int matches) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.label = label;
		this.matches = matches;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Byte getAge() {
		return age;
	}


	public void setAge(Byte age) {
		this.age = age;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	
	
	public void display() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Id : "+ getId());
		System.out.println("Name : "+ getName());
		System.out.println("Age : "+ getAge());
		System.out.println("Leble: "+ getLabel());
		System.out.println("MAtches Played: "+ getMatches());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
