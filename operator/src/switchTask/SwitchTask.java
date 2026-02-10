package switchTask;

import java.util.Scanner;

public class SwitchTask {
   public static void main(String[] args) {
//      계절 맞추기
//      12 1 2 겨울
//      3 4 5 봄
//      6 7 8 여름
//      9 10 11 가을 
//      사용자가 입력한 값의 계절을 맞추는 코드 작성
//      사용자 입력: 9
//      출력 예시: 가을
	   Scanner sc = new Scanner(System.in);
	   String message = "1부터 12까지 숫자를 입력하세요",
			  wether ="",
			  spring = "봄",
			  summer = "여름",
			  fall = "가을",
			  winter = "겨울",
			  result ="%d월은 %s 입니다.";
	   
	   int choice = 0;
	   
	   System.out.println(message);
	   choice = sc.nextInt();
	   
	   switch(choice) {
	   case 1:
		   wether = winter;
		   System.out.printf(result, choice, wether);
		   break;
	   case 2:
		   wether = winter;
		   System.out.printf(result, choice, wether);
		   break;
	   case 3:
		   wether = spring;
		   System.out.printf(result, choice, wether);
		   break;
	   case 4:
		   wether = spring;
		   System.out.printf(result, choice, wether);
		   break;
	   case 5:
		   wether = spring;
		   System.out.printf(result, choice, wether);
		   break;
	   case 6:
		   wether = summer;
		   System.out.printf(result, choice, wether);
		   break;
	   case 7:
		   wether = summer;
		   System.out.printf(result, choice, wether);
		   break;
	   case 8:
		   wether = summer;
		   System.out.printf(result, choice, wether);
		   break;
	   case 9:
		   wether = fall;
		   System.out.printf(result, choice, wether);
		   break;
	   case 10:
		   wether = fall;
		   System.out.printf(result, choice, wether);
		   break;
	   case 11:
		   wether = fall;
		   System.out.printf(result, choice, wether);
		   break;
	   case 12:
		   wether = winter;
		   System.out.printf(result, choice, wether);
		   break;
	   default :
		   System.out.println("잘못 입력하셧습니다");
		 break;
	   }
	   
	   
//	      Scanner sc = new Scanner(System.in);
//	      String message = "월을 입력하세요.\nex)10", seasonResult = "";
//	      int month = 0, season = 0;
//	      
//	      System.out.println(message);
//	      month = sc.nextInt();
//	      season = month / 3 % 4;
//	      
//	      if(month > 0 && month < 13) {
//	         switch(season) {
//	         case 0:
//	            seasonResult = month + "월은 겨울입니다.";
//	            break;
//	         case 1:
//	            seasonResult = month + "월은 봄입니다.";
//	            break;
//	         case 2:
//	            seasonResult = month + "월은 여름입니다.";
//	            break;
//	         case 3:
//	            seasonResult = month + "월은 가을입니다.";
//	            break;
//	         default:
//	            System.out.println("잘못 입력하셨습니다.");
//	            break;
//	         }
//	      }else {
//	         System.out.println("잘못 입력하셨습니다.");
//	      }
//	      
//	      
//	      System.out.println(seasonResult);
	   		
   }
}