package prob06;

public class Add extends Arithmatic {
	public Add(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate(){
		return (this.a + this.b);
	}
}
