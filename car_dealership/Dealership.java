package car_dealership;
import java.util.*;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		Dealership.generateCus(cust1);
		
		Employee emp1 = new Employee();
		
		Vehicle veh1 = new Vehicle();
		Dealership.generateVeh(veh1);
		
		cust1.purchaseCar(veh1, emp1, false);
		
		System.out.println(veh1.getStatus());
		System.out.println(cust1.getCashOnHand());
	}
	
	public static void generateCus(Customer cust) {
		System.out.println("Customer Information:");
		System.out.print("Name: ");
		String name = new Scanner(System.in).nextLine();
		cust.setName(name);
		
		System.out.print("Address: ");
		String address = new Scanner(System.in).nextLine();
		cust.setAddress(address);
		
		System.out.print("Cash on hand: ");
		int cashOnHand = new Scanner(System.in).nextInt();
		cust.setCashOnHand(cashOnHand);
		System.out.println();
	}
	
	public static void generateVeh(Vehicle veh) {
		System.out.println("Vehicle Information:");
		System.out.print("Brand: ");
		String brand = new Scanner(System.in).nextLine();
		veh.setBrand(brand);
		
		System.out.print("Model: ");
		String model = new Scanner(System.in).nextLine();
		veh.setModel(model);
		
		String name = veh.getBrand() + " " + veh.getModel();
		System.out.println("Name: " + name);
		veh.setName(name);
		
		System.out.print("Color: ");
		String color = new Scanner(System.in).nextLine();
		veh.setColor(color);
		
		System.out.print("Price: ");
		int price = new Scanner(System.in).nextInt();
		veh.setPrice(price);
		
		System.out.print("Status: ");
		String status = new Scanner(System.in).nextLine();
		veh.setStatus(status);
		System.out.println();
	}

}