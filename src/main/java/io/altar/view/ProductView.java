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
   

	public List<Product> getProducts() {
//		return new ArrayList<Product>((Collection<Product>)productService.getProductList());
		return productService.showEntity(productService.getProductList());
	}
	
 //	public Collection<Product> getProducts() {
//		return productService.getProducts();
//    }
	
    private Product product = new Product();
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	} 
	
	//foi preciso criar esta varável pq não estava a conseguir do mesmo modo que addProduct
	private Integer removeId;
  
	public Integer getRemoveId() {
		return removeId;
	}

	public void setRemoveId(Integer removeId) {
		this.removeId = removeId;
	}

	public void addProduct(){
//    	productService.addNewProduct(product);
		productService.addItem(productService.getProductList(), product);
    }
	
//    public void consultProduct(){
//    	productService.consultAProduct(product);
//    }

	public void editProduct(){
//	    	productService.editAProduct(product);
//		productService.editItem(productService.getProductList(), product);
		
	}

    public void removeProduct(){
//    	productService.removeAProduct(removeId);
//    	productService.removeItem(productService.getProductList(), product);
    }
    
    
}
