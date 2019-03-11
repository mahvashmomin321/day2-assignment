import java.util.*;
import java.io.*;
class Employee
{
	  int employeeId;
	  String employeeName;
	  float monthlyBasic;
	  float annualBasic;
	  float annualGrossSalary;
	  float monthlyGrossSalary;
	  float medical= 1250.0f;
	  float conveyance=  800.0f;
	  float profTax;
	  float  monthlyTakeHome;
	  float monthlyDeductions;
	  float annualTakeHome;
	  float esic;

	Employee(int employeeId, String employeeName,float monthlyBasic)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.monthlyBasic=monthlyBasic;
	}

	public float getAnnualBasic()
	{
 		return 12 * monthlyBasic;
	}
	float hra =(float) (0.50)*monthlyBasic;


	public float getMonthlyGrossSalary()
	{
		return (monthlyBasic + hra + medical + conveyance);
	}

	public float getAnnualGrossSalary() 
	{
		return (12 * monthlyGrossSalary);
	}

	float pf =(float)(0.10*( monthlyBasic));


	
	
	public float getMonthlyDeductions()
	{
		if(monthlyBasic<=5000)
		{
		 esic = (float)(4.75/100)*( monthlyBasic);
		}
		else
		{
			esic=0;
		}
		if(monthlyGrossSalary<=10000)
		{
		 	profTax=50;
		}
		else
		{
			profTax=100;
		}
		 return (pf + esic + profTax);
	}

	public float getMonthlyTakeHome() 
	{
		return (monthlyGrossSalary- monthlyDeductions);
	}

	public float getAnnualTakeHome() 
	{
		return (12 * monthlyTakeHome);
	}

	

	

}