package prob06;

public class Mul extends Arithmatic {
	public Mul(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	protected int calculate() {
		// TODO Auto-generated method stub
		return (this.a * this.b);
	}

}
