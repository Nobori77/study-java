package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T> {

//	<?>: 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일 지 알 수 없을 때 사용한다.
//	또한 사용자가 어떤 타입의 데이터를 넣을 지 모르기 때문에
//	객체화를 시킬 때 정해준다.
	T data;
	
	
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
//		CRUD
//		C: Create(추가)
//		R: Read(읽기) == Get
//		U: Update(수정)
//		D: Delete(삭제)
		
		datas.add("노민균");
		datas.add("홍길동");
		datas.add("주몽");
		
		System.out.println(datas);
		System.out.println(datas.get(2));

		String prev = datas.set(2, "김아무개");
		System.out.println(datas);
		
		String removed = datas.remove(2);
		System.out.println(removed);
		System.out.println(datas);
	}
}
