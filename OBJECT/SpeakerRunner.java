class SpeakerRunner{
	public static void main(String[]args){
		Speaker speaker=new Speaker('l');
		speaker.output=true;
		speaker.setCost(200);
		speaker.display();
		Speaker speaker1=new Speaker('m');
		speaker1.output=true;
		speaker1.setCost(5000);
		speaker1.display();
		Speaker speaker2=new Speaker('s');
		speaker2.output=false;
		speaker2.setCost(4000);
		speaker2.display();
	}
}