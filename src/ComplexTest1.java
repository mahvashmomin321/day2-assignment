class ComplexTest1{
	public static void main(String[] args){
		Complex number1 = new Complex();
		number1.setComplexNumber(5,2);
		number1.displayComplexNumber();
		Complex number2= new Complex();
		number2.setComplexNumber(3,5);
		number2.displayComplexNumber();
		Complex number3;
		number3=number1.sum(number2);
		number3.displayComplexNumber();
	}
}