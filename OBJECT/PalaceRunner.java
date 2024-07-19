class PalcaeRunner{
public static void palaces(String[] palace){
	System.out.println("start main in the palace");
	if(palace.length==4){
		System.out.println("getting 4 references from the main");
		String name=palace[0];
		String location=palace[1];                          
		String builtBy=palace[2];
		String buildYear=palace[3];
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("builtBy:"+builtBy);
		System.out.println("buildYear:"+buildYear);
	}
	else{
		System.out.println("need 4 reference from main method");              

	}
	System.out.println("end main in palace");
}
}