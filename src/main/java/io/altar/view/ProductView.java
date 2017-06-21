package io.altar.view;

import java.io.Serializable;
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
     
    private List<Product> products;
     
    @ManagedProperty("#{productService}")
    private ProductService productService;
 
    @PostConstruct
    public void init() {
        products = productService.createProducts();
    }
     
    public List<Product> getProducts() {
        return products;
    }
 
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
