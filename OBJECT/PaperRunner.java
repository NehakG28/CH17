class PaperRunner{
	public static void main(String[]args){
		Paper paper=new Paper('s');
		paper.thickness=2;
		paper.setQuality('p');
		paper.display();
		Paper paper1=new Paper('l');
		paper1.thickness=3;
		paper1.setQuality('p');
		paper1.display();
		Paper paper2=new Paper('m');
		paper2.thickness=6;
		paper2.setQuality('r');
		paper2.display();
		
	}
}