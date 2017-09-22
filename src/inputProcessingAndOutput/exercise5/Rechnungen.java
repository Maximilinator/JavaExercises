package inputProcessingAndOutput.exercise5;

public abstract class Rechnungen {

	private double number1 = 0;
	private double number2 = 0;

	@Override
	public String toString() {
		return "Variable a = " + number1 + "\n" + "Variable b = " + number2 + "\n" + number1 + " + " + number2 + " = "
				+ summe() + "\n" + number1 + " - " + number2 + " = " + differenz() + "\n" + number1 + " * " + number2
				+ " = " + produkt() + "\n" + number1 + " : " + number2 + " = " + quotient();
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double summe() {
		return number1 + number2;
	}

	public double differenz() {
		return number1 - number2;
	}

	public double produkt() {
		return number1 * number2;
	}

	public double quotient() {
		return number1 / number2;
	}

}
