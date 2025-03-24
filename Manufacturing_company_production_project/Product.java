 class Product
  {
    private int id;
	private String name;
	private double rate;
	private int qty;
	private int count;
	
	public Product()
	{
	}
	
	public Product(int id,String name, double rate,int qty,int count)
	 {
	   this.id=id;
	   this.name=name;
	   this.rate=rate;
	   this.qty=qty;
	   this.count=count;
	 }
	 public void setId(int id)
	  {
	  this.id=id;
	  }
	  public int getId()
	  {
	     return id;
	  }
	  public void setName(String name)
	   {
	     this.name=name;
	   }
	  public String getName()
	   {
	     return name;
	   }
	   public void setRate(double rate)
	   {
	     this.rate=rate;
	   }
	   public double getRate()
	     {
		    return rate;
		 }
		public void setQty(int qty)
		 {
		   this.qty=qty;
		  }
		 public int getQty()
		   {
		     return qty;
		   }
		public void setCount(int count)
		  {
		     this.count=count;
		  }
		public int getCount()
		 {
		   return count;
		 }
		public void displayProduct()
		 {
		    System.out.println("Product Id: " +id + "Product Name: " +name + "Product Rate: " + rate +"Product Qty: " +qty +"Product Count: " +count);
		 }
	 }