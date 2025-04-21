package Breakout_Session3;

import java.util.Scanner;

public class Doctor 
{
	public String name;
	String spc;
	String hos;
	int chrage;
	
	
	
	
	public Doctor(String name,String spc, String hos, int chrage) {
		this.name=name;
		this.spc=spc;
		this.hos=hos;
		this.chrage=chrage;
	}

	public String getName() 
	{
		return name;
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
		System.out.println("Doctor Name is "+name);
		System.out.println("Specilizaton   is "+spc);
		System.out.println("Hospital  Name is "+hos);
		System.out.println("Charges are "+chrage);
	}

	
	
	
}
