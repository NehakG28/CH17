class ChoclatesRunner{
	public static void main(String[]args){
		Choclates choclates=new Choclates('l');
		choclates.flavour="dark choclate";
		choclates.setPrice(250);
		choclates.display();
		Choclates choclates1=new Choclates('s');
		choclates1.flavour="white choclate";
		choclates1.setPrice(350);
		choclates1.display();
		Choclates choclates2=new Choclates('m');
		choclates2.flavour="coffee";
		choclates2.setPrice(150);
		choclates2.display();
		
	}
}