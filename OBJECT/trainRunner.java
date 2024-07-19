class trainRunner{
public static void main(String[] args){
	System.out.println("train books and cancel the train runner");
	train.book("bengaluru","shivamoga");
	train.book("bengaluru","shivamoga",3);
	train.book("bengaluru","shivamoga",3,650);
	train.cancel(26);
	train.cancel("shivamoga","bengaluru");
}
}