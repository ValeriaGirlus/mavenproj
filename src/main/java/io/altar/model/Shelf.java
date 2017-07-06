package io.altar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Shelves")
public class Shelf extends EntityModel implements Serializable{

	@Column(name="Location")
	private int location;
	
	@Column(name="Capacity")
	private int capacity;
	
	@Column(name="Price")
	private float price;

	
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Shelf() {

	}
	
	@Override
	public String toString(){
//		return "Id: "+ getId() + ", Location: " + location + ", Capacity: " + capacity  + ", Price: " + price;
		return String.format("Shelf [Id = %d, Location = %d, Capacity = %d, Price = %f]", getId(), location, capacity, price);
	}
}
