package serializationArrayDemo;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5327121684910892141L;
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
