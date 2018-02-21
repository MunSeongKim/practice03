package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			String input = scanner.nextLine();

			if("quit".equals( input )){
				break;
			}
			
			String[] exp = input.split(" ");
			
			if( exp.length != 3 ) {
				System.out.println(" 알 수 없는 식입니다.");
				continue;
			}
			
			Arithmatic a = null;
			switch(exp[1]){
				case "+":
					a = new Add(Integer.parseInt(exp[0]), Integer.parseInt(exp[2]));
					System.out.println(a.calculate());
					break;
				case "-":
					a = new Sub(Integer.parseInt(exp[0]), Integer.parseInt(exp[2]));
					System.out.println(a.calculate());
					break;
				case "*":
					a = new Mul(Integer.parseInt(exp[0]), Integer.parseInt(exp[2]));
					System.out.println(a.calculate());
					break;
				case "/":
					a = new Div(Integer.parseInt(exp[0]), Integer.parseInt(exp[2]));
					System.out.println(a.calculate());
					break;
				default:
					System.out.println(" 알 수 없는 연산자입니다.");
					break;
				/*  코드를 완성 합니다 */
			}
			
			
			
		}
		
		scanner.close();

	}

}
