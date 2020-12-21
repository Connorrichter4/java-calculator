package calculator.operations;

public class DivOperation {
	double a, b;
	
	public void setA(int input) {
		this.a = input;
	}
	public void setB(int input) {
		this.b = input;
	}
	
	public double getResult() {
		return this.a / this.b;
	}
}
