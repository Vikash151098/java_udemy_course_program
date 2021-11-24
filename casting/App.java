package casting;

public class App {

	public static void main(String[] args) {
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);

//		int a = 129;
//		byte b = (byte) a;
//		int c = Byte.MIN_VALUE + (a - Byte.MAX_VALUE - 1);
//
//		long l = 10000000000L;
//
//		int p = (int) l;
//
//		System.out.println(b);
//		System.out.println(c);
//
//		System.out.println(p);

		StringBuilder sbs = new StringBuilder("");
		for (int i = 0; i < 10000; i++) {
			char ch = (char) ('a' + i % 26);
			sbs.append(ch);
		}
		System.out.println(sbs.toString());

		String s = "cabcccddd";
		StringBuilder sb = new StringBuilder(sbs);
		long start = System.currentTimeMillis();
		int i = 0;
		String prev = "";
		long total = 1;
		while (i < sb.length() - 1) {
			int j = i + 1;
			int count = 0;
			while (j < sb.length()) {
				if (sb.substring(i, i + 1).contains(sb.substring(j, j + 1))) {
					if (prev.contains(sb.substring(j, j + 1))) {
						count++;
					} else {
						count += 2;
					}
					prev = sb.substring(j, j + 1);
					sb.delete(j, j + 1);
					j--;
				}
				j++;
			}
			if (count > 0) {
				total = total % 1000000007 * count;
				count = 0;
			}

			i++;
		}
		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		System.out.println(sb.toString());
		System.out.println(total);

	}

}
