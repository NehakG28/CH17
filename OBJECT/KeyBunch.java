class KeyBunch{
	String materials;
	Key key;
KeyBunch(String materials,Key key){
    this.materials=materials;
	this.key=key;
}
	public void display(){
	System.out.println("materials:"+materials);
	key.display();
	}
	}