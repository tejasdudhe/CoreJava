

package day6_saturday2;

public class Ticket {
	private int  TicketId;
	private int Price;
	private static int availableTickets;
	
	
	public int getTicketId() {
		return TicketId;
	}
	public void setTicketId(int ticketId) {
		
		TicketId = ticketId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		
		if(availableTickets>0)
		{
			Ticket.availableTickets = availableTickets;
		}
		else
		{
			System.err.println("Available Ticket Shoul be Positive.......");
		}
	}
	
	public int calculateTotalCost(int noOfTickets)
	{
		int tCost;
		
		if(availableTickets>=noOfTickets)
		{
			availableTickets -= noOfTickets;
			tCost = noOfTickets*Price;
			
			return tCost;
		}
		
		return -1;
	}
	
	
	
	
	
	
}
