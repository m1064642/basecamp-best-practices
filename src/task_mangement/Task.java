package task_mangement;

public class Task {
	private int id;
	private String description;
	private String assignedTo;
	private String Status;
	
	public Task() {
		super();
	}
	public Task(int id, String description, String assignedTo, String status) {
		this.id = id;
		this.description = description;
		this.assignedTo = assignedTo;
		Status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public void display() {
		System.out.println("....................................");
		System.out.println("Id:          "+getId());
		System.out.println("Description: "+getDescription());
		System.out.println("Assigne To:  "+getAssignedTo());
		System.out.println("Status:      "+getStatus());
		System.out.println("....................................");
	}

}
