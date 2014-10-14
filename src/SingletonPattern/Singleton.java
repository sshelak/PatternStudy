package SingletonPattern;

/*
 * Singleton 패턴이란?
 * 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패
 */
public class Singleton {
	
	// 싱글톤 클래스의 유일한 인스턴스를 저장하기 위한 정적 변수
	private static Singleton uniqueInstance;
	
	// 기타 인스턴스 변수
	
	// 생성자를 private로 선언했기 때문에 싱글톤에서만 클래스의 인스턴스를 만들 수 있다.
	private Singleton() {}
	
	// getInstance() 메소드에서는 클래스의 인스턴스를 만들어서 리턴해 줌.
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	// 기타 메소드
	
	
	
	// 멀티쓰레드에서 위 메서드에 문제 발생 가능성이 있음.
	// 동기화(synchronized)로 해결 가능하지만.. 속도 문제를 감수해야 함.
	/*
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	*/

	// 여러가지 해결 방법
	// 1. 속도가 중요하지 않다면 그냥 놔둠
	//  : 메서드를 동기화(synchronized)하면 속도는 100배 느려짐을 이해할
	
	// 2. 인스턴스를 필요할 때 생성하지 말고, 처음부터 만들어 버린다. 
	/*
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	*/
	
	// 3. "DCL(Double Checking Locking)"을 써서 getInstance()에서 동기화되는 부분을 줄인다.
	//  : volatile 키워드를 사용하면 멀티쓰레딩을 쓰더라도 uniqueInstance 변수가 Singleton 인스턴스로
	//  : 초기화되는 과정이 올바륵 진행될 수 있도록 할 수 있다
	//  : java5 이상에서면 사용 가능
	/*
	private static volatile Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstatnce = new Singleton();
				}				
			}
		}
		return uniqueInstance;
	}
	*/
	
}
