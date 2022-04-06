package car_dealership;

public class Employee {
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		cust.setCashOnHand(cust.getCashOnHand() + loanAmount);
		System.out.println("Gave the Customer a loan amount of " + loanAmount);
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		cust.setCashOnHand(cust.getCashOnHand() - vehicle.getPrice());
		vehicle.setStatus("sold");
		System.out.println(vehicle.getName() + " has been sold to " + cust.getName());
	}
	
    public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (vehicle.getStatus().equals("sold")) {
			System.out.println("Sorry but this car is already sold");
		} else {
			if (finance == true) {
				this.runCreditHistory(cust, Math.abs(cust.getCashOnHand()-vehicle.getPrice()));
				this.processTransaction(cust, vehicle);
			} else if (vehicle.getPrice() < cust.getCashOnHand()) {
				this.processTransaction(cust, vehicle);
			} else if (vehicle.getPrice() == cust.getCashOnHand()) {
				System.out.println("You should consider making a loan");
			} else {
				System.out.println("You should consider choosing another car or get more money");	
			}
		}
    	
    	
	}
	
}