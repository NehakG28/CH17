class SoftwareEngnieer{
	String name;
	int experience;
	String designation;
	double salary;
	
	Owner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("experience:"+experience);
		System.out.println("designation:"+designation);
		System.out.println("salary:"+salary);
    }
}