package medical_store;

public class Medicine {
	//Name, quantity, price_per_medicine
	private String medName;
	private int medQua;
	private float price;

	public Medicine() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Medicine(String medName, int medQua, float price) {
		
		this.medName = medName;
		this.medQua = medQua;
		this.price = price;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public int getMedQua() {
		return medQua;
	}

	public void setMedQua(int medQua) {
		this.medQua = medQua;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
