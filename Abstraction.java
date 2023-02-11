
public abstract class Abstraction {

	String name;
	String adress;
	String email;
	String phone_no;
	String password;
	
	public void KFC(){}
	public void add_food_kfc(String item, int price){}
	public void replace_food_kfc(String item, int price) {}
    public void kfc_resturant_prices(int opt, int quantity) {}
    public void remove_kfc(String food) {}
	
	public void McDonalds(){}
	public void add_food_mcdonalds(String item, int price) {}
	public void replace_food_mcdonalds(String item, int price) {}
	public void mcdonlads_resturant_prices(int opt, int quantity) {}
	public void remove_mcdonalds(String food) {}
	
	public void Optp(){}
	public void add_food_optp(String item, int price) {}
	public void replace_food_optp(String item, int price) {}
	public void optp_resturant_prices(int opt, int quantity) {}
	public void optp() {}
	public void remove_optp(String food) {}
	
	public void vendor_food(String food, int price) {}
	public void addFood() {}
	public void vendor() {}
	public void printvendors() {}
	public void newprices(int opt, int quantity, int priceless) {}
	public void print_vendors() {}
	public void replace_food_vendor(String item, int price) {}
	public void remove_vendor(String food) {}
	public void add_vendors(String item, int price) {}
	

}
