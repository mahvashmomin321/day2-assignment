public class Distance{
    private int feet;
    private double inches;
    
    public void setDistance(int feet,double inches){
		this.feet=feet;
		this.inches=inches;
	}
	
	void displayDistance() {
		System.out.println("Distance in feet="+feet+" Distance in inches="+inches);
	}
    
	public Distance sum(Distance number){
		Distance number3=new Distance();
		number3.feet=this.feet+number.feet;
		number3.inches=this.inches+number.inches;
		return number3;
	}
    
}