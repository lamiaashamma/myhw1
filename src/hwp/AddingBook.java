package hwp;

import java.util.ArrayList;

public class AddingBook {
	
  public static ArrayList<Shoping> al=new ArrayList<Shoping>();	
	
	public static void  addcart() {
		
		Shoping x = new Shoping() ;
		al.add(x) ;
		
		 
	}
	
	public static void addBook(int cart , int price , String name, int count) { 
		Book x = new Book() ;
		x.NameBook=name; 
		x.Countbook=count ;
		x.priceBook=price ;
		al.get(cart).ala.add(x) ;
		
		
	}
	public static void main(String[] args) {
		
		addcart() ;
		addBook(0,100,"java",2) ;
		addBook(0,100,"java",2) ;
		addBook(0,100,"java",2) ;
		addBook(0,100,"java",2) ;
		System.out.println("size of cart = "+al.size());
		System.out.println("total price = " + al.get(0).getcount());
		System.out.println("size book = " + al.get(0).ala.size());

	}

}
