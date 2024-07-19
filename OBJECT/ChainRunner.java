class ChainRunner{
public static void main(String []args){
System.out.println("running chain class in chain runner");
int carat=Chain.carat();
System.out.println("carat:"+carat);
int costPerGram=Chain.costPerGram();
System.out.println("costPerGram:"+costPerGram);
String type=Chain.type();
System.out.println("type:"+type);
String quality=Chain.quality();
System.out.println("quality:"+quality);
int quantity=Chain.quantity();
System.out.println("quantity:"+quantity);
float wastage=Chain.wastage();
System.out.println("wastage:"+wastage);
double cost=Chain.serviceCharge();
System.out.println("cost:"+cost);
double gstPrice=Chain.gst();
System.out.println("gstPrice:"+gstPrice);
}
}