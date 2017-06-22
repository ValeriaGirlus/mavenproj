package io.altar.repository;

import io.altar.repository.EntityRepository;
import io.altar.repository.ShelfRepository;
import io.altar.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{
	
	public ShelfRepository(){}
	
	public void editItem(Integer id, int location, int capacity, float price){
		
		((Shelf) get(id)).setId(id);
		((Shelf) get(id)).setLocation(location);
		((Shelf) get(id)).setCapacity(capacity);
		((Shelf) get(id)).setPrice(price);
	}
	
	public void editlocation(Integer id, int location){
		((Shelf) get(id)).setLocation(location);
	}
	
	public void editcapacity(Integer id, int capacity){
		((Shelf) get(id)).setCapacity(capacity);
	}
	
	public void editprice(Integer id, float price){
		((Shelf) get(id)).setPrice(price);
	}
}
