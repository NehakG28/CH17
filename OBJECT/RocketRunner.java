class RocketRunner{
	public static void main(String[]args){
		Rocket rocket=new Rocket(500);
		rocket.noofthrusters=3;
		rocket.fuelcapacity=500;
		rocket.display();
		Rocket rocket1=new Rocket(9000);
		rocket1.noofthrusters=4;
		rocket1.fuelcapacity=1000;
		rocket1.display();
		
		Rocket rocket2=new Rocket(800);
		rocket2.noofthrusters=6;
		rocket2.fuelcapacity=2000;
		rocket2.display();
		
		
	}
}