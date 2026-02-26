package objectTest;

import java.util.Objects;

public class User {
	private Long id;
	private String name;
	
	public User() {;}

	User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	toString() : 해당 객체의 필드를 확인하기 위한 용도
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

//	hashcode() : 
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

//	equals를 재정의
//	Long id 필드를 비교하자 
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
