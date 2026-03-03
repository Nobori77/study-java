package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamTest2 {
	public static void main(String[] args) {
//		collect(), Collectors
//		Stream 객체의 형변환
		
//		ArrayList -> String
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
		
		System.out.println(datas1);
		System.out.println("======================");
		
		String str = datas1.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(str);
		System.out.println("======================");
		
//		mapToObj: 기본 자료형 -> 클래스형 자료형으로 형변환시켜주는 스트림 메서드
//		.join("");
		
		String data = "ABCDEF";
//		"abcdef"
		String str2 = data
			.chars() // IntStream
			.map((c) -> c + 32) // IntStream
			.mapToObj((c) -> (char)c) // Stream<Character>
			.map(String::valueOf)
			.collect(Collectors.joining(","));
		
		System.out.println(str2);
		System.out.println("======================");
		
//		IntStream -> ArrayList
//		(1)
		ArrayList<Integer> datas2 = (ArrayList)IntStream
			.range(0, 10)
			.mapToObj((n) -> Integer.valueOf(n))
			.collect(Collectors.toList());
		
		System.out.println(datas2);		
		System.out.println("======================");
		
//		(2)
		List<Integer> datas3 = IntStream
				.range(0, 10)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(datas3);
		System.out.println("======================");
		
		
		
	}
}
