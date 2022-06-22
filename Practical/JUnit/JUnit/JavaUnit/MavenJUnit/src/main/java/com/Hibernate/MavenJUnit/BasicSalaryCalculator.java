package com.Hibernate.MavenJUnit;

public class BasicSalaryCalculator {

	//creating attribute & method
	private double basicSalary;
	private double getBasicSalary()
	{
		return basicSalary;
	}
	
	// creating method
    public void setBasicSalary(double basicSalary)
    {
    	if (basicSalary < 0)
    	{
    		throw new IllegalArgumentException("Negative salary is invalid");
    	}
    	this.basicSalary = basicSalary;
    }
     
     public double getGrossSalary()
     {
    	 return this.basicSalary + getSocialInsurance() + getAdditionalBonus();
     }
     public double getSocialInsurance()
     {
    	 return this.basicSalary * 25/100;
     }
     public double getAdditionalBonus()
     {
    	 return this.basicSalary /10;
     }
}

