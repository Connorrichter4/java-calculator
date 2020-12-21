package calculator.operations;

final public class AddOperation {
	int a, b;
	
	public void setA(int input) {
		this.a = input;
	}
	public void setB(int input) {
		this.b = input;
	}
	
	public int getResult() {
		return this.a + this.b;
	}
}
