
public class StringBuilderDemo {
	public static void main(String[] args) {
		int n = 10000000;

		String s = "";
		long start = System.currentTimeMillis();
		// unefficient method
//		for (int i = 1; i <= n; i++) {
//			s += i;
//		}

		// efficient method
		StringBuilder sb = new StringBuilder("");
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}

		long end = System.currentTimeMillis();
		System.out.println("total time in milisecond : " + (double) (end - start) / 1000);
//		System.out.println(s);
	}

}
