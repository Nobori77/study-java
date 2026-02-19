package classTest;

public class StaticTest {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {

		StaticTest st = new StaticTest();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st = new StaticTest();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		
//		System.gc();
		
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		st = new StaticTest();
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
		
	}
}
