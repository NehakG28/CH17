class FruitsRunner{
	public static void main(String[] args){
		Fruits fruits=new Fruits();
		String name1=fruits.name1;
		String name2=fruits.name2;
		String name3=fruitss.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		fruits.name1="apple";
		fruits.name2="mango";
		fruits.name3="jackfruit";
		System.out.println("fruits.name1:"+fruits.name1);
		System.out.println("fruits.name1:"+fruits.name2);
		System.out.println("fruits.name1:"+fruits.name3);
	}
}