class Owner
{
	String name;
	int age;
	String gender;
	
	Owner(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
	}
}