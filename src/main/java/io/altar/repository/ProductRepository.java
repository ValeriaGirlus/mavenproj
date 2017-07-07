package io.altar.repository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.model.Product;

public class ProductRepository extends EntityRepository<Product>{
//	private static final ProductRepository INSTANCE = new ProductRepository();
//
//	private ProductRepository() {}
//
//	public static ProductRepository getInstance() {
//		return INSTANCE;
//	}
	
	
	
	@Transactional
	public List<Product> getDatabaseItem() {
		Query query = getDatabase().createQuery("FROM Product");
		List<Product> databaseItem = (List<Product>) query.getResultList();
		return databaseItem;
	}
	
	@Transactional
	public void removeDetabaseItem(Product product){
		Product removeProduct = getDatabase().find(Product.class, product.getId());
		getDatabase().remove(removeProduct);
	}
	
	@Transactional
	public void editDatabaseItem(int id, float discount, float tax, float saleprice){
		Product editProduct = getDatabase().find(Product.class, id);
		editProduct.setDiscount(discount);
		editProduct.setTax(tax);
		editProduct.getSalePrice();
	}
	
	
	
//	@Transactional
//	public void addAll(Collection<Product> products) {
//		for (Product product : products) {
//			productDao.persist(product);
//		}
//	}	
	
	
//	public ProductRepository(){};
	
//	public void editItem(Integer id, float discount, float tax, float saleprice){
//		
//		((Product) get(id)).setId(id);
//		((Product) get(id)).setDiscount(discount);
//		((Product) get(id)).setTax(tax);
//		((Product) get(id)).setSalePrice(saleprice);
//	}
//	
//	public void editdiscount(Integer id, float discount){
//		((Product) get(id)).setDiscount(discount);
//	}
//	
//	public void edittax(Integer id, float tax){
//		((Product) get(id)).setTax(tax);
//	}
//	
//	public void editsaleprice(Integer id, float saleprice){
//		((Product) get(id)).setSalePrice(saleprice);
//	}
}
