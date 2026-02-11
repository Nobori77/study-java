package whileTest;

import java.util.Scanner;

public class WhileTest {
   public static void main(String[] args) {
//      다마고치 키우기
//      HP: (0/5)
//      이름:
      
//      1. 밥을 안주면 죽는다.
//      2. 밥을 주면 HP가 5가 된다.
//      3. 행동 1번당 HP1가 1씩 줄어든다.
//      4. 만족도 10을 채우면 게임이 종료
      
//      행동 
//      1) 놀아주기
//      2) 훈육하기
//      3) 생각하는 의자에 앉히기
//      4) 회초리 들기
//      5) 잠자기
//      6) 씻겨주기
//      7) 노래불러주기
//      8) 운동시키기
      Scanner sc = new Scanner(System.in);
      String message = "※※※※※※※※※※※※※※※※※※※※※※※※※※※\n"
            + "어서오세요~ 다마고치 키우기!༼ つ ◕_◕ ༽つ\n"
            + "※※※※※※※※※※※※※※※※※※※※※※※※※※※",
            nameMessage = "타마 이름을 정해주세요",
            exampleMessage = "캐릭터를 선택하세요.\n"
                  + "1. 이규학 ^(*￣(oo)￣)^\n"
                  + "2. 감대훈 (⓿_⓿)\n"
                  + "3. 예스규호 ( ͡~ ͜ʖ ͡°)\n"
                  + "4. 썬윤성 ヾ(⌐■_■)ノ♪\n"
                  + "5. 유줌 (∪.∪ )...zzZ",
                  kh = " ^(*￣(oo)￣)^",
                  dh = "(⓿_⓿)",
                  gh = "( ͡~ ͜ʖ ͡°)",
                  sun = "ヾ(⌐■_■)ノ♪",
                  yj = "(∪.∪ )...zzZ",
      			  tama = null, tamaName = null;
      
      
      int choice = 0, hp = 5, maxHp = 5, happy = 0, action = 0;
      boolean flag = false;
      
//    사용자 캐릭터 선택
      while(true) {
    	  System.out.println(message);
    	  System.out.println(exampleMessage);
      
    	  choice = sc.nextInt();
    	  
    	  if(choice < 1 || choice > 5) {
    		  System.out.println("잘못 입력했습니다.");
    	  }else {
    		  break;
    	  }
      }
      
      switch (choice) {
      case 1: {
		tama = kh;
		break;
	}
      case 2: {
		tama = dh;
		break;
	}
      case 3: {
		tama = gh;
		break;
	}
      case 4: {
		tama = sun;
		break;
	}
      case 5: {
		tama = yj;
		break;
	}
      default:
		break;
	}
      
      System.out.println(nameMessage);
      tamaName = sc.next();
      
      
      while(true) {
    	  System.out.printf("%s %s\nhp:(%d/%d) 만족도:%d점", tamaName, tama, hp, maxHp, happy);
    	  System.out.println("행동을 입력하세요.\nex) "
    			  +"1. 놀아주기\n"
    			  +"2. 훈육하기\n"
    			  +"3. 생각하는 의자에 앉히기\n"
    			  +"4. 노래 부르기\n"
    			  +"5. 잠자기\n"
    			  +"6. 운동시키기");
    	  
    	  action = sc.nextInt();
    	  switch(action) {
    	  case 1:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "가 즐거워합니다😁");
    		  System.out.println("=============================");
    		  happy += 1;
    		  break;
    	  case 2:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "이(가) 말로 얻어 맞습니다.😂");
    		  System.out.println("=============================");
    		  hp--;
    		  happy--;
    		  break;
    	  case 3:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "이(가) 벽을 보고 않습니다.🤢");
    		  System.out.println("=============================");
    		  happy--;
    		  break;    		  
    	  case 4:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "이(가) 열창을 하고있습니다.🤣");
    		  System.out.println("♬ 슈슈슈 슈퍼 노바 ~ ♬");
    		  System.out.println("=============================");
    		  happy--;
    		  break;
    	  case 5:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "이(가) 꿈나라로 갑니다...zZzZz");
    		  System.out.println("=============================");
    		  happy++;
    		  break; 
    	  case 6:
    		  System.out.println("=============================");
    		  System.out.println(tamaName + "이(가) 헬스장을 갑니다.🏋️‍♀️");
    		  System.out.println("=============================");
    		  hp += 2;
    		  happy++;
    		  break; 
    	  default:
    		  System.out.println("다시 입력하세요.");
    		  break;
    	  }
    	  

    	  
    	  hp--;
    	  if(hp < 0) {
    		  flag = true;
    	  }
    	  
    	  if(flag) {
    		  System.out.println(tama + " " + tamaName + "(은)는 갔습니다. 좋은 타마였습니다...🤦‍♂️");
    		  break;
    	  }
    	  
          if(happy >= 10) {
              System.out.println(tama +" " + tamaName + "(은)는 성불하였습니다.👻");
              break;
           }
           
      }
      
      
      
      
      
      
      
   }
}






