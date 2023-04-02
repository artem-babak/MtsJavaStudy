package src.main.java.ru.mtsb.ababak.study.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Утилита извлекает числа из текста. Суммирует извлеченные числа.
 *
 * @author Артем Бабак
 */
public class SumTextNumber {

	/**
	 * Извлекает числа из текста. Суммирует извлеченные числа.
	 *
	 * @param str исходная строка
	 * @return возвращает сумму извлеченных чисел
	 */
	public static double execute(String str) {
		Pattern pattern = Pattern.compile("-?\\d+[.|,]?\\d*", Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(str);
		double sum = 0;
		while (matcher.find())
			sum += Double.parseDouble(matcher.group().replace(",", "."));
		return sum;
	}

}
