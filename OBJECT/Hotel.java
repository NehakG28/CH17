class Hotel
{
	String name="neha";
	Owner owner=new Owner("neha",21,"female");
	
	Hotel()
	{
		
	}
	
	public void display()
	{
		System.out.println("name:"+name);
		this.owner.display();
		
	}
}