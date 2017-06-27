package io.altar.model;

public class Product extends Entity {
//		private Integer id;
		private float discount;
		private float tax;
		private float saleprice;
//		private ProductRepository ProductRepository = new ProductRepository();
		
//		public Integer getId() {
//			return id;
//		}
//		public void setId(Integer id) {
//			this.id = id;
//		}
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
//			return "Id: "+ getId() + ", Discount: " + discount + ", IVA: " + tax  + ", PVP: " + saleprice + "\n";
			return "Id: "+ getId() + ", Discount: " + discount + ", IVA: " + tax  + ", PVP: " + saleprice;
		}
	}

