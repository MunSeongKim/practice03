package prob06;

public abstract class Arithmatic {
	protected int a;
	protected int b;
	
	protected void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	protected abstract int calculate();
}
