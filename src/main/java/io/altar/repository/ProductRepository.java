package io.altar.repository;

import io.altar.repository.EntityRepository;
import io.altar.repository.ProductRepository;
import io.altar.model.Product;

public class ProductRepository extends EntityRepository<Product>{
	
	//private static final ProductRepository INSTANCE = new ProductRepository();
	
	public ProductRepository(){}
	
//	public static ProductRepository getInstance(){
//		return INSTANCE;
//	}
	
	public void editdiscount(Integer id, float discount){
		((Product) get(id)).setDiscount(discount);
	}
	
	public void edittax(Integer id, float tax){
		((Product) get(id)).setTax(tax);
	}
	
	public void editsaleprice(Integer id, float saleprice){
		((Product) get(id)).setSalePrice(saleprice);
	}
}
