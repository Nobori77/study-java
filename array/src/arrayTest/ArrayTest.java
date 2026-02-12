package arrayTest;

public class ArrayTest {
   public static void main(String[] args) {
//      int[] arData = new int[5];
//      arData[0] = 10;
      
//      String[] arData2 = new String[3];
//      System.out.println(arData2[0]);
      
//      boolean[] arData3 = {false, false, true};
//      arData3[3] = false;
      
	   int[] arData1 = {10, 3, 9, 6, 7};
	   
	   
	   for(int i = 0; i < arData1.length; i++) {
		   System.out.println(arData1[i]);
	   }
      
	   char[] chars = {'A', 'B', 'C', 'D', 'E'};
	      
	      chars[0] = 97;// 컴파일러가 자동 형변환
	      for(int i = 0; i < chars.length; i++) {
	         System.out.print(chars[i] + " ");
	      }
      
   }
}
