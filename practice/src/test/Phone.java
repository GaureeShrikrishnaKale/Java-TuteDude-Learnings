package test;

import java.util.Objects;

public class Phone implements Comparable<Phone> {
	
	String Brand;
	String ModelName;
	int price;
	
	public Phone(String Brand, String ModelName, int price) {
		this.Brand = Brand;
		this.ModelName = ModelName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return Brand + " " + ModelName + " " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Brand, ModelName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(Brand, other.Brand) && Objects.equals(ModelName, other.ModelName) && price == other.price;
	}

	@Override
	public int compareTo(Phone o) {
		// TODO Auto-generated method stub
		
		//we have 2 objects
		//one phone which has been passed in the parameters
		//the other object is our current object
		
		if(this.price > o.price) {
			return 1;
		} else if(this.price < o.price) {
			return -1;
		}
		return 0;
	}
	
	
}
