class GanviRunner{
public static void main(String[]args){
	Clip clip=new Clip("black","banana");
	Ganavi ganavi=new Ganavi("ganavi@123gmail.com",clip);
	ganavi.display();
	Clip clip1=new Clip("blue","butterflyclip");
	Ganavi ganavi1=new Ganavi("ganavi@98gmail.com",clip);
	ganavi1.display();
}
}