class ApplicationsRunner{
	public static void main(String[] args){
		Applications applications=new Applications();
		String name1=applications.name1;
		String name2=applications.name2;
		String name3=applications.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		applications.name1="instagram";
		applications.name2="facebook";
		applications.name3="free fire";
		System.out.println("applications.name1:"+applications.name1);
		System.out.println("applications.name1:"+applications.name2);
		System.out.println("applications.name1:"+applications.name3);
	}
}