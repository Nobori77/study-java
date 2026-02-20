package inheritanceTask;


//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다

class Person{
	String name;
	int age;
	String adress;
	String number;
	
	public Person() {;}

	public Person(String name, int age, String adress, String number) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.number = number;
	}
	
	void work() {
		System.out.println("일 하는중");
	}
	void sleep() {
		System.out.println("잠을 잔다");
		System.out.println("==================\n");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
	
	void result() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("주소:" + this.adress);
		System.out.println("번호:" + this.number);
		System.out.println("======하루 루틴=====");
	}
	
}
//   
//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
class Student extends Person{
	String id;
	
	public Student() {;}

	public Student(String name, int age, String adress, String number, String id) {
		super(name, age, adress, number);
		this.id = id;
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다");
	}
	
	@Override
	void sleep() {
		System.out.println("수업시간에 잠을 잔다");
		System.out.println("==================\n");
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	
	@Override
	void result() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("주소:" + this.adress);
		System.out.println("번호:" + this.number);
		System.out.println("인스타 아이디:" + this.id);
		System.out.println("======하루 루틴=====");
	}
	
}
//   
//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
class Employee extends Person{
	int slushFund;
	
	public Employee() {;}

	public Employee(String name, int age, String adress, String number, int slushFund) {
		super(name, age, adress, number);
		this.slushFund = slushFund;
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
		System.out.println("==================");
	}
	
	@Override
	void work() {
		System.out.println("하루종일 일을한다");
	}
	
	@Override
	void result() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("주소:" + this.adress);
		System.out.println("번호:" + this.number);
		System.out.println("비상금:" + this.slushFund + "만원");
		System.out.println("======하루 루틴=====");
	}
}


//   
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
   public static void main(String[] args) {
	//   InhertanceTask에서
	//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기
	   
	   Person person = new Person ("홍아무개", 20, "서울시 용산구", "010-1234-1234");
	   Student student = new Student ("김아무개", 15, "서울시 강남구", "010-1111-1111", "kim_1004");
	   Employee employee = new Employee ("박아무개", 30, "서울시 중랑구", "010-2222-2222", 40);
	   
	   System.out.println("Person\n");
	   person.result();
	   person.work();
	   person.eat();
	   person.sleep();
	   
	   System.out.println("Student\n");
	   student.result();
	   student.work();
	   student.eat();
	   student.sleep();
	   
	   System.out.println("Employee\n");
	   employee.result();
	   employee.work();
	   employee.eat();
	   employee.sleep();
   }
}

