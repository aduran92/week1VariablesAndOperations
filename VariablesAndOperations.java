package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availablePlaneSeats = 3;
		double costOfGroceries = 64.89;
		char middleInitial = 'G';
		boolean isHotOutside = false;
		String customerFirstName = "Bob";
		String streetAddress = "1020 Willow Dr";
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the cost of groceries at checkout.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives.");
		
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		middleInitial = 'D';
		System.out.println(middleInitial);
		isHotOutside = true;
		System.out.println(isHotOutside);
		String fullName = customerFirstName + " " + middleInitial + " Sanchez";
		System.out.println(fullName);
		System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");
		
		
		
		
		
		

	}

}
