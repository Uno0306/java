package step06.practice;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}
	
	@Override
	public void order() {
		System.out.println("Customer Order");
	}


}
