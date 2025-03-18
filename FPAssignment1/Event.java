package FPAssignment1;

import java.util.Scanner;

public class Event{
    // necessary ingredient 
	private String eventName;
	private boolean isOnline;
	private double price;
	private int seatsAvailable;
	public Event(String name, double price, int seatsAvailable, boolean online){
		eventName = name;
		this.price = price;
		this.seatsAvailable = seatsAvailable;
		this.isOnline = online;
	}
	public String  getName()     { 
		return eventName;
	}
	public double  getPrice()    { 
		return price;
	}
	public int     getSeats()    { 
		return seatsAvailable;
	}
	public boolean onlineOrNot() { 
		return isOnline;
	}

	public Tuple PurchaseTickets(){
		Scanner scanner = new Scanner(System.in);
		boolean buyingOnline = false;
		if(isOnline){
			System.out.println("Do you want to attend online? (y/n)");
			String input = scanner.nextLine();
			while(!Utility.isYN(input)){
				System.out.println("Please enter \'y\' or \'n\' ");
				input = scanner.nextLine();
			}
			if(input.equals("y")){
				buyingOnline = true;
			}
		}
		System.out.println("Please enter the quanitity of ticket:");
		
		String quantityString = scanner.next();
		while(!isValidQuantity(quantityString, buyingOnline)){
			System.out.println("Please enter an integer greater than 0.");
			quantityString = scanner.nextLine();
		}
		System.out.println(quantityString + " tickets of " + eventName + " booked!");
		if(!buyingOnline){
			seatsAvailable -= Integer.parseInt(quantityString);
		}
		System.out.println("Going back to main menu");
		return new Tuple<>(this, Integer.parseInt(quantityString));
		
	}
	

	boolean isValidQuantity(String str, boolean buyingOnline){
		
		if(Utility.isInt(str)){
			int strAsInt = Integer.parseInt(str);
			if(strAsInt >= 1){
				if(buyingOnline){
					return true;
				}
				if(strAsInt <= seatsAvailable){
					return true;
				}else{
					System.out.println("Not enough tickets!");
				}
				
			}
		}
		System.out.println("Invalid quantity");
		return false;
	}
	
    // more necessary ingredient
}
