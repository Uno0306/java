package step02.oop;
// 고객
// 고객ID, Name, Grade, BonusPoint, BonusRatio
// calPrice(int price), String showCustomerInfo() - Name, Grade, Point

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// 추가 개발 한다면?
//	private String staffId;
//	private double saleRatio;
	
	//생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer 생성자 호출");
	}
	
	//사용자 정의 생성자
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer 생성자 호출");
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	//showCustomerInfo
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이고, 보너스 포인트는 " +bonusPoint + "입니다.";
	}
	
	//calcPrice
	public int calcPrice(int price) {
		
		// 추가 개발 한다면 ???
//		if("SILVER".equals(customerGrade)) {
//			bonusPoint += price * bonusRatio;
//		}else if("VIP".equals(customerGrade)) {
//			bonusPoint += price * bonusRatio;
//			price -= (int)(price * saleRatio);
//		}
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
}