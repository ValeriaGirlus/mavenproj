package io.altar.services;

import java.util.List;

//import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;


@Named("productService")
@RequestScoped


public class ProductService extends EntityService<Product>{
	@Inject
	private ProductRepository ProductList;

	public ProductRepository getProductList() {
		return ProductList;
	}

	public List<Product> showEntity(ProductRepository ProductList){
		List<Product> list = (List<Product>) ProductList.getDatabase();
		return list;
	}
	
	public void editEntity(int id, float discount, float tax, float saleprice){
		ProductList.editDatabaseItem(id, discount, tax, saleprice);
	}
	
	
	
	
	
////	private ProductRepository ProductList = new ProductRepository();
//	private ProductRepository ProductList = ProductRepository.getInstance();
//
//	public Collection<Product> getProducts(){
//		return ProductList.getall();
//	}
//
//	public void addNewProduct(Product product){
//		ProductList.addToList(product);
//	}
//	
////	public void consultProduct(Product product){
////		ProductList.get(product.getId());	
////	}
//	
//	public void editAProduct(Product product){
//		ProductList.editItem(product.getId(), product.getDiscount(), product.getTax(), product.getSalePrice());
//	}
//	
//	public void removeAProduct(Integer id){
//		ProductList.removeItem(id);
//	}
}
