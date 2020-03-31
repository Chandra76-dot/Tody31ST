public class Customer {
	private int customerid;
	private String customername;
	private String customeraddress;
	private long creditcardnumber;
	private long mobilenumber;
	private String productname;
	private double price;
	private int quantity;
  Customer(){}
	public Customer(int customerid, String customername, String customeraddress, long creditcardnumber,
			long mobilenumber, String productname, double price, int quantity) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.creditcardnumber = creditcardnumber;
		this.mobilenumber = mobilenumber;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}
	
