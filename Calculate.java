public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int min = first - second;
		int ymn = first * second;
		int del = first / second;
		int xor = first ^ second;
		char c = 'c';
		short s = 125;
		long l = 123456789;
		float f = 1.2f;
		double d = 123.456;
		System.out.println("Summ " + summ);
		System.out.println("- " + min);
		System.out.println("* " + ymn);
		System.out.println("/ " + del);
		System.out.println("^ " + xor);
		System.out.println(c + " " + s + " " + l + " " + f + " " + d);
	}
}