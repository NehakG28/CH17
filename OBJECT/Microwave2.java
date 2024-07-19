class Microwave2{
 public static void heat(){
   System.out.println("Microwave heating the food in microwaver ");
   roaster();
  }
      public static void timer(){
	  System.out.println("Microwave timer the food in microwaver ");
	  heat();
   }
   public static void preheat(){
   System.out.println("Microwave preheat the food in microwaver ");
   fryer();
   }
    public static void fryer(){
    System.out.println("Microwave fryer the food in microwaver ");
	 preheat();
	}
    public static void roaster(){
    System.out.println("Microwave roaster the food in microwaver ");
	heat();
	}
}