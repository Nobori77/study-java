package arrayTask;

import java.util.Scanner;

public class ArrayTask05 {
   public static void main(String[] args) {
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//      입력예시)
//      test123!@#
      
//      비밀번호 이외의 특수문자가 나올 수 있음.
//      출력 예시)
//      ???????

//	   먼저 출력
//		패스워드가 입력되면 비밀번호 이외의 특수문자가 나와야함
//	   배열은 같은 인덱스 번호에 값을 넣으면 덮어쓰기가 됌 그러면 그 위 비밀번호가
//	   사라지는거니 이건 X
//	   그렇다면 출력한 비밀번호를 다르게 바꿔줘야 한다는건데 이걸 덮어쓰기 말고 어떻게 만들어야 하지?
//	   그러면 반복문을 사용해서 인덱스값을 확인후 그 인덱스 값을 처리할때 나올 메세지를 바꾸면 되나?
	   
	   
	   Scanner sc = new Scanner(System.in);
	   String message = "비밀번호를 입력하세요",
			  passworld = null;
	   String[] passworldData = null;
	   
	   System.out.println(message);
	   passworld = sc.next();
	   passworldData = new String[passworld.length()];
	   
	   for(int i = 0; i < passworld.length(); i++) {
		   System.out.print("?");
	   }
	   
	   
//	   
//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
      String[] menus = {"아메리카노", "카페라떼", "에이드", "밀크쉐이크"};
      
//      orders의 정수는 menus의 주문 번호입니다.
      int[] orders = {0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0};
      
   }
}
