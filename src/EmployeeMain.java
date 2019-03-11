class EmployeeMain
{
	public static void main(String args[])
	{
	
	EmployeeAssignment es=new EmployeeAssignment();
	Scanner sc=new Scanner(System.in);
	
	monthlyBasic=sc.nextFloat();
	System.out.println(monthlyBasic);
	

	 annualBasic=es.getAnnualBasic();
	System.out.println("annual basic is "+ annualBasic);
	
	monthlyGrossSalary=es.getMonthlyGrossSalary();
	System.out.println("Monthly gross salary is "+ monthlyGrossSalary);

	annualGrossSalary=es.getAnnualGrossSalary();
	System.out.println("annual gross salary is "+ annualGrossSalary);
	
	 monthlyDeductions=es.getMonthlyDeductions();
	System.out.println("monthly deduction is "+monthlyDeductions);

	  monthlyTakeHome=es. getMonthlyTakeHome();
	System.out.println("monthly takehome  is "+monthlyTakeHome);

	 annualTakeHome=es.getAnnualTakeHome() ;
	System.out.println("annual takehome is "+annualTakeHome);
	}

	}



}