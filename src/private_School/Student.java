package private_School;

public class Student {

	// Id -> long, Name ->String, class -> Byte , phonedetails -> int,
	// Total_Fees_per_Year ->float, Fees-Submitted -> boolean
	private int id;
	private String name;
	private byte standard;
	private String mobNo;
	private float totalFeesPerYear;
	private boolean isfeesSubmitted;

	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Student(int id, String name, byte standard, String mobNo, float totalFeesPerYear, boolean isfeesSubmitted) {

		this.id = id;
		this.name = name;
		this.standard = standard;
		this.mobNo = mobNo;
		this.totalFeesPerYear = totalFeesPerYear;
		this.isfeesSubmitted = isfeesSubmitted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStandard() {
		return standard;
	}

	public void setStandard(byte standard) {
		this.standard = standard;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		mobNo = "+91-" + mobNo;
		this.mobNo = mobNo;
	}

	public float getTotalFeesPerYear() {
		return totalFeesPerYear;
	}

	public void setTotalFeesPerYear(float totalFeesPerYear) {
		this.totalFeesPerYear = totalFeesPerYear;
	}

	public boolean isIsfeesSubmitted() {
		return isfeesSubmitted;
	}

	public void setIsfeesSubmitted(boolean isfeesSubmitted) {
		this.isfeesSubmitted = isfeesSubmitted;
	}

	public void display() {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("Student ID:  " + getId());
		System.out.println("Student Name:  " + getName());
		System.out.println("Student Class:  " + getStandard());
		System.out.println("Student Mobile No :  " + getMobNo());
		System.out.println("Total fees Per Year:  " + getTotalFeesPerYear());
		if (isfeesSubmitted)
			System.out.println("Fees Status: Paid");
		else
			System.out.println("Fees Status: UnPaid");
		System.out.println("+++++++++++++++++++++++++++++");
	}

}
