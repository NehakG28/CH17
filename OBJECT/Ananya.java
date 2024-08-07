class Ananya{
String mobile;
Knife knife;
Ananya(String mobile,Knife knife){
	this.mobile=mobile;
	this.knife=knife;
}
public void show(){
	System.out.println("mobile:"+mobile);
	knife.show();
}
}