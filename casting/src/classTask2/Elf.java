package classTask2;

public class Elf extends Monster {
   public Elf() {;}
   
   @Override
   public void dropItem() {
      System.out.println("날개를 떨군다.");
   }
   
   public void magicAttact() {
      System.out.println("마법으로 공격한다.");
   }
}