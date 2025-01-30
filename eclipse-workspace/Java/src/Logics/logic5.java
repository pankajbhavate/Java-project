package Logics;

public class logic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Armstrong or not
		
		
		
		
		  int P,num,Sum,Rem; 
		   
		    num =153;
		   P = num;  //153 
		     
		   for(Sum = 0 ; num>0 ; num=num/10) { 
		     
		  
		    Rem = num % 10; 
		    
		    Sum = Sum + Rem*Rem*Rem;  
		   } 
		  
		   if(Sum == P ) 
		    System.out.println("Armstrng number"); 
		   else  
		    System.out.println("Not armstrong number");

	}

}
