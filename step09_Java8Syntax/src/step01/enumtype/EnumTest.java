package step01.enumtype;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Number.values());
		for (Number value : Number.values()) {
			System.out.println(value.getIntNumber());
		}
	}

}
