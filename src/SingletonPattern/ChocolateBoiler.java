package SingletonPattern;

public class ChocolateBoiler {
	
	// 고유한 인스턴스를 담기위한 정적 변수 정의
	private static ChocolateBoiler uniqueChocolateBoilerInstatnce; 
	
	private boolean empty;
	private boolean boiled;
	
	// 생성자를 private 처리
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	// 인스턴스 생성이나 전달을 위한 메서드
	public static ChocolateBoiler getInstance() {
		if (uniqueChocolateBoilerInstatnce == null) {
			uniqueChocolateBoilerInstatnce = new ChocolateBoiler();
		}
		return uniqueChocolateBoilerInstatnce;
	}

	public void fill () {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유,초콜릿을 혼합한 재료를 집어 넣
		}
	}
	
	public void drain() {
		// 보일러가 가득 차 있고, 끓여진 상태면 다음단계로 넘김.
		if (!isEmpty() && isBoiled()) {
			// Todo. 끓인재료를 다음 단계로 넘기고 비움처리
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	
}
