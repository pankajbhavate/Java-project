package myJava;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import oopsconcept.abstraction;

public class maps  {

	public static void main(String[] args) {
		
	
		
	
		
	 
		// TODO Auto-generated method stub
		
		HashMap<String , Integer>   hh  =  new HashMap<String , Integer>();
		 hh.put("pankaj", 22);
		 hh.put("ram", 22);
		 hh.put("amrut", 88);
		System.out.println(hh);
		System.out.println(hh.get(88));
		System.out.println(hh.values());
		for(Object oo:hh.keySet()) {
			System.out.println(oo+" "+hh.get(oo));
			System.out.println(hh.containsKey(22));
			System.out.println();
			System.out.println(hh.containsValue(22));
			System.out.println();
			System.out.println(hh.containsValue("pankaj"));
			
			System.out.println(hh.containsKey("pankaj"));
			
			
			System.out.println(hh.remove("pankaj", 22));}}}
			  
		