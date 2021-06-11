package parcel_company;

public class Truck {
	private short noOfParcel;
	private int truckId;
	private String[] parcel;
	private float weight;
	

	public Truck() {
		// TODO Auto-generated constructor stub
		super();
	}


	public Truck(short noOfParcel,int truckId,  String[] parcel, float weight) {
		
		this.noOfParcel = noOfParcel;
		this.truckId = truckId;
		this.parcel = parcel;
		this.weight = weight;
	}


	public short getNoOfParcel() {
		return noOfParcel;
	}


	public void setNoOfParcel(short noOfParcel) {
		this.noOfParcel = noOfParcel;
	}
	
	public int getTruckId() {
		return truckId;
	}
	
	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}


	public String[] getParcel() {
		return parcel;
	}


	public void setParcel(String[] parcel) {
		this.parcel = parcel;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public void display() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Truck ID : "+getTruckId());
		System.out.println("No of parcel:  "+getNoOfParcel());
		float truckWeight = 0;
		for(int i = 0; i< parcel.length; i++)
		{
			System.out.println("            "+"Parcel:  "+getParcel()+"    "+getWeight());
			truckWeight += getWeight();
		}
		
		System.out.println("Weight of truck:   " + truckWeight); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
