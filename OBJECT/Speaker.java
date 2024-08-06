class Speaker{
  String brand="boat";
  char size;
  double cost;
  boolean output;
  
  Speaker(char size){
	  this.size=size;
  }
  public void setCost(double cost){
	  this.cost=cost;
  }
  public void display()
  {
	  System.out.println("speaker brand:"+brand);
	  System.out.println("speaker size:"+size);
	   System.out.println("speaker cost:"+cost);
	    System.out.println("speaker output:"+output);
  }
}