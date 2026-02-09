package formatTask;

public class FormatTask01 {
   public static void main(String[] args) {
//      식을 완성시키시오. (포멧으로 출력하기)
//      10 + 20 = 30
//      7 * 8 = 56
//      6 * 4 = 24
	   
	   int numberTen = 0;
	   int numberTwenty = 0;
	   int numberSeven = 0;
	   int numberEight = 0;
	   int numberSix = 0;
	   int numberFour = 0;
	   
	   numberTen = 10;
	   numberTwenty = 20;
	   numberSeven = 7;
	   numberEight = 8;
	   numberSix = 6;
	   numberFour = 4;
	   
	   System.out.printf("%d + %d = %d\n", numberTen, numberTwenty, numberTen + numberTwenty);
	   System.out.printf("%d * %d = %d\n", numberSeven,  numberEight, numberSeven * numberEight);
	   System.out.printf("%d * %d = %d\n", numberSix,  numberFour, numberSix * numberFour);
	   
	   int num1 = 10, num2 = 20, num3 = 7, num4 = 8, num5 = 6, num6 = 4;
	   String result1 = "%d + %d = %d\n", result2 = "%d * %d = %d\n";
	   
	   System.out.printf(result1, num1, num2, num1 + num2);
	   System.out.printf(result2, num3, num4, num2 * num3);
	   System.out.printf(result2, num5, num6, num5 * num6);
	   
	   
   }
}
