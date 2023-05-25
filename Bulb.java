package online_light_store;

public class Bulb {

	  int Bulb_ID ;
	    String Bulb_name ; 
	    double Bulb_price ; 
	    int Quantity;
	    
	    
	    Bulb(int Bulb_ID,String Bulb_name,double Bulb_price, int Quantity){
	    	this.Bulb_ID= Bulb_ID;
	    	this.Bulb_name = Bulb_name;
	    	this.Bulb_price=Bulb_price;
	    	this.Quantity = Quantity;
	    	
	    }

	    //getters
	    public int getid(){
	        return Bulb_ID;
	    }
	    public String getName(){
	        return Bulb_name;
	    }
	    public double getPrice(){
	        return Bulb_price;
	    }
	    public int getQuantity() {
			return Quantity;
		}
	    

	    //setters
	    public int setid(int bublid){
	        return Bulb_ID = bublid;
	    }
	    public String setName(String bulbname){
	        return Bulb_name = bulbname;
	    }
	    public double setPrice( double bublbprice){
	        return Bulb_price = bublbprice;
	    }
		
		public int setQuantity(int Quantity) {
			return this.Quantity = Quantity;
		}

}
