package io.altar.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import io.altar.model.Product;
import io.altar.repository.ProductRepository;
 
@ManagedBean(name = "productService")
@RequestScoped

public class ProductService {
	private ProductRepository ProductList = new ProductRepository();
	
	public void createProducts() {
		ProductList.addToList(new Product(2,2,3,4));
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}
}
