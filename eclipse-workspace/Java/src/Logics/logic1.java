package Logics;

public class logic1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String s []  = {"pan","janu","rupu" ,"jj"};
		String p[]  = {"gha","janu","rupu","jj"};
		for(int m=0; m<s.length;m++) {
			
			for(int j=0;j<p.length;j++) {
				if(s[m]==p[j]) {
					
					System.out.println(s[m]);
				}
				
			}
		
		}

	}

}
