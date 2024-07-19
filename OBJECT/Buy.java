class Buy{
public static void product(String brand,double price){
	System.out.println("brand:"+brand);
	System.out.println("price:"+price);
	if(price>56 &&price<97){
		System.out.println("price is valid");
	}
	else
	{
	System.out.println("price is invalid");	
	}
}
public static void product(String name,int quantity,double price){
	System.out.println("name:"+name);
	System.out.println("quantity:"+quantity);
	System.out.println("price:"+price);
	if(quantity>=100 && quantity<=200)
	{
		System.out.println("product quantity is valid");
	}
	else
	{
		System.out.println("product quality is invalid");
	}
  if(price>4000.0 && price<8000.00){
	System.out.println("price is valid");
    }
	else{
		System.out.println("price is invalid");
	}
}
public static void bookMovieTicket(String name,String theaterName,int quality,double price)
{
	System.out.println("name:"+name);
	System.out.println("theatreName:"+theaterName);
	System.out.println("quality:"+quality);
	System.out.println("price:"+price);
 if(quality>=56 &&quality<=97){
	 System.out.println("the quality is valid");
 }
 else{
	 System.out.println("the quality is invalid");
 }
 if(price>=450.50 && price<= 960.70){
	 System.out.println("the price is valid");
 }
 else{
	  System.out.println("the price is invalid");
 }
 }
public static void buyEgg(int total,double pricePerEgg){
	System.out.println("total:"+total);
	System.out.println("pricePerEgg:"+pricePerEgg);
	if(total>420 &&total<940){
		System.out.println("the total is valid");
	}
	else {
		System.out.println("the total is invalid");
	}
	if(pricePerEgg>5.00 && pricePerEgg<8.80){
		System.out.println("the pricePerEgg is valid");
	}
	else {
		System.out.println("the pricePerEgg is invalid");
	}	
	}
public static void buyShampoo (int quantityInM1,double price,String brand,String manfDate){
	System.out.println("quantityInM1:"+quantityInM1);
	System.out.println("price:"+price);
	System.out.println("brand:"+brand);
	System.out.println("manfDate:"+manfDate);
	if(quantityInM1>220 &&quantityInM1<840){
		System.out.println("the quantityInM1 is valid");
	}
	else {
		System.out.println("the quantityInM1 is invalid");
	}
	if(price>560 && price<=980){
		System.out.println("the price is valid");
	}
	else {
		System.out.println("the price is invalid");
         }
}
public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
	System.out.println("size:"+size);
	System.out.println("type:"+type);
	System.out.println("flavour:"+flavour);
	System.out.println("cost:"+cost);
	System.out.println("quantity:"+quantity);
	if(cost>150.00 && cost<500.00)
	{
	System.out.println("the cost is valid");
	}
	else 
	{
	System.out.println("the cost is invalid");
	}
    if(quantity>10 && quantity<100)
    {
	System.out.println("the quantity is valid");
	}
	else 
	{
		System.out.println("the quantity is invalid");
	}
}
public static void buyLaptop(String brand,int serialNo,double price,int batteryCpacity,double screenSize,String os,int harddiskSize,int ramSize)
{
	System.out.println("brand:"+brand);
	System.out.println("serialNo:"+serialNo);
	System.out.println("price:"+price);
	System.out.println("batteryCpacity:"+batteryCpacity);
	System.out.println("screenSize:"+screenSize);
	System.out.println("os:"+os);
	System.out.println("harddiskSize:"+harddiskSize);
	System.out.println("ramSize:"+ramSize);
	if(serialNo>1 && serialNo<10)
	{
		System.out.println("the serial no is valid");
	}
	else
	{
		System.out.println("the serial no is invalid");
	}
    if(price>8000.00 && price<52000.00)
	{
		System.out.println("the price is valid");
	}
	else
	{
		System.out.println("the price is invalid");
	}
	if(batteryCpacity>28 && batteryCpacity<98)
	{
		System.out.println("the batteryCpacity is valid");
	}
	else
	{
		System.out.println("the batteryCpacity is invalid");
	}
	if(screenSize>40 && screenSize<80)
	{
		System.out.println("the screenSize is valid");
	}
	else
	{
		System.out.println("the screenSize is invalid");
	}
	if(harddiskSize>44 && harddiskSize<98)
	{
		System.out.println("the harddiskSize is valid");
	}
	else
	{
		System.out.println("the harddiskSize is invalid");
	}
	if(ramSize>90 && ramSize<180)
	{
		System.out.println("the ramSize is valid");
	}
	else
	{
		System.out.println("the ramSize is invalid");
	}
}
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
	System.out.println("brand:"+brand);
	System.out.println("price:"+price);
	System.out.println("color:"+color);
	System.out.println("type:"+type);
	System.out.println("mode:"+mode);
	if(price>1000.00 && price<5000.00)
	{
		System.out.println("the price is valid");
	}
	else
	{
		System.out.println("the price is invalid");
	}
    if(color>3 && color<7)
	{
		System.out.println("the color is valid");
	}
	else
	{
		System.out.println("the color is invalid");
	}
	 if(mode>67 && mode<89)
	{
		System.out.println("the mode is valid");
	}
	else
	{
		System.out.println("the mode is invalid");
	}
}
}
	
	


