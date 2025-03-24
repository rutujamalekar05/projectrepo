 class Machinery
   {
      private int id;
	  private String name;
	  private String comp;
	  private int capacity;
	  private Product[] products;
	  private int productcount;
	 
	 public Machinery()
	 {
	 }
	  public Machinery(int id, String name,String comp,int capacity)
	   {
	     this.id=id;
		 this.name=name;
		 this.comp=comp;
		 this.capacity=capacity;
		 this.products=new Product[capacity];
		 this.productcount=0;
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
	 public void setComp(String comp)
	  {
	    this.comp=comp;
	  }
	 public String getComp()
	  {
	    return comp;
	  }
	 public void setCapacity(int capacity)
	  {
	    this.capacity=capacity;
	  }
	 public int setCapacity()
	   {
	     return capacity;
	   }
	   public void displayMachinery1()
		  {
			  System.out.println("===========================================");
			  System.out.println("Machinery Id:"+ id);
			  System.out.println("Machinery Name:"+name);
			  System.out.println("Machinery Company:"+comp);
			  System.out.println("Machinery Capacity:"+capacity);
			  System.out.println("==========================");
			  
		  }
	   public void setProducts(Product[] p)
	    {
		   if(p.length>capacity)
		    {
			  System.out.println("cannot allocate products ! capacity exceeded. ");
			  return;
			}
			this.products=p;
			this.productcount=p.length;
		}
		public Product[] getProducts()
		 {
		   return products;
		 }
		public int gettotalProductcount()
		 {
		   return productcount;
		 }
		public Product getProductbyId(int id)
		  {
		    for (int i=0;i<productcount;i++)
			 {
			   if(products[i].getId()==id)
			   {
			     return products[i];
			    }
			 }
			return null;
		  }
		 
		  
		public void displayMachinery()
		  {
		    System.out.println("Machinery id: " + id + "Name: " +name +" Company:" +comp + "Capacity: " +capacity);
			System.out.println("Produced products: ");
			  for(int i=0;i<productcount;i++)
			    {
				  products[i].displayProduct();
				}
			}
	  }
	 