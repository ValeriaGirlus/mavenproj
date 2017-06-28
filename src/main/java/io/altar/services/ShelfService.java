package io.altar.services;

import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.model.Shelf;
import io.altar.repository.ShelfRepository;
 
@Named("shelfService")
@RequestScoped


public class ShelfService {
//	private ShelfRepository ShelfList = new ShelfRepository();
	private ShelfRepository ShelfList = ShelfRepository.getInstance();

	public Collection<Shelf> getShelves(){
		return ShelfList.getall();
	}
	public void addNewShelf(Shelf shelf){
		ShelfList.addToList(shelf);
	}

	public void consultShelf(){
			
	}
	
	public void editAShelf(Shelf shelf){
		ShelfList.editItem(shelf.getId(), shelf.getLocation(), shelf.getCapacity(), shelf.getPrice());
	}
	
	public void removeAShelf(Integer id){
		ShelfList.removeItem(id);
	}
	
	
	
}
