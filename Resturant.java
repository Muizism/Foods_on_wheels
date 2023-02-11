import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Resturant extends Abstraction {
	File file1 = new File("Resturant_Data_Base.txt");
	
	private String name;
	String adress;
	String email;
	String phone_no;
	private String password;
	String vname, vpassword,vemail,vphoneno,
	vadress;
	String vresturant = "Pending";
	int P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12,
	P13,P14,P15,P16,P17,P18;
	public double kfc_prices;
	public double mcdonalds_prices;
	public double optp_prices;
	public double vprices;
	boolean request = false;
	public String item1 = null;
	Integer prices1 = 0;
	boolean rideron=false;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 HashMap<String, Integer> kfc = new HashMap<String, Integer>();
	 HashMap<String, Integer> mcdonalds = new HashMap<String, Integer>();
	 HashMap<String, Integer> optp = new HashMap<String, Integer>();
	 HashMap<String, Integer> vendor = new HashMap<String, Integer>();
	 
	@Override
	 public void KFC()
	{
		
			kfc.put("Burger", 150);
			kfc.put("cheese burger", 180);
			kfc.put("fries", 190);
			kfc.put("Drinks", 200);
		
	}
	@Override
	 public void add_food_kfc(String item, int price)
	 {
		 kfc.put(item, price);
		 System.out.println("Food added successfully!!");
	 }
	 @Override
	 public void replace_food_kfc(String item, int price)
	 {
		 kfc.replace(item, price);
		 System.out.println("Food replaced successfully!!");
	 }
	 @Override
	 public void McDonalds()
	 {
		 
		 mcdonalds.put("Big Mac", 90);
		 mcdonalds.put("Iced Coffee", 70);
		 mcdonalds.put("Egg McMuffin", 120);
		 mcdonalds.put("Cappucino", 400);
		
			
			
	 }
	 @Override
	 public void add_food_mcdonalds(String item, int price)
	 {
		 mcdonalds.put(item, price);
		 System.out.println("Food added successfully!!");
	 }
	 @Override
	 public void replace_food_mcdonalds(String item, int price)
	 {
		 mcdonalds.replace(item, price);
		 System.out.println("Food replaced successfully!!");
	 }
	 @Override
	 public void optp()
	 {
		
		 optp.put("Single Classic", 400);
		 optp.put("Single Jalapeno", 80);
		 optp.put("Double Classic", 170);
		 optp.put("Double Classic", 170);
		 optp.put("Double japaleno", 90);
		 optp.put("Platter", 170);
		 optp.put("Cocktail", 90);
		
		 
			
	 }
	 @Override
	 public void add_food_optp(String item, int price)
	 {
		 optp.put(item, price);
		 System.out.println("Food added successfully!!");
	 }
	 @Override
	 public void replace_food_optp(String item, int price)
	 {
		 optp.replace(item, price);
		 System.out.println("Food replaced successfully!!");
	 }
	 @Override
	 public void replace_food_vendor(String item, int price)
	 {
		 vendor.replace(item, price);
		 System.out.println("Food replaced successfully!!");
	 }
	 @Override
	 public void kfc_resturant_prices(int opt, int quantity)
	 {
		 if (opt<=4)
		 {
			 P1=quantity*150;
			 P2=quantity*180;
			 P3=quantity*190;
			 P4=quantity*200;
			 
			 kfc_prices=P1+P2+P3+P4;
		 }
	 }
     @Override
	 public void mcdonlads_resturant_prices(int opt, int quantity)
	 {
		 if (opt<=8 && opt>=5)
		 {
			 P5=quantity*90;
			 P6=quantity*120;
			 P7=quantity*70;
			 P8=quantity*120;
			 mcdonalds_prices=P5+P6+P7+P8;
		 }
	 }
     @Override
	 public void optp_resturant_prices(int opt, int quantity)
	 {
		 if (opt<=9 && opt>=15)
		 {
			 P9=quantity*400;
			 P10=quantity*600;
			 P11=quantity*80;
			 P12=quantity*170;
			 P13=quantity*90;
			 P14=quantity*70;
			 P15=quantity*90;
			 
			 optp_prices=P9+P10+P11+P12+P13+P14+P15;
		 }
	 }
     @Override
	 public void remove_mcdonalds(String food)
	 {
		 mcdonalds.remove(food);
		 System.out.println("Item has been removed");
		 
	 }
     @Override
	 public void remove_vendor(String food)
	 {
		 vendor.remove(food);
		 System.out.println("Item has been removed");
		 
	 }
     @Override
	 public void remove_optp(String food)
	 {
		 optp.remove(food);
		 System.out.println("Item has been removed");
		 
	 }
     @Override
	 public void remove_kfc(String food)
	 {
		 kfc.remove(food);
		 System.out.println("Item has been removed");
		 
	 }
     @Override
	 public void print_vendors()
		{
			System.out.println("Vendor Details");
			System.out.println("Name:"+ vname);
			System.out.println("Adress: "+vadress);
			System.out.println("Email: "+ vemail);
			System.out.println("Phone_No: " +vphoneno);
	

		}
     @Override
	 public void vendor_food(String food, int price)
	 {
		 vendor.put(food, price);
	 }
	 Scanner input1=new Scanner(System.in);
	 Scanner inputs = new Scanner(System.in);
	 @Override
	 public void addFood()
	 {

			System.out.println("You want to enter food (y/n): ");
			char choice = input1.nextLine().charAt(0);
			switch(choice)
			{
			case 'y':
				System.out.println("Enter the food item: ");
				item1 = input1.nextLine();
				
				System.out.println("Enter the price: ");
				prices1 = inputs.nextInt();
			  	vendor.put(item1, prices1);
			
				addFood();
				System.out.println("Food has been added successfully");
				try {
					FileWriter myWriter = new FileWriter(file1,true);
				      myWriter.write("\n.....Vendor Food Items.....");
				      myWriter.write("\nFood: "+item1+"  Rs."+prices1);
				      myWriter.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				break;
			
			case 'n':
				System.out.println("Exited");
				break;
		    default:
		    	System.out.println("Wrong choice");
		  
		    	break;
			}
				
	 }
	 @Override
	 public void vendor()
	 {
		 vendor.put(adress, prices1);
	 }
	 @Override
	 public void printvendors()
	 {
		 System.out.println(vendor);
	 }
	 @Override
	 public void newprices(int opt, int quantity, int priceless)
	 {
		 if (opt>15)
		 {
			P16=quantity*priceless;
			P17=quantity*priceless;
			P18=quantity*priceless;
			vprices=P16+P17+P18;
			 
			
		 }
	 }
	 @Override
	 public void add_vendors(String item, int price)
	 {
		 vendor.put(item, price);
		 System.out.println("Food added successfully!!");
	 }
}
