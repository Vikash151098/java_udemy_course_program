package enumDemo;

public class App {
//	public static final int DOG = 0;
//	public static final int CAT = 1;
//	public static final int MOUSE = 2;

	public static void main(String[] args) {
		Animal animal = Animal.DOG;
		switch (animal) {
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			System.out.println("dog");
			break;
		case MOUSE:
			System.out.println("mouse");
			break;
		default:
			break;

		}

		System.out.println(Animal.CAT);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);

		System.out.println(Animal.CAT.getName());
	}

}
