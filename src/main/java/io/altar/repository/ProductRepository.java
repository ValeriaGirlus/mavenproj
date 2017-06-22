package io.altar.repository;

import io.altar.repository.EntityRepository;
import io.altar.repository.ProductRepository;
import io.altar.model.Product;

public class ProductRepository extends EntityRepository<Product>{

	public ProductRepository(){};
	
	public void editItem(Integer id, float discount, float tax, float saleprice){
		
		((Product) get(id)).setId(id);
		((Product) get(id)).setDiscount(discount);
		((Product) get(id)).setTax(tax);
		((Product) get(id)).setSalePrice(saleprice);
	}
	
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
