package src.main.java.ru.mtsb.ababak.study;

import src.main.java.ru.mtsb.ababak.study.utils.SumTextNumber;

public class Application {
	public static void main(String[] args) {
		if (args == null || args.length < 1) return;
		System.out.println(SumTextNumber.execute(args[0]));
	}
}
