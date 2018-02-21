package prob06;

public class Sub extends Arithmatic {
	public Sub(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	protected int calculate() {
		// TODO Auto-generated method stub
		return (this.a - this.b);
	}

}
