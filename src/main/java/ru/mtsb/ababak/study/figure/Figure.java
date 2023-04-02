package src.main.java.ru.mtsb.ababak.study.figure;

public class Figure {

	private double weight;
	private double value;
	private double density;

	public Figure(double weight, double value) {
		this.weight = weight;
		this.value = value;
		density = calcDensity();
	}

	Figure() {
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		density = calcDensity();
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		density = calcDensity();
	}

	public double getDensity() {
		return density;
	}

	private double calcDensity() {
		return (value == 0) ? 0 : (weight / value);
	}

}
