class Frog {
	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		// method 1
//		return id + " :" + name;

		// method 2
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(" :").append(name);
//		
//		return sb.toString();

		// method 3
		return String.format("%-2d:%s", id, name);
	}
}

public class StringDemo {

	public static void main(String[] args) {

		Frog f = new Frog(3, "Frogger");
		System.out.println(f);
	}

}
