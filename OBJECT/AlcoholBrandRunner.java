class AlcoholBrandRunner{
	public static void main(String[] args){
		AlcoholBrand alcoholbrand=new AlcoholBrand();
		String name1=alcoholbrand.name1;
		String name2=alcoholbrand.name2;
		String name3=alcoholbrand.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		alcoholbrand.name1="kingfisher";
		alcoholbrand.name2="oldmunk";
		alcoholbrand.name3="redbull";
		System.out.println("alcoholbrand.name1:"+alcoholbrand.name1);
		System.out.println("alcoholbrand.name1:"+alcoholbrand.name2);
		System.out.println("alcoholbrand.name1:"+alcoholbrand.name3);
	}
}