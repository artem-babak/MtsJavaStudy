package src.test.java.ru.mtsb.ababak.study;

import src.main.java.ru.mtsb.ababak.study.figure.Cube;
import src.main.java.ru.mtsb.ababak.study.figure.Figure;
import src.main.java.ru.mtsb.ababak.study.figure.Sphere;
import src.main.java.ru.mtsb.ababak.study.utils.SumTextNumber;

public class Test {
	/**
	 * Unit тестирование. Резултаты выводятся в консоль.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		testSumTextNumber();
//		System.out.println(SumTextNumber.execute("khjsd784,3hd87.2s d-8fsdf8"));

//		testDensityCalc();
//		DensityCalc.executeStr(700,2);

		testFigureDensityCalc();
	}

	/**
	 * Тестирование утилиты SumTextNumber()
	 */
	private static void testSumTextNumber() {
		test("SumTextNumber. Case 1.", SumTextNumber.execute("Hello 10 world") == 10);
		test("SumTextNumber. Case 2.", SumTextNumber.execute("khjsd784,3hd87.2s d-8fsdf8") == 871.5);
	}

	/**
	 * Тестирования задачи рассчета плотности фигуры.
	 * Расчет плотности сферы и куба из разных материалов.
	 */
	public static void testFigureDensityCalc() {
		Figure sphere1 = new Sphere(500, 1);
		test("FigureDensityCalc. Case 1. Sphere.", sphere1.getDensity() == 119.36620731892151);
		Figure cube1 = new Cube(500, 1);
		test("FigureDensityCalc. Case 1. Cube.", cube1.getDensity() == 500.0);
		Figure figure1 = new Figure(500, 1);
		test("FigureDensityCalc. Case 1. Figure.", figure1.getDensity() == 500.0);

		Figure sphere2 = new Sphere(700, 2);
		test("FigureDensityCalc. Case 2. Sphere.", sphere2.getDensity() == 20.889086280811267);
		Figure cube2 = new Cube(700, 2);
		test("FigureDensityCalc. Case 2. Cube.", cube2.getDensity() == 87.5);
		Figure figure2 = new Figure(700, 2);
		test("FigureDensityCalc. Case 2. Figure.", figure2.getDensity() == 350.0);

		Figure sphere3 = new Sphere(0, 0);
		test("FigureDensityCalc. Case 3. Sphere.", sphere3.getDensity() == 0);
		Figure cube3 = new Cube(0, 0);
		test("FigureDensityCalc. Case 3. Cube.", cube3.getDensity() == 0);
		Figure figure3 = new Figure(0, 0);
		test("FigureDensityCalc. Case 3. Figure.", figure3.getDensity() == 0);
	}

//	/**
//	 * Тестирование утилиты DensityCalc()
//	 */
//	private static void testDensityCalc() {
//		double[] res;
//		res = DensityCalc.execute(500, 1);
//		test("DensityCalc. Case 1. Sphere.", res[0] == 119.36620731892151);
//		test("DensityCalc. Case 1. Cube.", res[1] == 500.0);
//
//		res = DensityCalc.execute(700, 2);
//		test("DensityCalc. Case 2. Sphere.", res[0] == 20.889086280811267);
//		test("DensityCalc. Case 2. Cube.", res[1] == 87.5);
//
//		res = DensityCalc.execute(0, 0);
//		test("DensityCalc. Case 3. Sphere.", res[0] == 0);
//		test("DensityCalc. Case 3. Cube.", res[1] == 0);
//	}

	/**
	 * Тестирование выражение
	 *
	 * @param name       имя тест кейса
	 * @param expression тестируемое выражение
	 */
	public static void test(String name, boolean expression) {
		if (expression)
			System.out.println("OK - " + name);
		else
			System.err.println("ERROR - " + name);
	}
}
