package io.altar.view;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import io.altar.model.Shelf;
import io.altar.services.ShelfService;

 
@ManagedBean(name="dtShelfView")
@RequestScoped
public class ShelfView implements Serializable {
	private static final long serialVersionUID = 1L;

    @Inject
    private ShelfService shelfService;
 
    @PostConstruct
    public void init() {
        shelfService.createShelves();
    }
     
    public Collection<Shelf> getShelves() {
        return shelfService.getShelves();
    }
 
    public void setShelfService(ShelfService shelfService) {
        this.shelfService = shelfService;
    }
}
