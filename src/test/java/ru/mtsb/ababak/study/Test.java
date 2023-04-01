package src.test.java.ru.mtsb.ababak.study;

import src.main.java.ru.mtsb.ababak.study.utils.SumTextNumber;

public class Test {

	public static void main(String[] args) {
		test("SumTextNumber. Case 1", SumTextNumber.execute("Hello 10 world") == 10);
		test("SumTextNumber. Case 2", SumTextNumber.execute("khjsd784,3hd87.2s d-8fsdf8") == 871.5);
		//System.out.println(SumTextNumber.execute("khjsd784,3hd87.2s d-8fsdf8"));
	}

	public static void test(String name, boolean expression) {
		if (expression)
			System.out.println("OK - " + name);
		else
			System.err.println("ERROR - " + name);
	}
}
