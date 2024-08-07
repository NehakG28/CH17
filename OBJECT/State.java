class State{
	String name;
	String language;
	State(String name,String language){
		this.name=name;
		this.language=language;	
	}
	public void display(){
		System.out.println("name:"+name);
		System.out.println("language:"+language);
		
	}
}