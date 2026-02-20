package inheritanceTask;

// 10분
class AA {
   public void paint() {
      System.out.print("A");
      draw();
   }
   public void draw() {
      System.out.print("B");
   }
   
}

class BB extends AA {
   public void paint() {
      super.draw();
      System.out.print("C");
      this.draw();
   }
   public void draw() {
      System.out.print("D");
   }
}

public class InheritanceTask2 {
   public static void main(String[] args) {
      BB b = new BB(); // 객체화
//      b 자식
      b.paint(); // BCD
      b.draw(); // D
   }
}





