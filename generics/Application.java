package generics;

class Test<T> {
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

}

public class Application {

	static <T> void display(T element) {
		System.out.println(element.getClass().getName() + "=" + element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iobj = new Test<>(67);
		System.out.println(iobj.getObj());

		Test<String> sobj = new Test<>("vikash");
		System.out.println(sobj.getObj());

		display(22);
		display(2.2);
		display("vikash");

	}

}
