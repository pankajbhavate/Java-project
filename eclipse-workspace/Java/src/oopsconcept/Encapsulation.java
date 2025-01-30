package oopsconcept;

public class Encapsulation {
	
 private int idnumber;
  private static String name="uj";
    String roll = "4444";

    public Encapsulation(int i) {
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation  ee  = new Encapsulation(i);
		    ee.setIdnumber(222);
		    ee.setRoll("333");
		   // ee.setName("pankaj");
		    
		   
		    
		    
		    
		    
		   System.out.println(ee.getIdnumber());
		   System.out.println(ee.getName());
		   System.out.println(ee.getRoll());
		   System.out.println(ee.getName());
		
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int id ) {
		this.idnumber = 33;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}}
	

	
