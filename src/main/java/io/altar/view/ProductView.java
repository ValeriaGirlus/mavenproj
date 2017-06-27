package io.altar.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.services.ProductService;

 
@Named("ProductView")
@RequestScoped
public class ProductView implements Serializable {
	private static final long serialVersionUID = 1L;

    @Inject
    private ProductService productService;
   
//	public Collection<Product> getProducts() {
//		return productService.getProducts();
//    }
    
    public List<Product> getProducts() {
		return new ArrayList<Product>((Collection<Product>)productService.getProducts());
	}
  
    private Product product = new Product();
  

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
    
    public void addProduct(){
    	productService.addNewProduct(product);
    }
    
    public void removeProduct(){
    	productService.removeAProduct(product);
    
    }
    
}
