class Airoplane
{
	String companny;
	int noofseats;
	double ticketprice;
	String source;
	String destination;
	
	Airoplane()
	{
		System.out.println("created Airoplane without parameter");
	}
	
	Airoplane(String companny,int noofseats,double ticketprice,String source,String destination)
	{
this.companny=companny;
this.noofseats=noofseats;
this.ticketprice=ticketprice;
this.source=source;
this.destination=destination;
}	
Airoplane(String companny,String source,String destination)
	{
		this.companny=companny;
		this.source=source;
		this.destination=destination;
		
}

Airoplane(String companny,double ticketprice,String source,String destination)
	{
		this.companny=companny;
		this.ticketprice=ticketprice;
		this.source=source;
		this.destination=destination;
		
}
}