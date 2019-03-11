import java.util.*;
public class TelevisionUser{
	public static void main(String[] args) {
		int c; 
		int v;
		boolean powerOn=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please turn on the tv");
		powerOn=sc.nextBoolean();
		Television user1=new Television(powerOn,20,1);
		if(powerOn==true){
			user1.increaseVolume();
			System.out.println("Volume increased="+user1.getVolume());
			user1.decreaseVolume();
			System.out.println("Volume decrease="+user1.getVolume());
			System.out.println("Enter the channel Number to change");
			c=sc.nextInt();
			user1.setChannel(c);
			user1.display();
			user1.setPower();
			System.out.println(user1.getPower());
		}
		else {
			System.out.println("You cannot perform any action first turn on the Tv");
		}
	}
}