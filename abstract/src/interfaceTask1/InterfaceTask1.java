package interfaceTask1;

//사람
//이름, 나이
//먹기, 등교하기, 회사가기

//학생(Student), 직장인(Employee), 백수(UnEmployee)
//강제성 Adapter Class를 활용해서 없애고,
//필요한 메서드만 구현하기

public class InterfaceTask1 {
    public static void main(String[] args) {

        PersonActionAdapter s = new Student("학생1", 17);
        PersonActionAdapter e = new Employee("직장인1", 29);
        PersonActionAdapter u = new UnEmployee("백수1", 35);

        System.out.println(s.getName() + " / " + s.getAge());
        s.eat();
        s.goSchool();

        System.out.println(e.getName() + " / " + e.getAge());
        e.eat();
        e.goWork();

        System.out.println(u.getName() + " / " + u.getAge());
        u.eat();
    }
}