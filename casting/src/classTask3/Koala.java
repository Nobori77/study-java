package classTask3;

public class Koala extends Harbivore{

	 public Koala() {;}
	 public Koala(String name, int age, String feed) {
	      super(name, age, feed);
	   }
	   
	   @Override
	   public void speak() {
	      System.out.println("알라");
	   }
}
