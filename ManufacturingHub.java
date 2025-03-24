   import java.util.*;
   class ManufacturingHub
     {
	   public static void main(String x[])
	     {
		   Scanner sc=new Scanner(System.in);
		   ProductionHouse p=new ProductionHouse();
		   
		  while(true)
		   {
		     System.out.println("\n 1.Allocate Machinery ");
			 System.out.println(" 2.Products to Machinery ");
			 System.out.println(" 3. count total products produced ");
			 System.out.println(" 4. count products by Specific Machine ");
			 System.out.println(" 5. view all products in Production House ");
             System.out.println(" 6. view products by Specific machine ");
			 System.out.println(" 7. Exit ");
			 System.out.println(" Enter your choice: ");
			 
			 int choice=sc.nextInt();
			 switch(choice)
			  {
			    case 1:
				   System.out.print("Enter number of machinery to allocate: ");
				   int n=sc.nextInt();
				   Machinery[] m1=new Machinery[n];
				    for(int i=0;i<n;i++)
					{
					  Machinery m2=new Machinery();
					  System.out.print("Enter Machinery ID: ");
					  m2.setId(sc.nextInt());
					  System.out.print("Enter Machinery Name: ");
					  m2.setName(sc.next());
					   System.out.print("Enter Company Name: ");
					  m2.setComp(sc.next());
					  sc.nextLine();
					   System.out.print("Enter Capacity: ");
					  m2.setCapacity(sc.nextInt());
					  m1[i]=m2;
					}
					p.allocateMachine(m1);
					System.out.println("Machinery allcated successfully! ");
					m1.displayMachinery1();
			     break;
				 
				 case 2:
				     System.out.print("Enter Machinery Id to allocate products: ");
					 int Mid=sc.nextInt();
					 System.out.print("Enter number of products count: ");
					 int pcount=sc.nextInt();
					 Product[] products=new Product[pcount];
					 for(int i=0;i<pcount;i++)
					 {
						 Product p1=new Product();
						 System.out.print("Enter the product Id: ");
						 p1.setId(sc.nextInt());
						 System.out.print("Enter the product Name:");
						  p1.setName(sc.nextLine());
						  sc.nextLine();
						 System.out.print("Enter the product Rate:");
						  p1.setRate(sc.nextDouble());
						 System.out.print("Enter the product Quantity:");
						 p1.setQty(sc.nextInt());
						 System.out.print("Enter the product count:");
						 p1.setCount(sc.nextInt());
						 products[i]=p1;
					 }
					   Machinery[] machines=p.getMachinery();
					 for(int i=0;i<machines.length;i++)
					 {
						 if(machines[i]!=null && machines[i].getId()==Mid)
						 {
							 machines[i].setProducts(products);
							 break;
						 }
					 }
					 break;
					 
				case 3:
				  int totalProducts=0;
				  Machinery[] machines2=p.getMachinery();
				  for(int i=0;i<machines2.length;i++)
				  {
					  if(machines2[i] !=null)
					  {
						  totalProducts=totalProducts+machines2[i].gettotalProductcount();
						  
					  }
            					 
                }
			  System.out.println("Total Products Produced: " +totalProducts);
			  break;
			  
			  
			  case 4:
			  System.out.println("Enter Machinery Id: ");
               int searchId=sc.nextInt();
			    Machinery[] machines1=p.getMachinery();
				  for(int i=0;i<machines1.length;i++)
				  {
					  if(machines1[i]!=null && machines1[i].getId()==searchId)
					  {
						  System.out.println("Product Produced by machine Id" + searchId + ":" +machines1[i].gettotalProductcount());
						  break;
					  }
				  }
				  break;
				  
				  
				  case 5:
				  System.out.println("All products in Production House: ");
				  p.displayProductionHouse();
				  break;
				  
				  
				  case 6:
				  System.out.println("Enter the Machinery Id: ");
				  int matchId=sc.nextInt();
				  Product[] prods=p.getProductByMachineryId(matchId);
				  if(prods !=null)
				  {
					  for(int i=0;i<prods.length;i++)
					  {
						  if(prods[i]!=null)
						  {
							  prods[i].displayProduct();
						  }
						  
					  }
				  }
				  else
				  {
					  System.out.println("No products found for this machinery.");
				  }
				 break;
				 
				 
				 case 7:
				  System.out.println("Exiting....");
				  break;
				  
				  
				  default:
				    System.out.println("Wrong Choice");
	         }
		   }
		 }
	 }
					  
				   
			 
			 
			 			 
			 
			 
	   