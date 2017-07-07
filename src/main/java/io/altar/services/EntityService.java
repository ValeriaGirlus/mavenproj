package io.altar.services;

import io.altar.model.EntityModel;
import io.altar.repository.EntityRepository;

public class EntityService <E extends EntityModel> {
	
	public void addItem(EntityRepository<E> entityList, E entity){
		entityList.addToDatabase(entity);
	}
	
	public void editItem(EntityRepository<E> entityList, E entity){
		entityList.updateDatabase(entity);
	}
	
	public void removeItem(EntityRepository<E> entityList, E entity){
		entityList.deleteFromDatabase(entity);
	}
}
