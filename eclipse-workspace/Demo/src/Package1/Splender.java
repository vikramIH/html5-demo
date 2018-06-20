package Package1;
	
	class Bike {  
		   void run() {
		      System.out.println("running");
		   }  
		}  

		public class Splender extends Bike {  
		  
			void run() {
		      System.out.println("Bike is running");
		   } 
		   
		
		   public static void main(String args[]) {

		      Bike a = new Bike();
		      a.run();              //output: running

		      Bike b = new Splender();  
		      b.run();              //output: Bike is running 
		   }  
		
		
		}

