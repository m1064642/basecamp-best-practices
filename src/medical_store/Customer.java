package medical_store;

public class Customer {
	 Medicine[] medicines;
	//Id, Name, Age
	private int id;
	private String name;
	private byte age;
	private byte noOfMed;
	private float totalBill;
	

	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Customer(int id, String name, byte age, byte noOfMed, float totalBill) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.noOfMed = noOfMed;
		this.totalBill = totalBill;
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

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getNoOfMed() {
		return noOfMed;
	}

	public void setNoOfMed(byte noOfMed) {
		this.noOfMed = noOfMed;
	}
	
	public float getTotalBill() {
		return totalBill;
	}
	
	public void setTotalBill(float totalBill) {
		this.totalBill = totalBill;
	}

	public Medicine[] getMedicines() {
		return medicines;
	}

	public void setMedicines(Medicine[] medicines) {
		this.medicines = medicines;
	}
}
