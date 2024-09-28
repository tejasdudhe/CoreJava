package day6_saturday2;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Ticket tk = new Ticket();
		
		tk.setAvailableTickets(101);
		tk.setPrice(1000);
		Ticket.setAvailableTickets(20);
		
		System.out.println("Enter the No of Ticket you want : ");
		int noOfTickets = sc.nextInt();
		int tCost = tk.calculateTotalCost(noOfTickets);
		
		
		
		if(tCost==-1)
		{
			System.err.println("Tickets Are Not Available..........");
		}
		else
		{
			System.out.println("Total Cost Of YOur Order : "+tCost);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
