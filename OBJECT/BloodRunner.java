class BloodRunner{
public static void main(String [] args){
System.out.println("running bloodRunner in the main method");
String group=Blood.group();
System.out.println("group:"+group);
String personName=Blood.personName();
System.out.println("personName:"+personName);
double price=Blood.cost();
System.out.println("price:"+price);
String result=Blood.hospitalTested();
System.out.println("result:"+result);
boolean sickness=Blood.sicknessOrNot();
System.out.println("sickness:"+sickness);
boolean donate=Blood.donateOrNot();
System.out.println("donate:"+donate);
}
}