class JuiceRunner{
	public static  void main(String[]args){
		if(args.length==5){
	String name=args[0];
    String brand=args[1];
    String flavour=args[2];	
	String price=args[3];
	String quantity=args[4];
	double convertedprice=Double.parseDouble(price);
	int convertedquantity=Integer.parseInt(quantity);
	Juice.information(name,brand,flavour,convertedprice,convertedquantity);
}
else{
	System.out.println("5 args required");
}
}
}
	