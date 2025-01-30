package Logics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class logic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anagram or not
       
		String s = "gun";
		String m = "nhug";
		
		if(s.length()==m.length()) {
			
			char c[] =  s.toCharArray();
			char c1[]  = m.toCharArray();
		
			Arrays.sort(c1);
			Arrays.sort(c);
			Boolean b =  Arrays.equals(c, c1);
			
			if(b) {
				
				System.out.println(s+" "+"this string is anagan");}
				else {
					System.out.println(s+" and"+m+" "+"this is not the anagram");
				}
				
				
			}
		}
}
				

	


