public class Complex{
	private double real;
	private double imaginary;
	
	public void setComplexNumber(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	void displayComplexNumber() {
		System.out.println("Complex Number="+real+"+i"+imaginary);
	}

	public Complex sum(Complex number){
		Complex number3=new Complex();
		number3.real=this.real+number.real;
		number3.imaginary=this.imaginary+number.imaginary;
		return number3;
	}

}