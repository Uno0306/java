package step06.practice;

public interface Buy {
	default void order() {
		System.out.println("Buy Order");
	}
	
	void buy();
}
