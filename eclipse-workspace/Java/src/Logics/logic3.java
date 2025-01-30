package Logics;

import java.util.HashSet;

public class logic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]=  {1,2,4,6,7,8};
		
		HashSet<Integer>  hs  = new HashSet<Integer>();
		   for(int num:arr) {
			   hs.add(num);}
			 //  System.out.println(hs);
		  
	int d = arr[arr.length-1];
	for(int k=1;k<=d;k++) {
		if(!hs.contains(k));{
		System.out.println(k);
	}
	
	}}
}
