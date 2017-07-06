package io.altar.repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.model.Entity;
import io.altar.model.EntityModel;


public abstract class EntityRepository<E extends EntityModel>{

	
	
	private LinkedHashMap<Integer, E> entityList = new LinkedHashMap<>();
		
		private Integer id = 0;
		public Integer getNextId(){
			return ++id;
		}
		
		public void addToList(E e){
			e.setId(getNextId());
			entityList.put(e.getId(),e);
//			for(E f: entityList.values()){
//				System.out.println(f.toString());
//			}
		}
		
		public void removeItem(Integer id){
			entityList.remove(id);
		}
		
		public boolean isEmpty(){
			return entityList.isEmpty();
		}

		public Set<Integer> keySet(){
			return entityList.keySet();
		}
		
		public Entity get(Integer id){
			return entityList.get(id);
		}	
			
		public boolean containsKey(int key){
			return entityList.containsKey(key);
		}

		public Collection<E> getall(){
			return entityList.values();
		}
		
}

