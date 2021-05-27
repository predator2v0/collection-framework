package comparableComparator;

public class Mobile implements Comparable<Mobile> {
	@Override
	public int compareTo(Mobile alMob) {
		// TODO Auto-generated method stub
		if(this.id > alMob.id) {
			return 1;
		} else if(this.id < alMob.id) {
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}

	private int id;
	private String model;
	private int ram;
	private float price;
	
	public Mobile(int id, String model, int ram, float price) {
		this.id = id;
		this.model = model;
		this.ram = ram;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
