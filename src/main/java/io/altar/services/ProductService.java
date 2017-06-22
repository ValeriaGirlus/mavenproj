package io.altar.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import io.altar.model.Product;
import io.altar.repository.ProductRepository;
 
@ManagedBean(name = "productService")
@ApplicationScoped

public class ProductService {
	private ProductRepository ProductList = new ProductRepository();
	
	public void createProducts() {
		ProductList.addToList(new Product(1,2,3,4));
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}
}
