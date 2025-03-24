 class ProductionHouse
   {
      private Machinery[] machines;
	  private int machinerycount;
	  
	  public ProductionHouse()
	  {
	     this.machines=new Machinery[10];
		 this.machinerycount=0;
	  }
	  
	  public void allocateMachine(Machinery[] m)
	  {
	     if(machinerycount+m.length> machines.length)
		  {
		    System.out.println("Cannot allocate more Machinery! Storage is full. ");
			return;
		  }
		  for(int i=0;i<m.length;i++)
		    {
			  machines[machinerycount++]=m[i];
			}
		}
	  public Machinery[] getMachinery()
	    {
		   return machines;
		}
	
	  public Product[] getProductByMachineryId(int id)
	   {
	      for(int i=0;i<machinerycount;i++)
		  {
	        if(machines[i].getId()==id)
			 {
			   return machines[i].getProducts();
			 }
		  }
		return null;
	  }
	 
	 public Machinery[] getallProductsbyallmachine()
	   {
	     return machines;
	   }
	   
	 public void displayProductionHouse()
	   {
	     for(int i=0;i<machinerycount;i++)
		  {
		  machines[i].displayMachinery();
		  }
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
	}