package io.altar.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Shelf;
import io.altar.repository.ShelfRepository;
import io.altar.services.ShelfService;

 
@Named("ShelfView")
@RequestScoped
public class ShelfView implements Serializable {
	private static final long serialVersionUID = 1L;

    @Inject
    private ShelfService shelfService;
    
    public List<Shelf> getShelves() {
		return new ArrayList<Shelf>((Collection<Shelf>)shelfService.getShelfList());
	}
    
    private Shelf shelf = new Shelf();
  

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

//	public Collection<shelf> getShelves() {
//        return shelfService.getShelves();
//    }
    
	private Integer removeId;
	  
	public Integer getRemoveId() {
		return removeId;
	}

	public void setRemoveId(Integer removeId) {
		this.removeId = removeId;
	}
    public void addShelf(){
//    	shelfService.addNewShelf(shelf);
   
    }
    
	public void editShelf(){
//    	shelfService.editAShelf(shelf);
	
}
    
    public void removeShelf(){
//    	shelfService.removeAShelf(removeId);
    
    }
}