class DistanceTest{
	public static void main(String[] args){
		Distance number1 = new Distance();
		number1.setDistance(5,2);
		number1.displayDistance();
		Distance number2= new Distance();
		number2.setDistance(3,5);
		number2.displayDistance();
		Distance number3;
		number3=number1.sum(number2);
		number3.displayDistance();
	}
}