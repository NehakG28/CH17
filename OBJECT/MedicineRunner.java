class MedicineRunner{
public static void main(String[]args){
if(args.length==4){
	String name=args[0];
    String manfdate=args[1];
	String price=args[2];
	String quantity=args[3];
	float convertedprice=Float.parseFloat(price);
	int convertedquantity=Integer.parseInt(quantity);
	Medicine.informatinonal(name,manfdate,convertedprice,convertedquantity);
}
else{
	System.out.println("4 args required");
}
}
}