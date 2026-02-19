package classTask;

// 스포츠(Sports)

class Sports{
	String name;
	int number;
	String playTime;
	
//	기본 생성자
	public Sports () {;}
	
//	shift + Alt + s -> O
//	초기화 생성자
	
	public Sports (String name, int number, String playTime) {
		this.name = name;
		this.number = number;
		this.playTime = playTime;
	}

	
	
	
}

// 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체화
// 객체화 -> 기본 생성자, 초기화 생성자


public class ClassTask {
	public static void main(String[] args) {
		Sports basketBall = new Sports("농구", 5, "120분");
		Sports baseBall = new Sports("야구", 9, "180분");
		Sports soccer = new Sports("축구", 11, "90분");
		
		System.out.println(baseBall.name);
		System.out.println("총 인원수 : " + baseBall.number + "명");
		System.out.println("플레이 타임 : " + baseBall.playTime);
	}
}
