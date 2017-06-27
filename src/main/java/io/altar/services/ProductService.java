package io.altar.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;


@Named("productService")
@RequestScoped


public class ProductService {
//	private ProductRepository ProductList = new ProductRepository();
	private ProductRepository ProductList = ProductRepository.getInstance();

	public void addNewProduct(Product product){
		ProductList.addToList(product);
	}

	public void editProduct(){
		
	}
	
	public void consultProduct(){
			
	}
	
	public void removeAProduct(){
		ProductList.removeItem(ProductList.);
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}
	
}
