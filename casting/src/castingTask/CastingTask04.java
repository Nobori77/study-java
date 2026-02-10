package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기
//	   String num = "0.12346", num1 = "0.5130", num2 = "78", num3 ="9.133";
//	   double num4 = 0.0, num6 = 0.0, num9 = 0.0, num10 = 0.0;
//	   int num5 = 0, num7 = 0, num8 = 0, num11 = 0, num12 =0;
//	   String str = "";
//	   
//	   num4 = Double.parseDouble(num) * 10000;
//	   num6 = Double.parseDouble(num1) * 10;
//	   num9 = Double.parseDouble(num2); 
//	   num10 = Double.parseDouble(num3);
//	   
//	   num5 = (int)num4; 
//	   num7 = (int)num6;
//	   num8 = (int)num6 + 1;
//	   num11 = (int)num9;
//	   num12 = (int)num10;
//	   
//	   str = "%d%d%d%d%d";
//			   
//	   System.out.printf(str, num5, num7, num8, num11, num12);
	   
	   
	   String data1 = "0.12346", data2 = "0.5130", data3 = "78", data4 = "9.133", 
	            numResult = "", result = "정답: %s";
	      int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
	      double double1 = 0.0, double2 = 0.0;
	      
	      double1 = Double.parseDouble(data1);
	      double2 = Double.parseDouble(data2);
	      
	      num1 = (int)(double1 * 10000);
	      num2 = (int)(double2 * 10);
	      num3 = (int)((Double.parseDouble(data1) + Double.parseDouble(data2)) * 10);
	      num3 = data1.indexOf("6");
	      num4 = Integer.parseInt(data3);
	      num5 = (int)Double.parseDouble(data4);
	      
	      numResult = "" + num1 + num2 + num3 + num4 + num5;
	      System.out.printf(result, numResult);
	   
   }
}
