class KeyBunchRunner{
	public static void main(String[]args){
		Key key=new Key("abcd",2);
		KeyBunch keybunch=new KeyBunch("steel",key);
		keybunch.display();
		Key key1=new Key("fgtu",9);
		KeyBunch keybunch1=new KeyBunch("wood",key1);
		keybunch1.display();
		
	}
}