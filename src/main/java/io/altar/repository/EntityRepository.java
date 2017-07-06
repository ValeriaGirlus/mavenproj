package io.altar.repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import io.altar.model.EntityModel;



public abstract class EntityRepository<E extends EntityModel>{

	@PersistenceContext(unitName = "database")
	private EntityManager em;
	
	public EntityManager getDetabase(){
		return em;
	}
	
	@Resource
	private UserTransaction utx;
	
	
	@Transactional
	public void addToDatabase(E entity){
		em.persist(entity);
	}
	
	@Transactional
	public void updateDatabase(E entity){
		em.merge(entity);
	}
	
	@Transactional
	public void deleteFromDatabase(E entity){
		em.remove(entity);
	}
	
}	
	
	


	
//	private LinkedHashMap<Integer, E> entityList = new LinkedHashMap<>();
//		
//		private Integer id = 0;
//		public Integer getNextId(){
//			return ++id;
//		}
//		
//		public void addToList(E e){
//			e.setId(getNextId());
//			entityList.put(e.getId(),e);
////			for(E f: entityList.values()){
////				System.out.println(f.toString());
////			}
//		}
//		
//		public void removeItem(Integer id){
//			entityList.remove(id);
//		}
//		
//		public boolean isEmpty(){
//			return entityList.isEmpty();
//		}
//
//		public Set<Integer> keySet(){
//			return entityList.keySet();
//		}
//		
//		public Entity get(Integer id){
//			return entityList.get(id);
//		}	
//			
//		public boolean containsKey(int key){
//			return entityList.containsKey(key);
//		}
//
//		public Collection<E> getall(){
//			return entityList.values();
//		}
//		
//}

