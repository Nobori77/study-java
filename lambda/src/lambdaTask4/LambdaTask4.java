package lambdaTask4;

public class LambdaTask4 {
   public static void main(String[] args) {
//      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//      입력 예시)
//      3
//      출력 예시)
//      3 x 1 = 3
//      ...
//      3 x 9 = 27
	   
	   Multiplication mt = (num) -> {
		   for(int i = 1; i <= 9; i++) {
               System.out.println(num + " x " + i + " = " + (num * i));
		   }
	   };
	   mt.multipl(10);
      
//      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//      입력 예시1)
//      10, 20, "+"
//      
//      출력 예시1)
//      30
      
//      입력 예시2)
//      10, 20, "-"
//      
//      출력 예시2)
//      -10
	   FourBasic fb = (num1, num2, str) -> {
		   String result = "";
		   int numberResult = 0;
		   if(str.equals("+")) {
			   System.out.println(num1 + num2);
		   }else if(str.equals("-")) {
			   System.out.println(num1 - num2);
		   }else if(str.equals("x")) {
			   System.out.println(num1 * num2);
		   }else if(str.equals("/")) {
			   System.out.println((double)num1 / num2);
		   }else {
			   System.out.println("틀린 연산자 입니다. 다시 입력해주세요.");
		   }
	   };
	   		fb.basci(35, 20, "/");
	   		
	   		
      
//      3. 배열에 10개의 무작위 정수를 전달하면,
//      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//      입력 예시)
//      {10, 3, 7, 8, 0, 9}
      
//      출력 예시)
//      {10, 9, 8, 7, 3, 0}
	   		
	   	BigSmall bigsmall = () -> {
	   		int arr[] = {
	   			(int)(Math.random() * 10)
	   		};
	   		for(int i = 0; i < 10; i++) {
	   			
	   		}
	   	};
      
   }
}









