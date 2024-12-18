package a.com;

//public class AA {
	
//	int b = 20;
	//static int c = 30;
	
	//public static void main(String[] args) {
		//int a=10;
		
		//System.out.println(a + " = a is local variable");
		//System.out.println(AA.c +" = c is static variable");
		//System.out.println(c+" = c is static variable");
		
		 //AA aa = new AA();
		 //System.out.println(aa.b+" = b Instance variable");


	//}
	
//		   public static void main(String args[]) {
//		      try {
//		    	  throw new Exception("100");
//		      }
//		      catch(Exception e) {
//		         System.out.println(e);
	//	      }
	//	  }


class Test {
	  String test = “XYZ”;
	  private T() {
	    test = “ABC”;
	  }
	}
	class Main {
	   public static void main(String args[]) {
	      T t1 = new T();
	      System.out.println(t1.t);
	   }
	}
