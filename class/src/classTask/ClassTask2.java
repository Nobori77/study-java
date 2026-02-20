package classTask;

import java.util.Scanner;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔

class SuperCar {
	String brand;
	String color;
	int price;
	String password;
	static int errorPassword;
	boolean engine;
	
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	스태틱 블럭
	static {
		System.out.println("비밀번호를 입력하세요");
	}
//	초기화 블럭
	{
		this.password = "asd123!@";
	}
	
}
	


public class ClassTask2 {
   
   public static void main(String[] args) {
//   1. 슈퍼차 객체화
	   Scanner sc = new Scanner(System.in);
	   String passWord = null;
	   int choice = 0;
	   SuperCar benz = new SuperCar("벤츠", "black", 90_000_000);
	   
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
	   
	   while(true) {
	   passWord = sc.next();
	   if(passWord.equals(benz.password)) {
		   System.out.println("환영합니다");
		   System.out.println("1. 엔진 on");
		   System.out.println("2. 엔진 off");
		   
		   choice = sc.nextInt();
		   
		   if (choice == 1){
			   benz.engine = true;
			   System.out.println("엔진이 켜졌습니다.");
		   } else if (choice == 2) {
			   benz.engine = false;
			   System.out.println("엔진이 꺼졋습니다.");
		   }else {
			   System.out.println("잘못 선택하셧습니다.");
		   }
		   
		   break;
	   }else {
		   SuperCar.errorPassword++;
		   System.out.printf("비밀번호 %d회 오류 다시 입력해주세요\n", SuperCar.errorPassword);
		   
//   3. 비밀번호 3회 오류시 경찰 출동
		if(SuperCar.errorPassword >= 3) {
			System.out.println("비밀번호 3회 오류로 경찰 출동!");
			break;
		}
	  }
	 }
   }

}


//package classTask;
//
//import java.util.Scanner;
//
//class SuperCar {
//   String brand;
//   String color;
//   long price;
//   String password;
//   int errorCount;
//   boolean engine;
//
//   public SuperCar() {;}
////   오버로딩
//   public SuperCar(String brand, String color, long price) {
//      this.brand = brand;
//      this.color = color;
//      this.price = price;
//   }
//   public SuperCar(String brand, String color, long price, String password) {
//      this.brand = brand;
//      this.color = color;
//      this.price = price;
//      this.password = password;
//   }
//   
////   스태틱 블럭
//   static {
//      System.out.println("출고 축하드립니다!");
//   }
//   
////   초기화 블럭
//   {
//      this.password = "0000";
//   }
//   
//   void engineStart() {
//      this.engine = true;
//   }
//   
//   void engineStop() {
//      this.engine = false;
//   }
//   
//   boolean checkPassword(String password) {
//      return this.password.equals(password);
//   }
//}
//
//// 슈퍼카(SuperCar) 클래스 생성
//// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
//public class ClassTask2 {
//   public static void main(String[] args) {
//      
//      Scanner sc = new Scanner(System.in);
//      String message1 = "비밀번호를 입력하세요.\nex)1234", 
//            message2 = "1. 엔진 켜기\n2. 엔진 끄기",
//            password = null;
//      int choice = 0;
//      
//      
//   //   1. 슈퍼차 객체화
//      SuperCar bugatti = new SuperCar("부가티", "블루", 14_000_000_000L);
//      
//      while(true) {
////         2. 비밀번호를 입력,
//         System.out.println(message1);
//         password = sc.next();
//         
//         if(bugatti.checkPassword(password)) {
//            System.out.println("비밀번호 일치");
////            비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//            
//            System.out.println(message2);
//            choice = sc.nextInt();
//            
//            if(choice == 1) {
//               if(!bugatti.engine) {
//                  System.out.println("시동이 켜졌습니다.");
//                  bugatti.engineStart();
//               }else{
//                  System.out.println("이미 시동이 켜져있습니다.");
//               }
//               
//            }else if(choice == 2) {
//               if(bugatti.engine) {
//                  System.out.println("시동이 꺼졌습니다.");
//                  bugatti.engineStop();
//               }else{
//                  System.out.println("이미 시동이 꺼져있습니다.");
//               }
//               
//            }else {
//               System.out.println("잘못 입력했습니다.\n처음부터 다시 입력하세요.");
//            }
//            
//            
//         }else {
////            3. 비밀번호 3회 오류시 경찰 출동
//            if(bugatti.errorCount > 1) {
//               System.out.println("경찰 출동!");
//               break;
//            }
//            System.out.println("비밀번호 틀림");
//            bugatti.errorCount++;
//         }
//         
//      }
//      
//      
//      
//      
//   
//      
//      
//      
//      
//      
//   }
//
//}














