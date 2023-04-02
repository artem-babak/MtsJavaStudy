package src.main.java.ru.mtsb.ababak.study.figure;

public class Cube extends Figure {

	private double length;

	//вариант реализации когда у родителя нет дефолтного контруктора
	public Cube(double weight, double length) {
		super(weight, Cube.calcValue(length));
		setLength(length);
	}

	private static double calcValue(double length) {
		return (Math.pow(length, 3));
	}

	private static double calcLength(double value) {
		return Math.cbrt(value);
	}

	@Override
	public void setValue(double value) {
		super.setValue(value);
		length = calcLength(value);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		super.setValue(calcValue(length));
	}

}
