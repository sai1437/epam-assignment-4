package com.houseprice;

public class Estimation {
	Materials m;
	double cost;
	public double housecost(String material,double area) {
		if(material=="standard")
		{
			 m=new Standard();
		}
		if(material=="above")
		{
			m=new AboveStandard();
		}
		if(material=="high")
		{
			m=new HighStandard();
		}
		if(material=="automated")
		{
			m=new HighStandard_Automated();
		}
		
		cost=area*m.getmaterial();
		return cost;
	}

	
}
