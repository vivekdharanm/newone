package bus_reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class bus_booking
{
	String passengerName;
	int busno;
	Date date;
	
	bus_booking()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Passenger Name: ");
		passengerName = s.next();
		System.out.println("Bus No: ");
		busno = s.nextInt();
		System.out.println("Date (dd-mm-yyyy): ");
		String dateInput = s.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try 
		{
			date = dateFormat.parse(dateInput);
		} 
		
		catch (ParseException e) 
		{
			e.printStackTrace();
		}œ
	}
	
	public boolean isAvailable(ArrayList<bus_booking> bookings, ArrayList<bus> buses)
	{
		
		int capacity =0;
		for(bus buss:buses)
		{
			if(buss.getBusno()== busno)
				capacity = buss.getCapacity();
		}
		
		int booked = 0;
		for(bus_booking b:bookings)
		{
			if(b.busno == busno && b.date.equals(date))
			{
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}
}
