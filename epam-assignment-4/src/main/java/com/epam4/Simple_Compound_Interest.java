package com.epam4;

public class Simple_Compound_Interest {

	public float calculateSimpleInterest(double principal,double time,double rate) 
	{
		
		return (float) ((principal*time*rate)/100);
	
	}
	public float calculateCompoundInterest(double principal,double time,double rate) 
	{
		
		return (float) ((float) principal * Math.pow(1.0+rate/100.0,time) - principal);
	
	}

}
