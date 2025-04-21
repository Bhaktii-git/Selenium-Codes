package Breakout_Session_Sol2;

import java.util.Scanner;

public class Doctor1 
{
	
	String spc;
	String hos;
	int chrage;
	
	
	public Doctor1( String spc,String hos,int chrage) 
	{
		
		this.spc=spc;
		this.hos=hos;
		this.chrage=chrage;
		
	}
	
	
	public String getSpc() 
	{
		return spc;
	}
	public String getHos() 
	{
		return hos;
	}
	public int getCharge() 
	{
		return chrage;
	}

	public void displayDeatils() 
	{
		
		System.out.println("Specilizaton   is "+spc);
		System.out.println("Hospital  Name is "+hos);
		System.out.println("Charges are "+chrage);
	}

	
	
	
}
