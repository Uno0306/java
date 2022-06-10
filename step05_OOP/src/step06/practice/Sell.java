package step06.practice;

public interface Sell {
	default void order() {
		System.out.println("Sell Order");
	}
	
	void sell();
}
