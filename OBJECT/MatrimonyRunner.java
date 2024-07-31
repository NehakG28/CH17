class MatrimonyRunner{
	public static void main(String[] args){
		Matrimony matrimony=new Matrimony();
		String gname=matrimony.gname;
		String bname=matrimony.bname;
		int number=matrimony.number;
		System.out.println("gname:"+gname);
		System.out.println("bname:"+bname);
		System.out.println("number:"+number);
		matrimony.gname="yash";
		matrimony.bname="radhika";
		matrimony.number=276;
		System.out.println("matrimony.gname:"+matrimony.gname);
		System.out.println("matrimony.bname:"+matrimony.bname);
		System.out.println("matrimony.number:"+matrimony.number);
	}
}