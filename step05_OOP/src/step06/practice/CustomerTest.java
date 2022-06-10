package step06.practice;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		System.out.println();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
