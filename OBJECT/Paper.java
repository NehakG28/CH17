class Paper{
  String color="white";
  char size;
 char quality;
  int thickness;
  
  
  Paper(char size){
	  this.size=size;
  }
  public void setQuality(char quality){
	  this.quality=quality;
  }
  public void display()
  {
	  System.out.println("speaker color:"+color);
	  System.out.println("speaker size:"+size);
	   System.out.println("speaker quality:"+quality);
	    System.out.println("speaker thickness:"+thickness);
  }
}