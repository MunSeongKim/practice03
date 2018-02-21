package prob06;

public class Div extends Arithmatic {
	public Div(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	protected int calculate() {
		// TODO Auto-generated method stub
		if( b == 0 ) {
			System.out.println("Cannot calculate for divide");
			return 0;
		}
		
		return (this.a / this.b);
	}

}
