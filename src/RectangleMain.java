import java.util.*;
public class RectangleMain{
	public static void main(String[] args){
		double perimeter1;
		double perimeter2;
		double length;
		double breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		Rectangle rectangle1=new Rectangle(length,breadth);
		System.out.println("Area="+rectangle1.area());
		System.out.println("Perimeter="+rectangle1.perimeter());
		System.out.println("Enter length and breadth");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		Rectangle rectangle2=new Rectangle(length,breadth);
		System.out.println("Area="+rectangle2.area());
		System.out.println("Perimeter="+rectangle2.perimeter());
		if(rectangle1.area()==rectangle2.area()) 
		{
			System.out.println("Same");
		}
		else 
		{
			System.out.println("Different");
		}
						
	}
}