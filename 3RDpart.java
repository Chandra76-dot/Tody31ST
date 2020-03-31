//getters and setters for get and set the data for privte data members
	
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public long getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(long creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static void main(String args[])
	{
		Customer c = new Customer();
		Customer c1 = new Customer(666,"Chandra","Vijayawada",12345679,817997166,"Herbal",23.33,2);

	}

	@Override
	public String toString() { //Overriding a too-string method
		
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", creditcardnumber=" + creditcardnumber + ", mobilenumber=" + mobilenumber
				+ ", productname=" + productname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
}
