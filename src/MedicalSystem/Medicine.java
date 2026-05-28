package MedicalSystem;

import java.time.LocalDate;

public class Medicine {
  private int id;
   private String  name ;
    private double price;
   private  int  quantity;
    private LocalDate expiryDate;
   public Medicine(int id, String name, double  price, int quantity, LocalDate expiryDate) {
	
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.expiryDate = expiryDate;
	 this .price = price;
   }
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int  getQuantity() {
	return quantity;
   }
   public void setQuantity( int quantity) {
	this.quantity = quantity;
   }
   public LocalDate getExpiryDate() {
	return expiryDate;
   }
   public void setExpiryDate(LocalDate expiryDate) {
	this.expiryDate = expiryDate;
   }
   public double getPrice() {
	   return price;
   }
   public void setPrice(double price) {
	   this.price=price;
	   
   }
   @Override
   public String toString() {
	return "Medicine [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", expiryDate="
			+ expiryDate + "]";
   }

   
   
   
   
   
 
}
