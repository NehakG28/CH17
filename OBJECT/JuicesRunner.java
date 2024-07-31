class JuicesRunner{
	public static void main(String[] args){
		Juices juices=new Juices();
		String name1=juices.name1;
		String name2=juices.name2;
		String name3=juices.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		juices.name1="watermelon";
		juices.name2="orange";
		juices.name3="mauskmelon";
		System.out.println("juices.name1:"+juices.name1);
		System.out.println("juices.name1:"+juices.name2);
		System.out.println("juices.name1:"+juices.name3);
	}
}