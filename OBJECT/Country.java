class Country{
	public static void state(String[] states){
		System.out.println("start of the statement");
		for(int num=states.length-1;num>=0;num--){
	     String ref=states[num];
		 System.out.println(num);
		 System.out.println("states:"+ref);
		}
}
     public static void pincode(int[] pincodeno){
		System.out.println("pincode of the states");
		for(int num=pincodeno.length-1;num>=0;num--){
	     int ref=pincodeno[num];
		 System.out.println("pincode:"+ref);
		}
}
 public static void primeminister(String[] primeministers){
		System.out.println("toatal prime ministers");
		for(int num=primeministers.length-1;num>=0;num--){
	     String ref=primeministers[num];
		 System.out.println("primeminister:"+ref);
		}
 }
 public static void cabinetminister(String[] cabinetministers){
		System.out.println("total cabinet ministers");
		for(int num=cabinetministers.length-1;num>=0;num--){
	     String ref=cabinetministers[num];
		 System.out.println("cabinetminister:"+ref);
		}
}
public static void politicalpartie(String[] politicalparties){
		System.out.println("total political parties");
		for(int num=politicalparties.length-1;num>=0;num--){
	     String ref=politicalparties[num];
		 System.out.println("politicalparties:"+ref);
		}
}
}