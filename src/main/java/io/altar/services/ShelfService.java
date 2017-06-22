package io.altar.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import io.altar.model.Shelf;
import io.altar.repository.ShelfRepository;
 
@ManagedBean(name = "shelfService")
@RequestScoped

public class ShelfService {
	private ShelfRepository ShelfList = new ShelfRepository();
	
	public void createShelves() {
		ShelfList.addToList(new Shelf(1,5,10,15));
	}
	
	public Collection<Shelf> getShelves(){
		return ShelfList.getall();
	}
}
