class Rocket{
	String country="India";
	int speed;
	int fuelcapacity;
	int noofthrusters;
	Rocket(int speed){
		this.speed=speed;
	}
	public void setFuelcapacity(int fuelcapacity){
		this.fuelcapacity=fuelcapacity;
	}
	public void display(){
		 System.out.println("rocket country:"+country);
	  System.out.println("rocket speed:"+speed);
	   System.out.println("rocket fuelcapacity:"+fuelcapacity);
	    System.out.println("rocket fuelcapacity:"+fuelcapacity);
	}
}