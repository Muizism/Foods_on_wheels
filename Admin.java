import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends Resturant {
	File file2 = new File("Rider_Data_Base.txt");
	
	private String user_name = "Maheen";
	private String password = "OOP000";
	public Resturant food;
	String item1=null;
	int prices1=0;
	String fooditems=null;
	boolean block_rider=false;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	Scanner input1 = new Scanner (System.in);
	Scanner inputs = new Scanner (System.in);
	
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
				 try {
						FileWriter myWriter = new FileWriter(file2,true);
					      myWriter.write("\n.....Food deatils.....");
					      myWriter.write("\nResturant Name: "+vresturant);
					      myWriter.write("\nFood Item: "+item1);
					      myWriter.write("\nPrice: "+prices1);
					      myWriter.close();
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
			
				addFood();
				
				
				break;
			
			case 'n':
				System.out.println("Exited");
				break;
		    default:
		    	System.out.println("Wrong choice");
		    	food.vendor.put(item1, prices1);
		    	break;
			}
				
	 }
	

	public void removefood()
	{
		System.out.println("You want to delete food (y/n): ");
		char choice = input1.nextLine().charAt(0);
		switch(choice)
		{
		case 'y':
			System.out.println("Enter the food item: ");
			 fooditems = input1.nextLine();
			 
			 try {
					FileWriter myWriter = new FileWriter(file2,true);
				      myWriter.write("\n.....Remove Food deatils.....");
				      myWriter.write("\nResturant Name: "+vresturant);
				      myWriter.write("\nRemoved Item: "+fooditems);
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
		food.vendor.remove(fooditems);
	}
}
	
}
