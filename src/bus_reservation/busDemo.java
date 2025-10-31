package bus_reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class busDemo {
	public static void main(String[] args)
	{
		ArrayList<bus> buses = new ArrayList<bus>();
		ArrayList<bus_booking> bookings = new ArrayList<bus_booking>();
		
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,60));
		buses.add(new bus(3,true,50));
		buses.add(new bus(4,false,45));
		
		 
		int userOpt=1;
		Scanner s = new Scanner(System.in);
		
		for(bus b:buses)
		{
			b.displaybusinfo();
		}
		
		while(userOpt==1)
		{
			System.out.println("Enter 1 to book 2 to exit: ");
			userOpt = s.nextInt();
			
			if(userOpt==1)
			{
				bus_booking booking = new bus_booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Booking is Confirmed");
				}
				else
				{
					System.out.println("Sorry. That day is not yours.");
				}
			}
			
		}
	}
}
