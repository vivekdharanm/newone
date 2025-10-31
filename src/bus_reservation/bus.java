package bus_reservation;


public class bus 
{
	private int busno;
	private boolean ac;
	private int capacity;
	
	bus(int no, boolean ac, int cap)
	{
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getBusno()
	{
		return busno;
	}
	
	public boolean isAc()
	{
		return ac;
	}
	
	public void setAc(boolean val)
	{
		ac = val;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int cap)
	{
		capacity = cap;
	}
	
	public void displaybusinfo()
	{
		System.out.println("\n Bus No: " + busno + "\n Ac: " + ac + "\n Total Capacity: " + capacity);
	}
}
