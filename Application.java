class Product {
	int pid;
}

public class Application {

	public static void main(String[] args) {
		//
		byte myByte = 127;
		int myNumber = 678;
		short myShort = 2312;
		long myLong = 12312312123123123L;
		double myDouble = 212.32;
		float myFloat = 213.23f;
		char myChar = 'a';
		boolean myBoolean = true;

		// Non-Primitive Data Type
		String s = "Vikash Kumar";
		int a[] = new int[20];
		Product p = null;

		int rev = Integer.rotateLeft(254876, 2);
		System.out.print("reverse is:" + rev);

		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);

		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);

		System.out.println(myByte);

		System.out.println("Hello World");

	}

}
