class CandyRunner{
	public static void main(String[] args){
		Candy candy=new Candy();
		String name1=candy.name1;
		String name2=candy.name2;
		String name3=candy.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		candy.name1="equrails";
		candy.name2="5star";
		candy.name3="snickers";
		System.out.println("candy.name1:"+candy.name1);
		System.out.println("candy.name1:"+candy.name2);
		System.out.println("candy.name1:"+candy.name3);
	}
}