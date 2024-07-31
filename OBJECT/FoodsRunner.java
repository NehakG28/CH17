class FoodsRunner{
	public static void main(String[] args){
		Foods foods=new Foods();
		String name1=foods.name1;
		String name2=foods.name2;
		String name3=foods.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		foods.name1="roti";
		foods.name2="chicken kholapuri";
		foods.name3="salad";
		System.out.println("foods.name1:"+foods.name1);
		System.out.println("foods.name1:"+foods.name2);
		System.out.println("foods.name1:"+foods.name3);
	}
}