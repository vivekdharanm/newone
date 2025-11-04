package newOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyCollections 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int o=s.nextInt();
		s.nextLine();
		
		ArrayList<String> onelist = new ArrayList<String>();
		//onelist.add(100);
		
		for(int i=0; i<o; i++) 
		{
			System.out.println("Enter item " + (i+1) +":");
			String result = s.nextLine();
			onelist.add(result);
		}
		
		System.out.println("Random Entries:");
		
		for(String j:onelist)
		{
			System.out.println(j);
		}
		
	Iterator<String> l = onelist.iterator();
		
		System.out.println("Using iterator");
		System.out.println(l.next());
		
		
		sSystem.out.println(onelist);
	}

}
