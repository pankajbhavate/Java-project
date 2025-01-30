package oopsconcept;

public class Polymorphism {

	public static void main(String[] args) {
		
		Polymorphism pp  = new Polymorphism();
		pp.pankaj();
		pp.pankaj(11);
		pp.pankaj(2, "harish");
		// TODO Auto-generated method stub
		
	}
	
	
	public void pankaj() {
		System.out.println("hi pankaj");
		
	}
	
	public void pankaj(int i) {
		i = 10;
		System.out.println(i);
	}
	public void pankaj(int i,String m) {
		System.out.println(m);
	}

}
