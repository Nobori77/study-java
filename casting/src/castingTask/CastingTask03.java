package castingTask;

public class CastingTask03 {
   public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
	   
	   char ch = 'a', ch1 = 'j', ch2 = 'k';
	   int gap = 'a' - 'A';
	   String result = "%c, %c, %c";
	   
	   ch = (char)(ch - gap);
	   ch1 = (char)(ch1 - gap);
	   ch2 = (char)(ch2 - gap);
	   
	   
	   System.out.printf(result, ch, ch1, ch2);
   }
}
