class Person {
	public final static int LUCKY_NUMBER = 7;
	private String name;
	private int age;
	private static String surename;

	final public int getLucky() {
		return LUCKY_NUMBER;
	}

	public Person() {
		this("", 0);
		System.out.println("0 parameterised constructor called");
	}

	public Person(String name) {
		this(name, 0);
		System.out.println("1 parameterised constructor called");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("2 parameterised constructor called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getSurename() {
		return surename;
	}

	public static void setSurename(String surename) {
		Person.surename = surename;
	}

}

public class App {

	public static void main(String[] args) {

		Person p = new Person("vikash", 22);
		Person p1 = new Person("rakesh", 23);
//		p.setSurename("kumar");
//		p1.setSurename("k");
		System.out.println("Name : " + p.getName() + " " + p.getSurename() + " \nAge : " + p.getAge());
		System.out.println("Name : " + p1.getName() + " " + p1.getSurename() + " \nAge : " + p1.getAge());
		System.out.println(Person.LUCKY_NUMBER);
		System.out.println(Math.PI);
		System.out.println(p.getLucky());

	}

}
