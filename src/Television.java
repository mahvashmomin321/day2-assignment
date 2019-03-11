public class Television{
	private boolean powerOn;
	private double channel;
	private double volume;

	public Television(){
		
	}   
	
	public Television(boolean powerOn,double channel,double volume){
		this.powerOn=powerOn;
		this.channel=channel;
		this.volume=volume;
	}
	
	public void setPower(){
		powerOn=!powerOn;
	}

	public boolean getPower(){
		return powerOn;
	}
	
	public void setChannel(int c){
			channel=c;
	}
	public double getChannel(){
		return channel;
	}

	public void setVolume(int v){
		volume=v;
	}

	public double getVolume(){
		return volume;
	}

	public void increaseVolume(){
		volume+=1;
	}
	public void decreaseVolume(){
		volume-=1;
	}

	public void display(){
		System.out.println("Current state="+getPower()+"\nCurrent Volume="+getVolume()+"\nCurrent Channel="+getChannel());
	}
}

