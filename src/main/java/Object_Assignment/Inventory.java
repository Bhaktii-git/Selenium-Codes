package Object_Assignment;

public class Inventory {
	String itemName;
	int quantity;
	double price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory i=new Inventory();
		i.itemName="Laptop";
		i.quantity=10;
		i.price=1200.50;
		
		System.out.println("Item Name: "+i.itemName);
		System.out.println("Quantity: "+i.quantity);
		System.out.println("Price:$ "+i.price);

	}

}
