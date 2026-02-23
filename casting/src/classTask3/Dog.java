package classTask3;

public class Dog extends Omivore{
	   public Dog() {;}
	   public Dog(String name, int age, String feed) {
	      super(name, age, feed);
	   }
	   
	   @Override
	   public void speak() {
	      System.out.println("멍멍~");
	   }
}
