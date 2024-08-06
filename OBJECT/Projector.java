class Projector{
  String companny="amazon";
  char type;
  String color;
  int weight;
  
  
  Projector(char type){
	  this.type=type;
  }
  public void setWeight(int weight){
	  this.weight=weight;
  }
  public void display()
  {
	  System.out.println("projector weight:"+weight);
	  System.out.println("projector companny:"+companny);
	   System.out.println("projector type:"+type);
	    System.out.println("projector color:"+color);
		
  }
}