package enumDemo;

public enum Animal {
	CAT("fergus"), DOG("fido"), MOUSE("jerry");

	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

}
