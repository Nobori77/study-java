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
	boolean engineOn;
	boolean engineOff;
	
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
			   System.out.println("엔진이 켜졌습니다. ");
		   } else if (choice == 2) {
			   benz.engine = false;
			   System.out.println("엔진이 꺼졋습니다. ");
		   }else {
			   System.out.println("잘못 선택하셧습니다. ");
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