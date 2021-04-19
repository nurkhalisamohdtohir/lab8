package exercise2;

import java.io.Serializable;

public class itemProduct implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Declaration of attributes
	private int itemProductId;
	private String name;
	private float price;
	private String result;
	
	public void setItemProductId(int itemProductId) {
		this.itemProductId = itemProductId;
	}
	
	public int getItemProductId() {
		return itemProductId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getResult() {
		return result;
	}
	

}
