class Train{
public static void book(String source,String destination){
System.out.println("book the train with two parameters string");
System.out.println("source:"+source);
System.out.println("destination:"+destination);
}
public static void book(String source,String destination,int quantity){
System.out.println("book the train with three parameters strings and int");
System.out.println("source:"+source);
System.out.println("destination:"+destination);
System.out.println("quantity:"+quantity);
}
public static void book(String source,String destination,int quantity,double price){
System.out.println("book the train with four parameters strings and int and double");
System.out.println("source:"+source);
System.out.println("destination:"+destination);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);
}
public static void cancel(int ticketNo){
System.out.println("cancel the train with parameter int");
System.out.println("ticketNo:"+ticketNo);
}
public static void cancel(String source,String destination){
System.out.println("cancel the train with parameters String");
System.out.println("source:"+source);
System.out.println("destination:"+destination);
}
}

