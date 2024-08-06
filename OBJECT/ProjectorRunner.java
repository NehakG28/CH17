class ProjectorRunner{
	public static void main(String[]args){
		Projector projector=new Projector('s');
		projector.color="white";
		projector.setWeight(200);
		projector.display();
		Projector projector1=new Projector('m');
		projector1.color="blue";
		projector1.setWeight(400);
		projector1.display();
		Projector projector2=new Projector('l');
		projector2.color="red";
		projector2.setWeight(600);
		projector2.display();
		
		
	}
}