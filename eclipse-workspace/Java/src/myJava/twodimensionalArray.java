package myJava;

public class twodimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj [][]  =  new Object[3][2];
		 obj[0][0] = 22;
		 obj[0][1] = "hh";
		 //obj[0][2] = "jj";
		 
		 obj[1][0] = 11.2;
		 obj[1][1]= "aman";
		 
		 obj[2][0]= 44;
		 obj[2][1] = "rr";
		 
		 System.out.println(obj.length);
		 System.out.println(obj[0][0]);
		 for(int r=0;r<obj.length;r++) {
			// System.out.println(obj[r]);
			 for(int c=0;c<obj[2].length;c++) {
				 System.out.println(obj[r][c]);
			 }
		 }
		 System.out.println();
		 
				

	}

}
