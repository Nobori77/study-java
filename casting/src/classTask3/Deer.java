package classTask3;

public class Deer extends Harbivore{
	 public Deer() {;}
	 public Deer(String name, int age, String feed) {
	      super(name, age, feed);
	   }
	   
	   @Override
	   public void speak () {
	      System.out.println("슴");
	   }
}
