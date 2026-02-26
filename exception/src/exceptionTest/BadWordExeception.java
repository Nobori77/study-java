package exceptionTest;

// RunttimeException 컴파일러가 검사하지 않는다.
public class BadWordExeception extends RuntimeException{
	public BadWordExeception() {;}
	public BadWordExeception(String message) {
		super(message);
	}
	
}
