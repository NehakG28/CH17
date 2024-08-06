class Choclates{
  String brand="galaxy";
  char size;
  double price;
  String flavour;
  
 Choclates(char size){
	  this.size=size;
  }
  public void setPrice(double price){
	  this.price=price;
  }
  public void display()
  {
	  System.out.println("speaker brand:"+brand);
	  System.out.println("speaker size:"+size);
	   System.out.println("speaker price:"+price);
	    System.out.println("speaker flavour:"+flavour);
  }
}