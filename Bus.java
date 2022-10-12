package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Bus;
public class BusRunner 
{
	public static void main(String[] args) 
	{         
			    Bus bus1 = new Bus();
				System.out.println(bus1.starting);
				System.out.println(bus1.destination);
				System.out.println(bus1.busNo);	
				
				bus1.starting="Mysore";
				bus1.destination="Bangalore";
				bus1.busNo=250KM;
				
				System.out.println(bus1.starting);
				System.out.println(bus1.destination);
				System.out.println(bus1.busNo);
			}	

}