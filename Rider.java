
public class Rider {
	
	private String name;
	String adress;
	String email;
	String phone_no;
	private String password;
	String Query;
	boolean delivery_status=false;
	boolean cash = false;
	
	
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

	
	
	public void print_riders()
	{
		System.out.println("Rider Details");
		System.out.println("Name:"+ name);
		System.out.println("Adress: "+adress);
		System.out.println("Email: "+ email);
		System.out.println("Phone_No: " +phone_no);
		System.out.println("Password: "+password);

	}
	public void delete_rider()
	{
		name=null;
		adress=null;
		phone_no=null;
		email=null;
		password=null;
	}

}
