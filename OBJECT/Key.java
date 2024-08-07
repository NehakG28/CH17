class Key{
	String brand;
	int weight;
	Key(String brand,int weight){
		this.brand=brand;
		this.weight=weight;
	}
	public void display(){
		System.out.println("brand:"+brand);
		System.out.println("weight:"+weight);
	}
}