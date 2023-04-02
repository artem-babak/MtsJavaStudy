package src.main.java.ru.mtsb.ababak.study.figure;

public class Sphere extends Figure {

	private double radius;

	//вариант релизации когда у родительского класса есть дефолтный контруктор
	public Sphere(double weight, double radius) {
		setRadius(radius);
		setWeight(weight);
	}

	@Override
	public void setValue(double value) {
		super.setValue(value);
		radius = calcRadius(value);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		super.setValue(calcValue(radius));
	}

	private double calcValue(double radius) {
		return (4. / 3 * Math.PI * Math.pow(radius, 3));
	}

	private double calcRadius(double value) {
		return Math.cbrt(3. / 4 * value / Math.PI);
	}

}
