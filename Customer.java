package online_light_store;

public class Customer {
    String Customer_name ; 
    String Customer_address ; 
    static int customer_ID = 0;
    
    
    Customer(String Customer_name,String Customer_address){
    	this.Customer_name= Customer_name;
    	this.Customer_address = Customer_address;
    }
    
    public int get_ID() {
    	return customer_ID++;
    }

    public String getName(){
        return Customer_name;
    }
    public String getaddress(){
        return Customer_address;
    }
    
    public String setName(String customer_name){
        return Customer_name = customer_name;
    }
    public String setPrice( String customer_address){
        return Customer_address = customer_address;
    }
}
