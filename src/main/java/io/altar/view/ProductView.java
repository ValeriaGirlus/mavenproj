package io.altar.view;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import io.altar.model.Product;
import io.altar.services.ProductService;

 
@ManagedBean(name="dtProductView")
@RequestScoped
public class ProductView implements Serializable {
	private static final long serialVersionUID = 1L;

    @Inject
    private ProductService productService;
 
    @PostConstruct
    public void init() {
        productService.createProducts();
    }
     
    public Collection<Product> getProducts() {
        return productService.getProducts();
    }
 
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
