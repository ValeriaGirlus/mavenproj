package io.altar.services;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.model.Shelf;
import io.altar.repository.ProductRepository;
import io.altar.repository.ShelfRepository;
 
@Named("shelfService")
@RequestScoped


public class ShelfService {
	
	@Inject
	private ShelfRepository ShelfList;

	public ShelfRepository getShelfList() {
		return ShelfList;
	}

	public List<Shelf> showEntity(ShelfRepository ShelfList){
		List<Shelf> list = (List<Shelf>) ShelfList.getDatabase();
		return list;
	}
	
	public void editEntity(int id, int location, int capacity, float price){
		ShelfList.editDatabaseItem(id, location, capacity, price);
	}
	
	
	
	
	
	
	
	
////	private ShelfRepository ShelfList = new ShelfRepository();
//	private ShelfRepository ShelfList = ShelfRepository.getInstance();
//
//	public Collection<Shelf> getShelves(){
//		return ShelfList.getall();
//	}
//	public void addNewShelf(Shelf shelf){
//		ShelfList.addToList(shelf);
//	}
//
//	public void consultShelf(){
//			
//	}
//	
//	public void editAShelf(Shelf shelf){
//		ShelfList.editItem(shelf.getId(), shelf.getLocation(), shelf.getCapacity(), shelf.getPrice());
//	}
//	
//	public void removeAShelf(Integer id){
//		ShelfList.removeItem(id);
//	}
	
	
	
}
