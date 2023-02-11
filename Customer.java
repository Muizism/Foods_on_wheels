import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public  class Customer extends Resturant {
	File file2 = new File("Rider_Data_Base.txt");
	
	Scanner scs = new Scanner(System.in);
	int customers = 0;
	private String name;
    String adress;
	String email;
	String phone_no;
	private String password;
	String item_name;
	String note;
	boolean delivery = false;
	public double total_price;
	public  double p1,p2,p3,p4,p5,p6,p7,p8,
	 p9,p10,p11,p12,p13,p14,p15,p16,p17,p18=0;
	int quantity;
	

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

	
	
	public void prices(int opt_1,int quantity, int priceless) {
		
	
		if (opt_1==1)
		{
			p1=quantity*150;
		}
		if (opt_1==2)
		{
			p2=quantity*180;
		}
		if (opt_1==3)
		{
			p3=quantity*190;
		}
		if (opt_1==4)
		{
			p4=quantity*200;
		}
		if (opt_1==5)
		{
			p5=quantity*90;
		}
		if (opt_1==6)
		{
			p6=quantity*120;
		}
		if (opt_1==7)
		{
			p7=quantity*70;
		}
		if (opt_1==8)
		{
			p8=quantity*120;
		}
		if (opt_1==9)
		{
			System.out.print("S/M/L: ");
			String choice = scs.nextLine();
			
			p9=quantity*400;
		}
		if (opt_1==10)
		{
			p10=quantity*600;
		}
		if (opt_1==11)
		{
			p11=quantity*80;
		}
		if (opt_1==12)
		{
			p12=quantity*170;
		}
		if (opt_1==13)
		{
			p13=quantity*90;
		}
		if (opt_1==14)
		{
			p14=quantity*70;
		}
		if (opt_1==15)
		{
			p15=quantity*90;
		}
		if(opt_1>15)
		{
			p16=quantity*priceless;
			p17=quantity*priceless;
			p18=quantity*priceless;
			
		}
		
		System.out.println("Item added successfully!");
		
		total_price=p1+p3+p3+p4+p5+p6+
				p7+p8+p9+p10+p11+p12+p13+p14+p15+p16+p17+p18;
	}
	

	public void print_customers()
	{
		System.out.println("Customer Details");
		System.out.println("Name:"+ name);
		System.out.println("Adress: "+adress);
		System.out.println("Email: "+ email);
		System.out.println("Phone_No: " +phone_no);
		System.out.println("Password: "+password);
		 try {
				FileWriter myWriter = new FileWriter(file2,true);
			      myWriter.write("\n.....Customer deatils.....");
			      myWriter.write("\nName: "+name);
			      myWriter.write("\nAdress: "+adress);
			      myWriter.write("\nEmail: "+email);
			      myWriter.write("\nPhone No: "+phone_no);
			      myWriter.write("\nPassword: "+password);
			      
			      myWriter.close();
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
	
	}
	public void delete_customers()
	{
		name=null;
		adress=null;
		phone_no=null;
		email=null;
		password=null;
	}
}
