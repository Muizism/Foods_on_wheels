import java.util.ArrayList;
import java.util.Calendar;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		File file = new File("Customer_Data_Base.txt");
		File file1 = new File("Resturant_Data_Base.txt");
		File file2 = new File("Rider_Data_Base.txt");
		File file3 = new File("Admin_Data_Base.txt");
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Customer cust = new Customer();
		Customer cust1[] = new Customer[100];
		Resturant rest = new Resturant();
		Rider rid = new Rider();
		Admin ad = new Admin();
		Calendar calendar = Calendar.getInstance();
		
		int priceless = 0;
		
	rest.KFC();
	rest.McDonalds();
	rest.optp();


		
		ArrayList<Cart> cart=new ArrayList<>();
		
		
	
		
		int opt1,opt=0;
		
		String item_name= null;
		int quantity=0;
		int n=0;
		for(int i=0; i>=0; i++)
		{
		
			
			Driver.checking_menu();
			System.out.print("=> ");
			 opt = input.nextInt();
				
			
			switch(opt)
			{
			case 1:
			{
				for (int z=0; z>=0; z++)
				{
					Driver.customer_menu();
					System.out.print("=>");
					 opt1 = input.nextInt();
					
					if(opt1==1)
					{
						
						System.out.println("1) KFC");
						System.out.println("2) McDonalds");
						System.out.println("3) OPTP");
						System.out.println("4) "+rest.vresturant);
						System.out.print("=>");
						int option = input.nextInt();
						if(option ==1)
						{
							System.out.println(rest.kfc);
							
						}
						else if(option == 2)
						{
							System.out.println(rest.mcdonalds);
							
						}
						else if(option == 3)
						{
							System.out.println(rest.optp);
							
						}
						else if(option == 4)
						{
							if(rest.request==true)
							{
								System.out.println("Resturant Name: "+rest.vresturant);
								rest.printvendors();
							}
							else {
								System.out.println("Sorry, Admin did not allow this resturant yet");
							}
						}
						
					}
					else if (opt1==2)
					{
						
				
						System.out.print("Enter user_name: ");
						String name=null;
						name = input1.nextLine();
						cust.setName(name);
						System.out.print("Enter your adress: ");
						cust.adress = input1.nextLine();
						System.out.print("Enter your email: ");
						cust.email = input1.nextLine();
						System.out.print("Enter your Phone_No: ");
						cust.phone_no = input1.nextLine();
						System.out.print("Enter your Password: ");
						String password = null; 
						 password = input1.nextLine();
						 cust.setPassword(password);
						 
						
						System.out.println("Your Account has been Successfully Created!");
						cust.customers++;
						
						try {
						      FileWriter myWriter = new FileWriter(file,true);
						      myWriter.write("\n.........Customer Details.......");
						      myWriter.write("\nName: "+cust.getName());
						      myWriter.write("\nAdress: "+cust.adress);
						      myWriter.write("\nEmail: "+cust.email);
						      myWriter.write("\nPhone No: "+cust.phone_no);
						      myWriter.write("\nPassword: "+cust.getPassword());
						      myWriter.write("\n.....Customer Order....");
						      myWriter.close();
						     
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						    }
						
						 
					}
					else if (opt1==3)
					{
						System.out.println("\n");
						System.out.print("Enter user_name: ");
						String user = input1.nextLine();
						System.out.print("Enter your password: ");
						String pass = input1.nextLine();
						if(user.equals(cust.getName()) && pass.equals(cust.getPassword()))
						{
							System.out.println("You have logged in successfully!");
							for (int i1=0; i1>=0; i1++)
							{
								Driver.login();
								System.out.print("=>");
								int choose = input.nextInt();
								if(choose == 1)
								{
									for (int j=0;j>=0; j++)
									{
										
										
										System.out.println("1) KFC");
										System.out.println("2) McDonalds");
										System.out.println("3) OPTP");
										System.out.println("4) "+rest.vresturant);
										System.out.println("   Press 0 to go back.. ");
										System.out.print("=>");
										int option1 = input.nextInt();
										if(option1 ==1)
										{
											System.out.println(rest.kfc);
											System.out.println("Press 1-4 to add items");
											
											
											
										}
										else if(option1 == 2)
										{
											System.out.println(rest.mcdonalds);
											System.out.println("Press 5-8 to add items");
										
											
										}
										else if(option1 == 3)
										{
											System.out.println(rest.optp);
											System.out.println("Press 9-15 to add items");
											
										}
										else if(option1 == 4)
										{
											System.out.println(rest.vendor);
											System.out.println("Press >15 to add items");
											System.out.println("Enter the price: ");
											priceless = input.nextInt();
											
										}
										
										else if(option1==0)
										{
											
											break;
										}
										
										
										
										
										System.out.print("=>");
										int choose1= input.nextInt();
										
										if(choose1==0)
										{
											break;
										}
										System.out.print("Enter the item_name: ");
										item_name=input1.nextLine();
										System.out.print("Enter the quantity: ");
										quantity=input.nextInt();
										
										
										
										cust.prices(opt1, quantity, priceless);
										rest.kfc_resturant_prices(opt1, quantity);
										rest.mcdonlads_resturant_prices(opt1, quantity);
										rest.optp_resturant_prices(opt1, quantity);	
										rest.newprices(opt1, quantity, priceless);
										cart.add(new Cart(item_name, quantity));
										calendar.getTime();
										
										n++;
										
									}
									
								}
								if (choose ==2)
								{
									String output=null;
									System.out.println("Are you sure to place this order?");
									System.out.println(" \nItems | Quantity");
									for(int i2=0 ; i2<n ; i2++){
										
										output=cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity();
										System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
										try {
										      FileWriter myWriter = new FileWriter(file,true);
										    
										      myWriter.write("\n"+i2+1+")Food Item: "+output);
										      myWriter.close();
										      
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
											
		    	                    }
									
									System.out.print("(y/n)=>");
									String opt3=input1.nextLine();
									if(opt3.equals("y"))
									{
										System.out.println("Your order has been placed.");
									}
									else
									{
										System.out.println("Didn't you like our food  :/");
									}
									
								}
								 if(choose==3)
								 {
									 System.out.println("Your order has been cancelled.");
									 cust.total_price=0;
									 for(int i2=0 ; i2<n ; i2++){
											
											cart.removeAll(cart);
											
			    	                    }
									
								 }
								 if (choose==4)
								
								 {
									 
									
									     System.out.println("1) Remove item");
									     System.out.println("2) Add item");
									   
									     System.out.print("=>");
									     int op_t=input.nextInt();
									     
										 int index = 0;
										 int newquantity;
										 if (op_t==1)
										 {
											 n--;
											 System.out.println("Cart: ");
											 for(int i2=0 ; i2<n ; i2++){
													
													System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
											 }
											 System.out.println("Enter that item index: ");
											 index = input.nextInt();
											 cart.remove(index);
											 for(int i2=0 ; i2<n ; i2++){
													
													System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
														
					    	                    }
											
											 }
										 if(op_t == 2)
										 {
											 System.out.println("Cart: ");
											 for(int i2=0 ; i2<n ; i2++){
													
													System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
											 }
											 System.out.println("You want to add something?(y/n)");
											 String sc_1 = input1.nextLine();
											 if(sc_1.equals("y"))
											 {
												 System.out.println("Enter the item: ");
												String Item_Name = input1.nextLine();
												 
												 System.out.println("Enter the quantity:");
												 int Quantity = input.nextInt();
											
												 cart.add(new Cart(Item_Name, Quantity));
												 n++;
												 for(int i2=0 ; i2<n ; i2++){
														
														System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
														
															
						    	                    }
												 
												 System.out.println("Bill updated Successfully");
											 }
											 }
											 
											 
										 
									 
									 
									 
								 }	 
									 
									 
						
								 if (choose==5)
								 {
									 System.out.println("\nTotal bill: "+ cust.total_price);
									 System.out.println("You want to checkout?");
									 System.out.print("(y/n)=>");
									 String choice5= input1.nextLine();
									 if(choice5.equals("y"))
									 {
										 System.out.println("\nBe ready your food will be there after sometime");
									 }
									 try {
									      FileWriter myWriter = new FileWriter(file,true);
									      myWriter.write("\n.......Total Bill.....");
									      myWriter.write("\nRs. "+cust.total_price);
									      myWriter.close();
									
									    } catch (IOException e) {
									      System.out.println("An error occurred.");
									      e.printStackTrace();
									    }
									 
								 }
								 if(choose==6)
								 {
									 cust.delivery=true;
									 System.out.println("You have been selected to pay cash on delivery.");
									 System.out.println("Just ready your cash Rs."+ cust.total_price);
									 System.out.println("Any Additional note:");
									 cust.note=input1.nextLine();
									 try {
									      FileWriter myWriter = new FileWriter(file,true);
									      myWriter.write("\n.......Delivery Status.....");
									      myWriter.write("\nCash on Delivery");
									      myWriter.close();
									
									    } catch (IOException e) {
									      System.out.println("An error occurred.");
									      e.printStackTrace();
									    }
									 
								 }
								 if (choose==7)
								 {
									 if (rid.delivery_status==true)
									 {
										 System.out.println("Your order has been confirmed");
										 System.out.println("Your Rider is: Mr."+rid.getName());
										 calendar.add(Calendar.MINUTE, 15);
										 System.out.println("~"+calendar.getTime());
									 }
									 else {
										 System.out.println("Sorry, Your order has failed to comfirm yet");
									 }
									 if(rid.cash==true)
									 {
										 System.out.println("Cash Received");
									 }
									 else {
										 System.out.println("Sorry, Cash not received yet");
									 }
								 }
								 if(choose==0)
								 {
									 System.out.println("Going Back..");
									 break;
								 }
								
							}
							}
							
						
						else {
							System.out.println("Try again!");
						}
						
					}
					else if(opt1==0)
					{
						System.out.println("Going Back..");
						break;
						
					}
					
				}
				}
				
			
			
			case 2:
			{
				if(opt!=2)
					break;
				for(int y=0; y>=0; y++)
				{
					Driver.resturant_menu();
					System.out.print("=>");
					int opt5= input.nextInt();
					
					if (opt5 ==1)
					{
						System.out.print("Enter user_name: ");
						String name=null;
						name = input1.nextLine();
						rest.setName(name);
						System.out.print("Enter your adress: ");
						rest.adress = input1.nextLine();
						System.out.print("Enter your email: ");
						rest.email = input1.nextLine();
						System.out.print("Enter your Phone_No: ");
						rest.phone_no = input1.nextLine();
						System.out.print("Enter your Password: ");
						String passcode = null;
						 passcode = input1.nextLine();
						 rest.setPassword(passcode);
						
						
						System.out.println("Your Account has been Successfully Created!");
						try {
						      FileWriter myWriter = new FileWriter(file1,true);
						      myWriter.write("\n.........Resturant Details.......");
						      myWriter.write("\nName: "+rest.getName());
						      myWriter.write("\nAdress: "+rest.adress);
						      myWriter.write("\nEmail: "+rest.email);
						      myWriter.write("\nPhone No: "+rest.phone_no);
						      myWriter.write("\nPassword: "+rest.getPassword());
						      myWriter.close();
						     
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						    }
						
						
					}
					else if(opt5 ==2)
					{
						System.out.println("\n");
						System.out.print("Enter user_name: ");
						String user = input1.nextLine();
						System.out.print("Enter your password: ");
						String pass = input1.nextLine();
						if(user.equals(rest.getName()) && pass.equals(rest.getPassword()))
						{
							System.out.println("You have logged in successfully!");
							for (int loop=0; loop>=0; loop++)
							{
								Driver.customer_login();
								System.out.print("=>");
								
								int option99 = input.nextInt();
							
								if(option99==1)
								{
									System.out.println("1) Kfc");
									System.out.println("2) Mcdonalds");
									System.out.println("3) Optp");
									System.out.println("4) "+rest.vresturant);
									System.out.print("=>");
									int option2 = input.nextInt();
									if(option2==1)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();
										System.out.println("Enter its price: ");
										int newprice = input.nextInt();
										
										rest.add_food_kfc(newitems, newprice);
										try {
										      FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....KFC.....");
										      myWriter.write("\nNew Added item: "+newitems+"  Rs."+newprice);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option2==2)
									{
										System.out.println("Enter Item name: ");
										String newitems1 = input1.nextLine();
										System.out.println("Enter its price: ");
										int newprice1 = input.nextInt();
										
										rest.add_food_mcdonalds(newitems1, newprice1);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....McDonalds.....");
										      myWriter.write("\nNew Added item: "+newitems1+"  Rs."+newprice1);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option2==3)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();
										System.out.println("Enter its price: ");
										int newprice = input.nextInt();
										
										rest.add_food_optp(newitems, newprice);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....OPTP.....");
										      myWriter.write("\nNew Added item: "+newitems+"  Rs."+newprice);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option2==4)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();
										System.out.println("Enter its price: ");
										int newprice = input.nextInt();
										
										rest.add_vendors(newitems, newprice);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....VENDOR.....");
										      myWriter.write("\nNew Added item: "+newitems+"  Rs."+newprice);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									
									
								}
							
								else if(option99==2)
								{
									System.out.println("1) Kfc");
									System.out.println("2) Mcdonalds");
									System.out.println("3) Optp");
									System.out.println("4) "+ rest.vresturant);
									System.out.print("=>");
									int option_2 = input.nextInt();
									if(option_2==1)
									{
										cust.KFC();
										System.out.println("Enter the name of item: ");
										String index = input1.nextLine();
										rest.remove_kfc(index);

										System.out.print("Enter the Food You want to replace: ");
										String del_food = input1.nextLine();
										System.out.print("Enter its price: ");
										int price = input.nextInt();
										
										rest.replace_food_kfc(del_food, price);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....KFC.....");
										      myWriter.write("\nNew Replaced item: "+del_food+"  Rs."+price);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
										
									}
									else if(option_2==2)
									{
										cust.McDonalds();
										System.out.println("Enter the name of item: ");
										String item = input1.nextLine();
										cust.remove_mcdonalds(item);
										System.out.print("Enter the Food You want to replace: ");
										String del_food1 = input1.nextLine();
										System.out.print("Enter its price: ");
										int price = input.nextInt();
										rest.replace_food_mcdonalds(del_food1, price);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....MCDONALDS.....");
										      myWriter.write("\nNew Replaced item: "+del_food1+"  Rs."+price);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
									}
									else if(option_2==3)
									{
										cust.optp();
										System.out.println("Enter the name of item: ");
										String item = input1.nextLine();
										cust.remove_optp(item);
										System.out.print("Enter the Food You want to replace: ");
										String del_food2 = input1.nextLine();
										System.out.print("Enter its price: ");
										int price = input1.nextInt();
										rest.replace_food_optp(del_food2, price);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....OPTP.....");
										      myWriter.write("\nNew Replaced item: "+del_food2+"  Rs."+price);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option_2==4)
									{
										cust.printvendors();
										System.out.println("Enter the name of item: ");
										String item = input1.nextLine();
										cust.remove_vendor(item);
										System.out.print("Enter the Food You want to replace: ");
										String del_food2 = input1.nextLine();
										System.out.print("Enter its price: ");
										int price = input1.nextInt();
										rest.replace_food_vendor(del_food2, price);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....VENDOR.....");
										      myWriter.write("\nNew Replaced item: "+del_food2+"  Rs."+price);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
								}
								else if(option99==3)
								{
									
									System.out.println("1) Kfc");
									System.out.println("2) Mcdonalds");
									System.out.println("3) Optp");
									System.out.println("4) "+ rest.vresturant);
									System.out.print("=>");
									int option2 = input.nextInt();
									if(option2==1)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();

										rest.remove_kfc(newitems);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....KFC.....");
										      myWriter.write("\nDeleted item: "+newitems);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									else if(option2==2)
									{
										System.out.println("Enter Item name: ");
										String newitems1 = input1.nextLine();
										
										
										rest.remove_mcdonalds(newitems1);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....MCDONALDS.....");
										      myWriter.write("\nDeleted item: "+newitems1);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									else if(option2==3)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();

										rest.remove_optp(newitems);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....OPTP.....");
										      myWriter.write("\nDeleted item: "+newitems);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									else if (option2 == 4)
									{
										System.out.println("Enter Item name: ");
										String newitems = input1.nextLine();

										rest.remove_vendor(newitems);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....VENDOR.....");
										      myWriter.write("\nDeleted item: "+newitems);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									
								}
								else if(option99==4)
								{
									System.out.println("This food has been ordered");
		                            for(int i2=0 ; i2<n ; i2++){
										
										System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
									}
								}
								else if(option99==5)
								{
									if(cust.delivery == true)
									{
										System.out.println(" \nItems | Quantity");
										for(int i2=0 ; i2<n ; i2++){
											
											System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
												
			    	                    }
										System.out.println("These food items have to deliver with Cash on Delivery");
									}
									else 
									{
										System.out.println("None of order has been selected on Cash on delivery");
									}
									System.out.println("Do you accept order?(y/n)");
									String accept = input1.nextLine();
									if(accept.equals("y"))
									{
										System.out.println("Order Accepted");
										System.out.println("Sending Deatils to rider");
										rest.rideron=true;
								}
								}
									else if(option99==6)
								{
									System.out.println("1) Kfc");
									System.out.println("2) Mcdonalds");
									System.out.println("3) Optp");
									System.out.println("4) "+ rest.vresturant);
									System.out.print("=>");
									int option_2 = input.nextInt();
									if(option_2==1)
									{
										System.out.print("Total Bill for KFC is : Rs.");
										System.out.println(rest.kfc_prices);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....KFC.....");
										      myWriter.write("\nTotal Bill: "+rest.kfc_prices);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									else if(option_2==2)
									{
										System.out.print("Total Bill for McDonalds is : Rs.");
										System.out.println(rest.mcdonalds_prices);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....MCDONALDS.....");
										      myWriter.write("\nTotal Bill: "+rest.mcdonalds_prices);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option_2==3)
									{
										System.out.print("Total Bill for OpTp is : Rs.");
										System.out.println(rest.optp_prices);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....OPTP.....");
										      myWriter.write("\nTotal Bill: "+rest.optp_prices);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else if(option_2==4)
									{
										System.out.print("Total Bill for"+rest.vresturant+" is : Rs.");
										System.out.println(rest.vprices);
										try {
											FileWriter myWriter = new FileWriter(file1,true);
										      myWriter.write("\n.....VENDOR.....");
										      myWriter.write("\nTotal Bill: "+rest.vprices);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									
								}
								
									else if(option99 == 0)
								{
									System.out.println("Going Back..");
									break;
								}
						
							}
					
						}
						else
						{
							System.out.println("Invalid Password or user name!!");
						}
					
				
					}
					else if(opt5==3)
					{
						System.out.print("Enter user_name: ");
						rest.vname = input1.nextLine();
						System.out.print("Enter your adress: ");
						rest.vadress = input1.nextLine();
						System.out.print("Enter your email: ");
						rest.vemail = input1.nextLine();
						System.out.print("Enter your Phone_No: ");
						rest.vphoneno = input1.nextLine();
						System.out.println("Enter your resturant name: ");
						rest.vresturant=input1.nextLine();
						
						System.out.println("Your request has been sent Successfully!");
						try {
						      FileWriter myWriter = new FileWriter(file1,true);
						      myWriter.write("\n.........Vendor Details.......");
						      myWriter.write("\nName: "+rest.vname);
						      myWriter.write("\nAdress: "+rest.vadress);
						      myWriter.write("\nEmail: "+rest.vemail);
						      myWriter.write("\nPhone No: "+rest.vphoneno);
						      myWriter.write("\nPassword: "+rest.vpassword);
						      myWriter.close();
						     
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						    }
						
						System.out.print("(y/n)=>");
						String opt3=input1.nextLine();
						if(opt3.equals("y"))
						{
							rest.addFood();
						}
						else
						{
							System.out.println("Going Back...");
						}
						
						
						
					}
					else if(opt5==0)
					{
						System.out.println("Going Back...");
						break;
					}
				}
				}
				
				
						
				
			
			case 3:
			{
				if(opt!=3)
					break;
				for(int k=0; k>=0; k++)
				{
					Driver.rider_menu();
					System.out.print("=>");
					int opt6= input.nextInt();
					
					if (opt6 ==1)
					{
						System.out.print("Enter user_name: ");
						String name = null;
						name= input1.nextLine();
						rid.setName(name);
						System.out.print("Enter your adress: ");
						rid.adress = input1.nextLine();
						System.out.print("Enter your email: ");
						rid.email = input1.nextLine();
						System.out.print("Enter your Phone_No: ");
						rid.phone_no = input1.nextLine();
						System.out.print("Enter your Password: ");
						String pass=null;
						 pass = input1.nextLine();
						 rid.setPassword(pass);
						 
						System.out.println("Your Account has been Successfully Created!");
						try {
						      FileWriter myWriter = new FileWriter(file2,true);
						      myWriter.write("\n.........Rider Details.......");
						      myWriter.write("\nName: "+rid.getName());
						      myWriter.write("\nAdress: "+rid.adress);
						      myWriter.write("\nEmail: "+rid.email);
						      myWriter.write("\nPhone No: "+rid.phone_no);
						      myWriter.write("\nPassword: "+rid.getPassword());
						      myWriter.close();
						     
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						    }
						
					}
					else if(opt6 ==2)
					{
						System.out.println("\n");
						System.out.print("Enter user_name: ");
						String user = input1.nextLine();
						System.out.print("Enter your password: ");
						String pass = input1.nextLine();
						if(user.equals(rid.getName()) && pass.equals(rid.getPassword()))
						{
							System.out.println("You have logged in successfully!");
							for(int k1=0; k1>=0; k1++)
							{
								Driver.rider_login();
								System.out.print("=>");
								int options = input.nextInt();
								if(options == 1)
								{
									System.out.println(" \nItems | Quantity");
									for(int i2=0 ; i2<n ; i2++){
										
										System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
											
		    	                    }
								}
								if(options == 2)
								{
									if(cust.delivery == true)
									{
										System.out.println(" \nItems | Quantity");
										for(int i2=0 ; i2<n ; i2++){
											
											System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
												
			    	                    }
										System.out.println("These food items have to deliver with Cash on Delivery");
									}
									else 
									{
										System.out.println("None of order has been selected on Cash on delivery");
									}
									System.out.println("Do you accept order?(y/n)");
									String accept = input1.nextLine();
									if(accept.equals("y"))
									{
										rid.delivery_status=true;
										System.out.println("Order Accepted");
										System.out.println("You have to deliver food on "+cust.adress);
										System.out.println("Total Bill you have to collected is Rs."+ cust.total_price);
										System.out.println("Extra Note: "+cust.note);
										System.out.println("~"+calendar.getTime());
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delivery Status.....");
										      myWriter.write("\n=> True");
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
									}
									else {
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delivery Status.....");
										      myWriter.write("\n=> False");
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										System.out.println("Successfully Rejected");
										
										
									}
								}
								else if(options == 3)
								{
									rid.delivery_status=true;
									System.out.println("Delivered? (y/n)");
									String sc = input1.nextLine();
									if(sc.equals("y"))
									{
										System.out.println("Good Work, Record Updated!");
									}
									else
									{
										System.out.println("Enter your Query: ");
										rid.Query=input1.nextLine();
										System.out.println("Your query has been recorded.");
										ad.block_rider=true;
										
									}
								}
								else if(options == 4)
								{
									System.out.println("Did you successfully collect the cash? (y/n)");
									String sc = input1.nextLine();
									if(sc.equals("y"))
									{
										rid.cash=true;
										System.out.println("Good Work, Record Updated!");
									}
									else
									{
										rid.cash=false;
										System.out.println("Enter your Query: ");
										rid.Query=input1.nextLine();
										System.out.println("Your query has been recorded.");
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Query.....");
										      myWriter.write("\n=> "+rid.Query);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
									}
								}
								if(options == 0)
								{
									System.out.println("Going back");
									break;
								}
						
							}
							
					}
					else
					{
						System.out.println("Invalid Password or user name!!");
					}
					
				
				}
					else if(opt6==0)
					{
						System.out.println("Going Back...");
						break;
					}
				}
				}
			
			case 4:
			{
				if(opt!=4)
					break;
				String user=null;
				String pass=null;
				for(int z=0; z>=0; z++)
				{
					
					Driver.admin_menu();
					System.out.print("=>");
					int opt_7= input.nextInt();
				
					if(opt_7 ==1)
					{
						System.out.println("\n");
						System.out.print("Enter user_name: ");
						user = input1.nextLine();
						System.out.print("Enter your password: ");
						 pass = input1.nextLine();
						if(user.equals(ad.getUser_name()) && pass.equals(ad.getPassword()))
						{
							System.out.println("You have logged in successfully!");
							for(int loop2=0; loop2>=0; loop2++)
							{
								Driver.admin_login();
								System.out.print("=>");
								int options = input.nextInt();
								
								if(options == 1)
								{
									System.out.println("The vendors are following: ");
									rest.print_vendors();
									rest.printvendors();
									 System.out.println("Do you accept their request?(y/n)");
									 String sc = input1.nextLine();
									 if(sc.equals("y"))
									 {
										 rest.request=true;
										 
										 try {
												FileWriter myWriter = new FileWriter(file2,true);
											      myWriter.write("\n.....Acceptance Status.....");
											      myWriter.write("\nResturant Name: "+rest.vresturant);
											      myWriter.write("\n=> Accepted");
											      myWriter.close();
											    } catch (IOException e) {
											      System.out.println("An error occurred.");
											      e.printStackTrace();
											    }
									 }
									 else {
										 try {
												FileWriter myWriter = new FileWriter(file2,true);
											      myWriter.write("\n.....Delivery Status.....");
											      myWriter.write("\nResturant Name: "+rest.vresturant);
											      myWriter.write("\n=> Rejected");
											      myWriter.close();
											    } catch (IOException e) {
											      System.out.println("An error occurred.");
											      e.printStackTrace();
											    }
										 System.out.println("Resturant Rejected");
									 }
									
								}
								else if (options == 2)
								{
									System.out.println("Here is the food details of vendors");
									rest.printvendors();
									System.out.println("1) Add food");
									System.out.println("3) Remove Food");
									System.out.print("=>");
									int foodchoice = input.nextInt();
									if(foodchoice==1)
									{
										ad.addFood();
									}
									else if(foodchoice == 2)
									{
										rest.printvendors();
										ad.removefood();
									}
								}
								else if (options == 3)
								{
									cust.print_customers();
										System.out.println("You want to block this user? (y/n)");
										String choice = input1.nextLine();
										if(choice.equals("y"))
										{
											cust.delete_customers();
										}
										else
										{
											System.out.println("He's a good user");
										}
									}
							
								
								else if (options == 4)
								{
									System.out.println("1) Kfc");
									System.out.println("2) Mcdonalds");
									System.out.println("3) Optp");
									System.out.println("4) "+ rest.vresturant);
									System.out.print("=>");
									int option_2 = input.nextInt();
									if(option_2==1)
									{
										System.out.print("Enter the Food You want to delete: ");
										String del_food = input1.nextLine();
										
										rest.remove_kfc(del_food);
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delete Food KFC.....");
										      myWriter.write("\nFood: "+del_food);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
										
										
									}
									else if(option_2==2)
									{
										System.out.print("Enter the Food You want to delete: ");
										String del_food1 = input1.nextLine();
										rest.remove_mcdonalds(del_food1);
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delete Food MCDONALDS.....");
										      myWriter.write("\nFood: "+del_food1);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
										
									}
									else if(option_2==3)
									{
										System.out.print("Enter the Food You want to delete: ");
										String del_food2 = input1.nextLine();
										rest.remove_optp(del_food2);
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delete Food optp.....");
										      myWriter.write("\nFood: "+del_food2);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									else if(option_2==4)
									{
										System.out.print("Enter the Food You want to delete: ");
										String del_food2 = input1.nextLine();
										rest.remove_vendor(del_food2);
										try {
											FileWriter myWriter = new FileWriter(file2,true);
										      myWriter.write("\n.....Delete Food vendor.....");
										      myWriter.write("\nFood: "+del_food2);
										      myWriter.close();
										    } catch (IOException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										
									}
									
									
								}
								else if (options == 5)
								{
									System.out.println("Customer Payment Details..");
									System.out.println("Customer Name: "+cust.getName());
									System.out.println("Order Details:");
									System.out.println(" \nItems | Quantity");
									for(int i2=0 ; i2<n ; i2++){
										
										System.out.println(cart.get(i2).getItem_Name()+"   "+cart.get(i2).getQuanity());
									}
									System.out.println("Total Payment: Rs."+cust.total_price);
									System.out.println("................................");
									System.out.println("Resturant Payment Detalis");	
									System.out.println("KFC : Rs."+ rest.kfc_prices);
									System.out.println("McDonalds : Rs."+rest.mcdonalds_prices);
									System.out.println("Optp: Rs."+rest.optp_prices);
									System.out.println(rest.vresturant+": Rs."+rest.vprices);
									
								
								}
								else if (options == 6)
								{
									rid.print_riders();
									if(ad.block_rider=true)
									{
										System.out.println("You want to block this rider? (y/n)");
										String choice = input1.nextLine();
										if(choice.equals("y"))
										{
											rid.delete_rider();
										}
										else
										{
											System.out.println("He's a good rider");
										}
									}
								}
								else if (options ==0)
								{
									System.out.println("Going Back..");
									break;
								}
								else {
									System.out.println("Invalid Input");
								}
					}
							}
							
					
					else
					{
						System.out.println("Invalid Password or user name!!");
						try {
							FileWriter myWriter = new FileWriter(file3,true);
						      myWriter.write("\n.....Login Attemts.....");
						      myWriter.write("\n This guy tried to login: ");
						      myWriter.write("\n User Name: "+user);
						      myWriter.write("\n Password: "+pass);
						      myWriter.close();
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
					}
		
					}
					else if(opt_7==1)
					{
						System.out.println("Going Back...");
						break;
					}
					break;
				}
				}
				
			case 5:
			{
				if(opt!=5)
					break;
				System.out.println("We are thankful for your visit :D");
				return;
				
			}
		
				
			
			default:{
				System.out.println("Invalid Choice");
			}
			
			}

			}
		}
			


public static void customer_menu()
{
	System.out.println("\n");
	System.out.println("1) View Food Details");
	System.out.println("2) Register/Create Account");
	System.out.println("3) Login");
	System.out.println("   Press 0 to go back");
	
}

public static void rider_menu()
{
	System.out.println("1) Create Account");
	System.out.println("2) Login");
	System.out.println("   Press 0 to go back");
	
}

public static void admin_menu()
{
	System.out.println("1) Login");
	System.out.println("   Press 0 to go back");
	
}

public static void resturant_menu()
{
	System.out.println("1) Create Account");
	System.out.println("2) Login");
	System.out.println("3) Be a Vendor");
	System.out.println("   Press 0 to go back");
	
}

public static void checking_menu()
{
	System.out.println("******************************");
	System.out.println("  Welcome to Foods on Wheels  ");
	System.out.println("******************************");
	System.out.println("Tell me who are you..");
	System.out.println("1) Customer");
	System.out.println("2) Resturant");
	System.out.println("3) Rider");
	System.out.println("4) Admin");
	System.out.println("5) Exit");
	
}
public static void login()
{
	System.out.println("\n");
	System.out.println("1) Add to Cart");
	System.out.println("2) Place Order");
	System.out.println("3) Cancel Order");
	System.out.println("4) Update Cart");
	System.out.println("5) Checkout");
	System.out.println("6) Pay Cash on Delivery");
	System.out.println("7) Check Food Delivery Status");
	System.out.println("   Press 0 to logout");
}
public static void customer_login()
{
	System.out.println("1) Add food details");
	System.out.println("2) Update food details");
	System.out.println("3) Delete Food");
	System.out.println("4) Check Food Order");
	System.out.println("5) Update Food delivery status");
	System.out.println("6) Calculate Bills");
	System.out.println("   Press 0 to logout");
}
public static void rider_login()
{
	System.out.println("1) View Order");
	System.out.println("2) Accept or reject delivery order");
	System.out.println("3) Update Food delivery status");
	System.out.println("4) Cash Collection update");
	System.out.println("   Press 0 to logout");
}
public static void admin_login()
{
	System.out.println("1) Manage Vendors");
	System.out.println("2) Manage Vendor products/food");
	System.out.println("3) Manage Customers");
	System.out.println("4) Manage Food order details");
	System.out.println("5) Manage payment details");
	System.out.println("6) Manage Riders");
	System.out.println("   Press 0 to logout");
}

}