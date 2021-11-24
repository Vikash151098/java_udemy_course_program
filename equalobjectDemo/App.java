package equalobjectDemo;

class Person {
	int id;
	String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class App {

	public static void main(String[] args) {
		Person p1 = new Person(4, "bob");
		Person p2 = new Person(4, "bob");

		System.out.println(p1.equals(p2));

		Double value1 = 2.2;
		Double value2 = 2.2;
		System.out.println(value1.equals(value2));

		Integer num1 = 5;
		Integer num2 = new Integer(5);
		System.out.println(num1.equals(num2));

		String str1 = "hello";
		String str2 = "helloasdasd".substring(0, 5);
		System.out.println(str1.equals(str2));

	}

}
