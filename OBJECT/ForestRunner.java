class ForestRunner{
public static void forests (String[] forest){
	System.out.println("start main in the forest");
	if(forest.length==4){
		System.out.println("getting 4 references from the main");
		String name=forest[0];
		String area=forest[1];                          
		String establishedYear=forest[2];
		String state=forest[3];
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("establishedYear:"+establishedYear);
		System.out.println("state:"+state);
	}
	else{
		System.out.println("need 4 reference from main method");                

	}
	System.out.println("end main in forest");
}
}