package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
   public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		
		String message = "숫자를 입력하세요";
		int infintyNum = 0, total = 0;
		
		System.out.println(message);
//		무한 입력 상태 만들기
//		입력 받은 값 모두 더하는 상태 만들기
		while(true) {
			infintyNum = sc.nextInt();
			
			total += infintyNum;
			
			if (total >= 100) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");	   
	   
      
   }
}
