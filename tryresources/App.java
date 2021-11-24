package tryresources;

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("closing.");
		throw new Exception("oh no");

	}

}

public class App {

	public static void main(String[] args) {
		try (Temp temp = new Temp()) {
			System.out.println("running");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
