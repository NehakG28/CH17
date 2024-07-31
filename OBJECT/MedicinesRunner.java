class MedicinesRunner{
	public static void main(String[] args){
		Medicines medicines=new Medicines();
		String name1=medicines.name1;
		String name2=medicines.name2;
		String name3=medicines.name3;
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		medicines.name1="dollo";
		medicines.name2="paracetmol";
		medicines.name3="cetrigen";
		System.out.println("medicines.name1:"+medicines.name1);
		System.out.println("medicines.name1:"+medicines.name2);
		System.out.println("medicines.name1:"+medicines.name3);
	}
}