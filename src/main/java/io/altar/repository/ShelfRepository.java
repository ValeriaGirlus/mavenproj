package io.altar.repository;

import io.altar.repository.EntityRepository;
import io.altar.repository.ShelfRepository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{
//	private static final ShelfRepository INSTANCE = new ShelfRepository();
//
//	private ShelfRepository() {}
//
//	public static ShelfRepository getInstance() {
//		return INSTANCE;
//	}
	
	@Transactional
	public List<Shelf> getDatabaseItem() {
		Query query = getDatabase().createQuery("FROM Shelf");
		List<Shelf> databaseItem = (List<Shelf>) query.getResultList();
		return databaseItem;
	}
	
	@Transactional
	public void removeDetabaseItem(Shelf shelf){
		Shelf removeShelf = getDatabase().find(Shelf.class, shelf.getId());
		getDatabase().remove(removeShelf);
	}
	
	@Transactional
	public void editDatabaseItem(int id, int location, int capacity, float price){
		Shelf editShelf = getDatabase().find(Shelf.class, id);
		editShelf.setLocation(location);
		editShelf.setCapacity(capacity);
		editShelf.setPrice(price);
	}
	
	
	
	
	
	

	
//	public void editItem(Integer id, int location, int capacity, float price){
//		
//		((Shelf) get(id)).setId(id);
//		((Shelf) get(id)).setLocation(location);
//		((Shelf) get(id)).setCapacity(capacity);
//		((Shelf) get(id)).setPrice(price);
//	}
//	
//	public void editlocation(Integer id, int location){
//		((Shelf) get(id)).setLocation(location);
//	}
//	
//	public void editcapacity(Integer id, int capacity){
//		((Shelf) get(id)).setCapacity(capacity);
//	}
//	
//	public void editprice(Integer id, float price){
//		((Shelf) get(id)).setPrice(price);
//	}
}
