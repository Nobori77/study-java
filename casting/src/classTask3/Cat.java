package classTask3;

public class Cat extends Omivore{
	   public Cat() {;}
	   public Cat(String name, int age, String feed) {
	      super(name, age, feed);
	   }
	   
	   @Override
	   public void speak() {
	      System.out.println("크앙~");
	   }
}
