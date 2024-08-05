class AiroplaneRunner
{
	public static void main(String[] args)
	{
		 Airoplane airoplane=new Airoplane();
		
	Airoplane airoplane1=new Airoplane("Air India",250,5500,"bengaluru","manglore");
		System.out.println("airoplane companny:"+airoplane1.companny);
		System.out.println("airoplane noofseats:"+airoplane1.noofseats);
		System.out.println("airoplane ticketprice:"+airoplane1.ticketprice);
		System.out.println("airoplane source:"+airoplane1.source);
		System.out.println("airoplane destination:"+airoplane1.destination);
        
		
		Airoplane airoplane2=new Airoplane("jetfly","lucknow","chennai");
		System.out.println("airoplane companny:"+airoplane2.companny);
		System.out.println("airoplane source:"+airoplane2.source);
		System.out.println("airoplane destination:"+airoplane2.destination);
		
	Airoplane airoplane3=new Airoplane("indigo",2900,"mumbai","odisa");
	    System.out.println("airoplane companny:"+airoplane3.companny);
		System.out.println("airoplane ticketprice:"+airoplane3.ticketprice);
		System.out.println("airoplane source:"+airoplane3.source);
		System.out.println("airoplane destination:"+airoplane3.destination);
		
	}
}