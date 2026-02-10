package inputTask;

// Ctrl + shift + O

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		// Snanner를 사용하여, 두 정수를 입력 받고
		// 덧셈 결과를 출력하시오
		// 단 next() 만 사용
		
		Scanner sc = new Scanner(System.in);
//		String message = "덧셈할 숫자를 입력하세요. \nex)3 5",
//				num = null,
//				num2 = null,
//				text = "입니다";
//		
//		int num3 = 0, num4 = 0, numResult = 0;
//		
//		System.out.println(message);
//		
//		num = sc.next();
//		num2 = sc.next();
//		
//		num3 = Integer.parseInt(num);
//		num4 = Integer.parseInt(num2);
//		
//		numResult  = (int)(num3 + num4);
//		
//		System.out.println((numResult) + text);
		
		
	      String message = "두 정수를 입력하세요.\nex)10 20",
	              result = "%d + %d = %d";
	        int num1 = 0, num2 = 0;
	        
	        System.out.println(message);
	        num1 = Integer.parseInt(sc.next());
	        num2 = Integer.parseInt(sc.next());
	        System.out.printf(result, num1, num2, num1 + num2);
	     }
	}

