package castingTask;

public class CastingTask02 {
   public static void main(String[] args) {
//      "8.43" + 2.59를 더해서 10이 나오도록 출력하기
	   
		double num1 = 0.0, num2 = 0.0;
		int num3 = 0, num4 = 0, numResult = 0;
		String result = "";
		
		num1 = Double.parseDouble("8.43");
		num2 = 2.59;
		
		num3 = (int)num1;
		num4 = (int)num2;
		
		numResult = num3 + num4;
		
		result = "%d + %d = %d";
		
		System.out.printf(result, num3, num4, numResult);
	   
	   
   }
}
