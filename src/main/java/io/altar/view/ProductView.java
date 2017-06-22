package io.altar.view;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.altar.model.Product;
import io.altar.services.ProductService;

 
@ManagedBean(name="dtProductView")
@ViewScoped
public class ProductView implements Serializable {
	private static final long serialVersionUID = 1L;

    @ManagedProperty("#{productService}")
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
