package io.altar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product extends EntityModel implements Serializable{

		@Column(name="Discount")
		private float discount;
		
		@Column(name="Tax")
		private float tax;
		
		@Column(name="Price")
		private float saleprice;

		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public float getTax() {
			return tax;
		}
		public void setTax(float tax) {
			this.tax = tax;
		}
		public float getSalePrice() {
			return saleprice;
		}
		public void setSalePrice(float saleprice) {
			this.saleprice = saleprice;
		}
	
		public Product() {
			//ProductRepository.addToList(this);
		}
		
	
		@Override
		public String toString(){
		// return "Id: "+ getId() + ", Discount: " + discount + ", IVA: " + tax  + ", PVP: " + salePrice;
			return String.format("Product [Id = %d, Discount = %f, Tax = %f, Price = %f]", getId(), discount, tax, saleprice);
		}
	}

