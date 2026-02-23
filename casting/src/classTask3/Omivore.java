package classTask3;

public class Omivore extends Animal{
	   public Omivore() {;}
	   public Omivore(String name, int age, String feed) {
	      super(name, age, feed);
	   }
	   
	   public void printOmivore() {
	      System.out.println(super.getName() + "은 잡식동물!");
	   }
}
